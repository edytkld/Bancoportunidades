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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="movimiento")
public class Movimiento implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id") 
    private int id;
    
    
    
   @ManyToOne
    @JoinColumn (name="cedula_cli") 
    
    private Cliente mcedula;
    
    
    
     @ManyToOne
    @JoinColumn (name="codigo_cta") 
    private Cuenta mcod_cuenta;
    
  
  
  
    @Column (name="fecha_mov") 
    @CreationTimestamp
    private Timestamp fecha_m;
    
    @Column (name="tipo_mov") 
    private char tipo_mov;
    
    @Column (name="saldo") 
    private double saldo;
    
    

    public Movimiento() {
        
    }

    public Movimiento( int id, Cliente cedula, Cuenta cod_cuenta, Timestamp fecha_m, char tipo_mov, double saldo) {
        this.id = id;
        this.mcedula = cedula;
        this.mcod_cuenta = cod_cuenta;
        this.fecha_m = fecha_m;
        this.tipo_mov = tipo_mov;
        this.saldo = saldo;
    }

    
    
    
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCedula() {
        return mcedula;
    }

    public void setCedula(Cliente cedula) {
        this.mcedula = cedula;
    }

    public Cuenta getCod_cuenta() {
        return mcod_cuenta;
    }

    public void setCod_cuenta(Cuenta cod_cuenta) {
        this.mcod_cuenta = cod_cuenta;
    }

    public Timestamp getFecha_m() {
        return fecha_m;
    }

    public void setFecha_m(Timestamp fecha_m) {
        this.fecha_m = fecha_m;
    }

    public char getTipo_mov() {
        return tipo_mov;
    }

    public void setTipo_mov(char tipo_mov) {
        this.tipo_mov = tipo_mov;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "id=" + id + ", cedula=" +mcedula + ", cod_cuenta=" +mcod_cuenta + ", fecha_m=" + fecha_m + ", tipo_mov=" + tipo_mov + ", saldo=" + saldo + '}';
    }
    
    
    
}
