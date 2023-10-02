
package com.ablSystem.crudHotelMarruecos.interfaceService;

import com.ablSystem.crudHotelMarruecos.model.mCliente;
import java.util.List;
import java.util.Optional;

public interface iSCliente {
    public List<mCliente>listar();
    public Optional<mCliente>listarId(int id_cliente);
    public Optional<mCliente>listarNumeroDoc(long numero_documento);
   
    
    
    
    public int save(mCliente mC);
    public void delete(int id);
}
