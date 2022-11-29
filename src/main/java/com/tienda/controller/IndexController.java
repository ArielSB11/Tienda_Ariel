/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.dao.ArticuloDao;
import com.tienda.domain.Articulo;
import com.tienda.service.ArticuloService;
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
    private ArticuloService articuloService;

    @GetMapping("/")
    public String inicio(Model model){
        var texto = "Estamos en semana 6";
        
        model.addAttribute("mensaje", texto);
        
        var articulos=articuloService.getArticulos(true);
        
        model.addAttribute("articulos",articulos);
        
        return "index";
    }
}
