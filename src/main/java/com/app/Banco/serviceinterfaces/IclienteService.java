/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.serviceinterfaces;

import com.app.Banco.model.Cliente;
import java.util.List;
import java.util.Optional;
import java.util.Set;



/**
 *
 * @author ASUS H110 plus
 */
public interface IclienteService {
    
     public List<Cliente>listar();
    
    public Optional <Cliente> listId(String id);
    
    public int save(Cliente cli);
    
    public void delete(String id);
}
