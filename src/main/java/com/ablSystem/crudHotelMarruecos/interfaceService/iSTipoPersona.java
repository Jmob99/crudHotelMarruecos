
package com.ablSystem.crudHotelMarruecos.interfaceService;

import com.ablSystem.crudHotelMarruecos.model.mTipoPersona;
import java.util.List;
import java.util.Optional;

public interface iSTipoPersona {
    public List<mTipoPersona>listarTP();
    
    public Optional<mTipoPersona>listarIdTP(int id);
    
    public int saveTP(mTipoPersona mTP);
    
    public void deleteTP(int id);
}
