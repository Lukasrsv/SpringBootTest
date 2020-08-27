/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author lukas
 */
@Controller
public class EventoController {
    
    
    
    
    @RequestMapping(value = "/cadastrar",method = RequestMethod.GET)
    public String formulario(){
    return "formularioEvento";
    }
    
    @RequestMapping(value= "/cadastrar", method = RequestMethod.POST)
    public String formulario(Evento evento){
        
    return "redirect:/formularioEvento";
    }
    
    @RequestMapping("/")
    public String test(){
    return"index";
    }
    
   
    
}
