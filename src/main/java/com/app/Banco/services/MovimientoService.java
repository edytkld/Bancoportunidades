/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.services;

import com.app.Banco.interfaces.Imovimiento;
import com.app.Banco.model.Cliente;
import com.app.Banco.model.Movimiento;
import com.app.Banco.serviceinterfaces.IclienteService;
import com.app.Banco.serviceinterfaces.ImovimientoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS H110 plus
 */
@Service("Movimientoservice")
public class MovimientoService implements ImovimientoService {

    @Autowired
    private Imovimiento data;

    @Override
    public List<Movimiento> listar() {
        
        return (List<Movimiento>) data.findAll();
    }

    @Override
    public Optional<Movimiento> listId(int id){
        
        return data.findById(id);
    }

    @Override
    public int save(Movimiento mov) {
      int res=0;
        Movimiento movi = data.save(mov);
        if(!mov.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
   
}
