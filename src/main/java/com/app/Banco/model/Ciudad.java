/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
@Table(name="ciudad")
public class Ciudad implements Serializable {
    
   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column( name="codigo_cda", updatable = false, nullable = false)
    private int codigo_cda;
    
    @OneToMany(mappedBy = "cod_ciudad")
    private Set<Cliente>clientes;
    
    @Column (name="nombre_cda")
    private String nombre;

    
 
    
    
    public Ciudad() {
        
    }

    public Ciudad(int codigo, String nombre) {
        this.codigo_cda = codigo;
        this.nombre = nombre;
    }
    
    
    

    public long getCodigo() {
        return codigo_cda;
    }

    public void setCodigo(int codigo) {
        this.codigo_cda = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    

    @Override
    public String toString() {
        return "Ciudad{" + "codigo=" + codigo_cda + ", nombre=" + nombre + '}';
    }
    
   
    
}
