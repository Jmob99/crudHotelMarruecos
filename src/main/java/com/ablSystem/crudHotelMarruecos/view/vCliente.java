
package com.ablSystem.crudHotelMarruecos.view;

import com.ablSystem.crudHotelMarruecos.model.mCliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vCliente extends CrudRepository<mCliente, Integer>{
    
}
