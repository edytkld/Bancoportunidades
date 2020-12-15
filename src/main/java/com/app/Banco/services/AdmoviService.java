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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(admCuenta ad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
