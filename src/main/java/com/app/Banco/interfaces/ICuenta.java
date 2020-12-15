/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.interfaces;

import com.app.Banco.model.Cuenta;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ASUS H110 plus
 */
public interface ICuenta extends CrudRepository<Cuenta,Integer> {
    
}
