/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.services;

import com.app.Banco.interfaces.Icliente;
import com.app.Banco.model.Cliente;
import com.app.Banco.serviceinterfaces.IclienteService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS H110 plus
 */
@Service
public class ClienteService implements IclienteService {

    @Autowired(required = true)
    private Icliente data;
    
    
    @Override
    public List<Cliente>listar() {  
        return  (List<Cliente>)data.findAll();
    }

    @Override
    public Optional<Cliente> listId(String id) {
        return data.findById(id);
    }

    @Override
    public int save(Cliente cli) {
        int res=0;
        Cliente cliente=data.save(cli);
        if(!cliente.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(String id) {
        data.deleteById(id);
    }
    
}
