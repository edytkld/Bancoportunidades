/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.services;

import com.app.Banco.interfaces.Iadmcuenta;
import com.app.Banco.model.admCuenta;
import com.app.Banco.serviceinterfaces.IadmovService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS H110 plus
 */

public class AdmoviService implements IadmovService {

    
    @Autowired
    private Iadmcuenta data;
    
    @Override
    public List<admCuenta> listar() {
        return (List<admCuenta>) data.findAll();
    }

    @Override
    public Optional<admCuenta> listId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(admCuenta ad) {
        int res=0;
        admCuenta admcuenta= data.save(ad);
        if(!admcuenta.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int cod) {
        data.deleteById(cod);
    }

}
