package com.ablSystem.crudHotelMarruecos.controller;

import com.ablSystem.crudHotelMarruecos.interfaceService.iSPersona;
import com.ablSystem.crudHotelMarruecos.model.mPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class controlador {

    @Autowired
    private iSPersona service;
    
    @GetMapping("/listar")
    public String listar(Model model) {
        List<mPersona> mPersonas = service.listar();
        model.addAttribute("mPersonas", mPersonas);
        return "indexP";
    }
    
    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("mPersona", new mPersona());
        return "ingresar";
    }
    
    @PostMapping("/save")
    public String save(mPersona mP, Model model) {
        service.save(mP);
        return "redirect:/listar";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<mPersona> mPersonas = service.listarId(id);
        model.addAttribute("mPersona", mPersonas);
        return "ingresar";
    }
    
    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
