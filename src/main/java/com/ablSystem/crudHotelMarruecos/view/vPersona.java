
package com.ablSystem.crudHotelMarruecos.view;

import com.ablSystem.crudHotelMarruecos.model.mPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vPersona extends CrudRepository<mPersona, Integer>{
    
}
