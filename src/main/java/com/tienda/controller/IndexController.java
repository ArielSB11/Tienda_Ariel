/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import com.tienda.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Ariel
 */
@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;

    @GetMapping("/")
    public String inicio(Model model){
        var texto = "Estamos en semana 4";
        
        model.addAttribute("mensaje", texto);
        
        var clientes=clienteDao.findAll();
        
        model.addAttribute("clientes",clientes);
        
        return "index";
    }
}