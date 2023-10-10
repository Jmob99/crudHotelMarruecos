
package com.ablSystem.crudHotelMarruecos.view;

import com.ablSystem.crudHotelMarruecos.model.mTipoHabitacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vTipoHabitacion extends CrudRepository<mTipoHabitacion, Integer>{
    
}
