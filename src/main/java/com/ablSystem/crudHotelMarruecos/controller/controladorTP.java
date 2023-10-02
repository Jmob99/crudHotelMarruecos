package com.ablSystem.crudHotelMarruecos.controller;

import com.ablSystem.crudHotelMarruecos.interfaceService.iSTipoPersona;
import com.ablSystem.crudHotelMarruecos.model.mTipoPersona;
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
public class controladorTP {

    @Autowired
    private iSTipoPersona service;
    
    @GetMapping("/listarTP")
    public String listarTP(Model model) {
        List<mTipoPersona> mTipoPersonas = service.listarTP();
        model.addAttribute("mTipoPersonas", mTipoPersonas);
        return "tipoPersona";
    }
    
    @GetMapping("/newTP")
    public String agregarTP(Model model) {
        model.addAttribute("mTipoPersona", new mTipoPersona());
        return "crear-tipoPersona";
    }
    
    @PostMapping("/saveTP")
    public String saveTP(mTipoPersona mTP, Model model) {
        service.saveTP(mTP);
        return "redirect:/listarTP";
    }
    
    @GetMapping("/editarTP/{id}")
    public String editarTP(@PathVariable int id, Model model) {
        Optional<mTipoPersona> mTipoPersonas = service.listarIdTP(id);
        model.addAttribute("mTipoPersona", mTipoPersonas);
        return "crear-tipoPersona";
    }
    
    
    @GetMapping("/eliminarTP/{id}")
    public String deleteTP(Model model, @PathVariable int id){
        service.deleteTP(id);
        return "redirect:/listarTP";
    }
}
