/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.controller;

import com.app.Banco.model.Movimiento;
import com.app.Banco.serviceinterfaces.ImovimientoService;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS H110 plus
 */
@Controller
@RequestMapping("Bank/movimiento")
public class moviControl {
    
    
    @Autowired
    private ImovimientoService service;
    
    
    @GetMapping("/list")
    public String movlist(Model model){
        
       List<Movimiento>movimientos=service.listar();
       model.addAttribute("movimientos",movimientos);
        
        return "";
       
}
    
    @GetMapping("/{id}")
    public String findbyid (@PathVariable int id, Model model){
      
        Optional<Movimiento>movimiento=service.listId(id);
        
        model.addAttribute("movimiento",movimiento);
       
        
        return "";
    
    }
    
    
      @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("clientes", new Movimiento());
        return "";
    }
    
  
    
    @PostMapping("/save")
    public String save(@Valid Movimiento mov, Model model){
        service.save(mov);
        return "";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "";
    }
}
