/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.Banco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS H110 plus
 */
@Controller
@RequestMapping("/Bank")
public class indexController {

    @GetMapping("/")
    public String index() {

        return "index";

    }

    @GetMapping("/Usuario")
    public String vista1() {
        return "OperacionesCliente";
    }
    
    @GetMapping("/Retiro")
    public String retiro() {
        return "Retiro";
    }
    
    @GetMapping("/Depositar")
    public String deposito() {
        return "Depositar";
    }
    
    @GetMapping("/Consultar")
    public String saldo() {
        return "Consultar";
    }

}
