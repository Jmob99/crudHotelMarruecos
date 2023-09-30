
package com.ablSystem.crudHotelMarruecos.view;

import com.ablSystem.crudHotelMarruecos.model.mTipoPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vTipoPersona extends CrudRepository<mTipoPersona, Integer>{
    
}
