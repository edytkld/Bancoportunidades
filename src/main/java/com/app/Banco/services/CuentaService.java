/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Banco.services;

import com.example.Banco.interfaces.ICuenta;
import com.example.Banco.model.Cuenta;
import com.example.Banco.serviceinterfaces.IcuentaServices;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS H110 plus
 */
@Service("cuentaservice")
public class CuentaService implements IcuentaServices{
    
    @Autowired
    private ICuenta data;
    
    @Override
    public List<Cuenta> listar() {
        return (List<Cuenta>) data.findAll();
    }

    @Override
    public Optional<Cuenta> listId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Cuenta cuen) {
        int res=0;
        Cuenta cuenta=data.save(cuen);
        if(!cuenta.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
}