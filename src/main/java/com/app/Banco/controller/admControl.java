/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.controller;

import com.app.Banco.model.admCuenta;
import com.app.Banco.serviceinterfaces.IadmovService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS H110 plus
 */

@Controller
@RequestMapping("/admcuenta")
public class admControl {
    
    
    private IadmovService service;
    
    @GetMapping("/listarAdmCuenta")
    public String listar(Model model){
        List<admCuenta>admcuenta=service.listar();
        model.addAttribute("admcuenta", admcuenta);
        return "listarAdmCuenta";
    }
    
}
