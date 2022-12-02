/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.dao.ClienteDao;
import com.tienda.dao.CreditoDao;
import com.tienda.dao.UsuarioDao;
import com.tienda.domain.Cliente;
import com.tienda.domain.Credito;
import com.tienda.domain.Rol;
import com.tienda.domain.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ariel
 */
@Service
public class UsuarioServiceImpl implements UserDetailsService{
    
    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    @Transactional (readOnly=true)
    public UserDetails loadUserByUsername(String username) 
            throws UsernameNotFoundException {
        Usuario usuario=usuarioDao.findByUsername(username);
        
        if (usuario==null){
            throw new UsernameNotFoundException(username);
        }    
        var roles=new ArrayList<GrantedAuthority>();
        
        for (Rol rol: usuario.getRoles()){
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        return new User(usuario.getUsername(),usuario.getPassword(),roles);
        
        }
    
    }   

