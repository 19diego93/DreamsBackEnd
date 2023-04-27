
package com.argportfolio.argp2.Interface;

import com.argportfolio.argp2.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
     //traer lista de personas
    public List<Persona>getPersona();
    
   //guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto que buscamos por ID
    public void deletePersona(Long id);
    
    //buscar una persona por ID
    public Persona findPersona(Long id);
    
}
