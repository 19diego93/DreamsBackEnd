/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argportfolio.argp2.Security.Repository;

import com.argportfolio.argp2.Security.Entity.Rol;
import com.argportfolio.argp2.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author robst
 */
public interface iRolRepository extends JpaRepository<Rol, Integer>{
  Optional<Rol> findByRolNombre(RolNombre rolNombre);  
}
