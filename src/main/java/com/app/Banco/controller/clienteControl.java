/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.controller;

import com.app.Banco.model.Cliente;
import com.app.Banco.serviceinterfaces.IclienteService;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value="Bank/cliente")
public class clienteControl {
    
    @Autowired
    private IclienteService service;
    
    
    
    @GetMapping(value="/lista") //produces = "application/json"
    
    public String listclient(Model model){
        
        List<Cliente>clientes=service.listar();
        
        model.addAttribute("clientes", clientes);
       
     return "index";
   }
    
    
    @GetMapping(value="/{id}") //produces = "application/json"
    
    public String findbyid (Model model, @PathVariable (value="cedula")String id){
        
        Optional<Cliente>clientes=service.listId(id);
        
        model.addAttribute("clientes", clientes);
       
     return "opciones";
    
    
    }
}
