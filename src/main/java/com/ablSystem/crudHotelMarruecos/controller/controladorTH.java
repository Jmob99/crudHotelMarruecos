
package com.ablSystem.crudHotelMarruecos.controller;

import com.ablSystem.crudHotelMarruecos.interfaceService.iSTipoHabitacion;
import com.ablSystem.crudHotelMarruecos.model.mTipoHabitacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class controladorTH {
    
    @Autowired
    private iSTipoHabitacion service;
    
    @GetMapping("/listarTH")
    public String listarTH(Model model){
        
        List<mTipoHabitacion>mTipoHabitacion=service.listarTH();
        model.addAttribute("mTipoHabitacion",mTipoHabitacion);
        return"tipoHabitacion";
    }
}
