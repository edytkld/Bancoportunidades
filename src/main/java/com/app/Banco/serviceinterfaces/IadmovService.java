/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.serviceinterfaces;

import com.app.Banco.model.admCuenta;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ASUS H110 plus
 */
public interface IadmovService {
    

    
    public List<admCuenta>listar();
    
    public Optional <admCuenta> listId(int id);
    
    public int save(admCuenta ad);
    
    public void delete(int cod);
    



}
    

