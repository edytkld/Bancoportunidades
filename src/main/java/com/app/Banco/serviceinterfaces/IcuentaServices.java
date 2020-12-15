/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.serviceinterfaces;

import com.app.Banco.model.Cuenta;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ASUS H110 plus
 */
public interface IcuentaServices {
    
     public List<Cuenta>listar();
    
    public Optional <Cuenta> listId(int id);
    
    public int save(Cuenta ciu);
    
    public void delete(int id);
    
}
