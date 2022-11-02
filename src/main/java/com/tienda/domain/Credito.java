/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Ariel
 */
@Data
@Entity
@Table(name="credito")
public class Credito implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_credito")
    private Long idCredito;
    
    Integer limite;

    public Credito() {
    }
    
    

    public Credito(Integer limite) {
        this.limite = limite;
    }
    
    
}
