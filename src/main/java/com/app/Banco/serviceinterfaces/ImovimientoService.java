/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.serviceinterfaces;

import com.app.Banco.model.Movimiento;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ASUS H110 plus
 */
public interface ImovimientoService {
   public List<Movimiento>listar();
    
    public Optional <Movimiento> listId(int id);
    
    public int save(Movimiento mov);
    
    public void delete(int id);
    
}
