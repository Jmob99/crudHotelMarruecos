
package com.ablSystem.crudHotelMarruecos.interfaceService;

import com.ablSystem.crudHotelMarruecos.model.mPersona;
import java.util.List;
import java.util.Optional;

public interface iSPersona {
    public List<mPersona>listar();
    public Optional<mPersona>listarId(int id);
    
    public int save(mPersona mP);
    public void delete(int id);
}
