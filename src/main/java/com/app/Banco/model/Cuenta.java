/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@Table(name="cuenta")
public class Cuenta implements Serializable {
    
    
    @Id
    @Column(name="codigo_cta")
    private int codigo_cta;
    
    
    @OneToOne(mappedBy = "cuenta")
    private admCuenta adcuenta;
    
    @Column(name="nombre_cta")
    private String nombre;
    
    
    @Column (name="estado")
    private  char estado;
    
    
    @OneToMany(mappedBy = "mcod_cuenta")
    private List<Movimiento> movimientos;
    
    

     
   

    public Cuenta() {
    }

    public Cuenta(int codigo_cta, String nombre, char estado) {
        this.codigo_cta = codigo_cta;
        this.nombre = nombre;
        this.estado = estado;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getCodigo_cta() {
        return codigo_cta;
    }

    public void setCodigo_cta(int codigo_cta) {
        this.codigo_cta = codigo_cta;
    }

 

    
   
    @Override
    public String toString() {
        return "Cuenta{" + "codigo=" +codigo_cta + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
