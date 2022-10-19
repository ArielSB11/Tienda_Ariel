/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Cliente;
import java.util.List;

/**
 *
 * @author Ariel
 */
public interface ClienteService {
    
    //Los metodos para hacer un CRUD de la tabla cliente
    //Create Read Update Delete
    
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
}
