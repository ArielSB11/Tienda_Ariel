/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author Ariel
 */
public interface CategoriaService {
    
    //Los metodos para hacer un CRUD de la tabla categoria
    //Create Read Update Delete
    
    public List<Categoria> getCategorias(boolean activos);
    
    public Categoria getCategoria(Categoria categoria);
    
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);
    
}
