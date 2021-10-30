/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ciclo3Hotel.Ciclo3Hotel.Interfaces;

import Ciclo3Hotel.Ciclo3Hotel.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Administrador
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer>  {
    
}

