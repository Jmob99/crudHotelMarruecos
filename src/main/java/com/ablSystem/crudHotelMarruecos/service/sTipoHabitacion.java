
package com.ablSystem.crudHotelMarruecos.service;

import com.ablSystem.crudHotelMarruecos.interfaceService.iSTipoHabitacion;
import com.ablSystem.crudHotelMarruecos.model.mTipoHabitacion;
import com.ablSystem.crudHotelMarruecos.view.vTipoHabitacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class sTipoHabitacion implements iSTipoHabitacion{

    @Autowired
    private vTipoHabitacion vTH;
    
    @Override
    public List<mTipoHabitacion> listarTH() {
        return(List<mTipoHabitacion>)vTH.findAll();
    }

    @Override
    public Optional<mTipoHabitacion> listarIdTH(int id) {
        return vTH.findById(id);
    }

    @Override
    public void deleteTH(int id) {
        vTH.deleteById(id);
    }

    @Override
    public int saveTH(mTipoHabitacion mTH) {
         int res=0;
        mTipoHabitacion mTipoHabitacio=vTH.save(mTH);
        if(mTipoHabitacio !=null){
            res=1;
        }
        return res;
        
    }


}

   
