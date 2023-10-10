
package com.ablSystem.crudHotelMarruecos.interfaceService;

import com.ablSystem.crudHotelMarruecos.model.mTipoHabitacion;
import java.util.List;
import java.util.Optional;

public interface iSTipoHabitacion {
    public List<mTipoHabitacion>listarTH();
    
    public Optional<mTipoHabitacion>listarIdTH(int id);
    
    public int saveTH(mTipoHabitacion mTH);
    
    public void deleteTH(int id);
}
