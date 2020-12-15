/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.serviceinterfaces;

import com.app.Banco.model.Ciudad;
import java.util.List;
import java.util.Optional;





public interface IciudadService {
    
    public List<Ciudad>listar();
    
    public Optional <Ciudad> listId(int id);
    
    public int save(Ciudad ciu);
    
    public void delete(int id);
    
   
    
}
