/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.dao;

import com.tienda.domain.Categoria;
import com.tienda.domain.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ariel
 */
public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    

      
}
