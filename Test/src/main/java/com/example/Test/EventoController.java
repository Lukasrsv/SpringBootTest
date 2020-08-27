/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Test;

import models.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import repository.EventoRepository;

/**
 *
 * @author lukas
 */
@Controller
public class EventoController {
    @Autowired
    private EventoRepository er;
    
    @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
    public String formEvento(){
        return "formularioEvento";
    
    }
    @RequestMapping( method = RequestMethod.POST, value = "/cadastrar")
    public String formEvento(Evento evento){
        er.save(evento);
        return "formularioEvento";
    
    }
    
}
