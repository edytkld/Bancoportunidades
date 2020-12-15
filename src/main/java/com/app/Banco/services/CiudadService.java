/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Banco.services;

import com.example.Banco.interfaces.Iciudad;
import com.example.Banco.model.Ciudad;
import com.example.Banco.serviceinterfaces.IciudadService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS H110 plus
 */
@Service("ciudadservice")
public class CiudadService implements IciudadService{
    
    @Autowired
    private Iciudad data;
    

    @Override
    public List<Ciudad> listar() {
        return  (List<Ciudad>) data.findAll();
    }

    @Override
    public int save(Ciudad ciu) {
        int res=0;
        Ciudad ciudad=data.save(ciu);
        if(!ciudad.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public Optional<Ciudad> listId(int id) {
        return data.findById(id);
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }    
}

