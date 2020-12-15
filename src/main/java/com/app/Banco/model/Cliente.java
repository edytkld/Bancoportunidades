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
import javax.persistence.FetchType;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    
        
    @Id
    @Column (name="cedula_cli")
    private String cedula;
    
    
    
    @OneToOne(mappedBy = "cedula_cli")
    private admCuenta adcedula;
    
    
    
    @OneToMany(mappedBy = "mcedula")
    private List<Movimiento> movs;
    
    @Column (name="nombre_cli")
    private String nombre;
    
    @Column (name="apellido_cli")
    private String apellido;
    
    @Column (name="telefono_cli")
    private String telefono;
    
    @Column (name="direccion_cli")
    private String direccion;
    
  

    @ManyToOne
    @JoinColumn(name="cod_ciudad")
    private Ciudad cod_ciudad;
    
    
    

    
  
    

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, String telefono, String direccion, Ciudad codCiudad) {
       
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cod_ciudad= codCiudad;
        this.cedula= cedula;
    }

    
    
    
    
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad getCod_ciudad() {
        return cod_ciudad;
    }

    public void setCod_ciudad(Ciudad cod_ciudad) {
        this.cod_ciudad = cod_ciudad;
    }

    

    


    

    

    
    
    
    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + ", codCiudad=" + cod_ciudad+ '}';
    }
    
    
}
