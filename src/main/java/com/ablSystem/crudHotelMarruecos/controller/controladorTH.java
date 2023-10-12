
package com.ablSystem.crudHotelMarruecos.controller;

import com.ablSystem.crudHotelMarruecos.interfaceService.iSTipoHabitacion;
import com.ablSystem.crudHotelMarruecos.model.mTipoHabitacion;
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
public class controladorTH {
    
    @Autowired
    private iSTipoHabitacion service;
    
    @GetMapping("/listarTH")
    public String listarTH(Model model){
        
        List<mTipoHabitacion>mTipoHabitaciones=service.listarTH();
        model.addAttribute("mTipoHabitaciones",mTipoHabitaciones);
        return"tipoHabitacion";
    }

    
    @GetMapping("/newTH")
    public String agregar(Model model){
        model.addAttribute("mTipoHabitacion", new mTipoHabitacion());
        return "modulo_tipo_habitacion";
           
    }
    @PostMapping("/saveTH")
    public String save(mTipoHabitacion mH, Model model){
        service.saveTH(mH);
        return "redirect:/listarTH";
    
    }
    
   @GetMapping("/editarTH/{id}")
    public String editarTH(@PathVariable int id, Model model){
    Optional<mTipoHabitacion> mTipoHabitaciones = service.listarIdTH(id);
    model.addAttribute("mTipoHabitacion", mTipoHabitaciones);
    return "modulo_tipo_habitacion";
}
    
      @GetMapping("/eliminarTH/{id}")
    public String deleteTH(Model model, @PathVariable int id){
        service.deleteTH(id);
        return "redirect:/listarTH";
    }
    
   
    
}

