package com.ablSystem.crudHotelMarruecos.controller;

import com.ablSystem.crudHotelMarruecos.model.mCliente;
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
import com.ablSystem.crudHotelMarruecos.interfaceService.iSCliente;
import com.ablSystem.crudHotelMarruecos.interfaceService.iSTipoPersona;
import com.ablSystem.crudHotelMarruecos.model.mTipoPersona;


@Controller
@RequestMapping
public class controladorCliente {

    @Autowired
    private iSCliente service;
    
    @Autowired
    private iSTipoPersona services;
    
    
    @GetMapping("/listar")
    public String listar(Model model) {
        List<mCliente> mClientes = service.listar();
        model.addAttribute("mClientes", mClientes);
        return "cliente";
    }
    
    
    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("mCliente", new mCliente());
        List<mTipoPersona> mTipoPersonas = services.listarTP();
        model.addAttribute("mTipoPersonas", mTipoPersonas);
        return "crear-cliente";
    }
    
    @PostMapping("/save")
    public String save(mCliente mC, Model model) {
        service.save(mC);
        return "redirect:/listar";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<mCliente> mClientes = service.listarId(id);
        model.addAttribute("mCliente", mClientes);
        List<mTipoPersona> mTipoPersonas = services.listarTP();
        model.addAttribute("mTipoPersonas", mTipoPersonas);
        return "crear-cliente";
    }
    
    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }

    
}
