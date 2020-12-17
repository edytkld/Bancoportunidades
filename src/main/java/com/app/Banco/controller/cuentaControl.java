/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.controller;

import com.app.Banco.model.Cuenta;
import com.app.Banco.serviceinterfaces.IcuentaServices;
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
@RequestMapping("Bank/cuenta")
public class cuentaControl {
    
    @Autowired
    private IcuentaServices service;
    
    @GetMapping("/list")
    public String Listar(Model model){
        List<Cuenta>cuenta=service.listar();
        model.addAttribute("cuenta", cuenta);
        return "listarCuentas";
    }
    
    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("cuenta", new Cuenta());
        return "form2";
    }
    
    @GetMapping("/{codigo_cta}")
    public String editar(@PathVariable int codigo_cta, Model model){
        Optional<Cuenta>cuenta=service.listId(codigo_cta);
        model.addAttribute("cuenta", cuenta);
        return "form2";
    }
    
    @PostMapping("/save")
    public String save(@Valid Cuenta cuen, Model model){
        service.save(cuen);
        return "redirect:/cuenta/list";
    }
    
    @GetMapping("/delete/{codigo_cta}")
    public String delete(Model model, @PathVariable int codigo_cta){
        service.delete(codigo_cta);
        return "redirect:/cuenta/list";
    }
    
}
