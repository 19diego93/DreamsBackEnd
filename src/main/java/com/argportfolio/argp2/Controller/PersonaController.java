package com.argportfolio.argp2.Controller;

import com.argportfolio.argp2.Entity.Persona;
import com.argportfolio.argp2.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://argp-91bf3.web.app")
public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;

    @GetMapping("/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "La persona fue creada";
    }

   @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

   @PreAuthorize("hasRole('ADMIN')")
    // URL:Puerto/personas/editar/{id}?nombre= & apellido= & img=
    @PutMapping("/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("img") String nuevoImg) {
        Persona persona = ipersonaService.findPersona(id);

        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);

        ipersonaService.savePersona(persona);
        return persona;
    }

    @GetMapping("/traer/perfil")
    public Persona findPersona() {
        return ipersonaService.findPersona((long) 1);
    }

}
