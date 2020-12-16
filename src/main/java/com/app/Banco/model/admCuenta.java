/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.model;

import java.io.Serializable;
import java.sql.Timestamp;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="admin_cuenta")

public class admCuenta implements Serializable {
    
    
    @Id
    @Column(name="codigo_adm")
    private int cod_cuenta;
    
    
    
    @OneToOne
    @JoinColumn
    private Cuenta cuenta; 
    
    
     @OneToOne
    @JoinColumn(name = "cedula_cli") //referencedColumnName = "adcedula")
    private Cliente cedula_cli;
     
     
     
      @Column(name="fecha_creacion_cta")
      @CreationTimestamp
    private Timestamp fecha_creacion;
      
      
    

    

    
   
   

    public admCuenta() {
        
    }

    public admCuenta(int cod_cuenta, Cliente cedula_cli, Timestamp fecha_creacion, Cuenta cuenta) {
        this.cod_cuenta = cod_cuenta;
        this.cedula_cli = cedula_cli;
        this.fecha_creacion = fecha_creacion;
        this.cuenta = cuenta;
    }
    
    

    public int getCod_cuenta() {
        return cod_cuenta;
    }

    public void setCod_cuenta(int cod_cuenta) {
        this.cod_cuenta = cod_cuenta;
    }

    public Cliente getCedula_cli() {
        return cedula_cli;
    }

    public void setCedula_cli(Cliente cedula_cli) {
        this.cedula_cli = cedula_cli;
    }

    public Timestamp getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Timestamp fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    

  
    
    
    @Override
    public String toString() {
        return "admCuenta{" + "cod_cuenta=" + cod_cuenta + ", cedula_cli=" + cedula_cli + ", fecha_creacion=" + fecha_creacion + '}';
    }
    
    
    
    
    
      
}
