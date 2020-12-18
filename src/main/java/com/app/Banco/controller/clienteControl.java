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
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/Bank/clientes")
public class clienteControl {
    
    @Autowired
    private IclienteService service;
    
    
    
    @GetMapping("/list") //produces = "application/json"
    public String listclient(Model model){
        
        List<Cliente>clientes=service.listar();
        
        model.addAttribute("clientes", clientes);
       
     return "listarClientes";
   }
    
    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("clientes", new Cliente());
        return "formCli";
    }
    
    @GetMapping("/{cedula}")
    public String editar(@PathVariable String cedula, Model model){
        Optional<Cliente>clientes=service.listId(cedula);
        model.addAttribute("clientes", clientes);
        return "formCli";
    }
    
    @PostMapping("/save")
    public String save(@Valid Cliente cli, Model model){
        service.save(cli);
        return "redirect:/Bank/clientes/list";
    }
    
    @GetMapping("/delete/{cedula}")
    public String delete(Model model, @PathVariable String cedula){
        service.delete(cedula);
        return "redirect:/Bank/clientes/list";
    }
}
