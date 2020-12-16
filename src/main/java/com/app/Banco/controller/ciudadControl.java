/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.controller;

import com.app.Banco.model.Ciudad;
import com.app.Banco.serviceinterfaces.IciudadService;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/ciudad")
public class ciudadControl {
    
    @Autowired
    private IciudadService service;
    
    @GetMapping("/list")
    public String listar(Model model){
        List<Ciudad>ciudad=service.listar();
        model.addAttribute("ciudad", ciudad);
        return "index";
    }
    
    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("ciudad", new Ciudad());
        return "form1";
    }
    
    @GetMapping("/{codigo}")
    public String editar(@PathVariable int codigo, Model model){
        Optional<Ciudad>ciudad=service.listId(codigo);
        model.addAttribute("ciudad", ciudad);
        return "form1";
    }
    
    @PostMapping("/save")
    public String save(@Valid Ciudad ciu, Model model){
        service.save(ciu);
        return "redirect:/ciudad/list";
    }
    
    @GetMapping("/delete/{codigo}")
    public String delete(Model model, @PathVariable int codigo){
        service.delete(codigo);
        return "redirect:/ciudad/list";
    }
    
}