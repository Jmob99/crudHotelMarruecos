
package com.ablSystem.crudHotelMarruecos.service;

import com.ablSystem.crudHotelMarruecos.interfaceService.iSTipoPersona;
import com.ablSystem.crudHotelMarruecos.model.mPersona;
import com.ablSystem.crudHotelMarruecos.model.mTipoPersona;
import com.ablSystem.crudHotelMarruecos.view.vTipoPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //
public class sTipoPersona implements iSTipoPersona{
    
    @Autowired
    private vTipoPersona vTP;

    @Override
    public List<mTipoPersona> listarTP() {
        return(List<mTipoPersona>)vTP.findAll();
    }

    @Override
    public Optional<mTipoPersona> listarIdTP(int id) {
        return vTP.findById(id);
    }

    @Override
    public int saveTP(mTipoPersona mTP) {
        int res=0;
        mTipoPersona mTipoPerson=vTP.save(mTP);
        if(!mTipoPerson.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void deleteTP(int id) {
        vTP.deleteById(id);
    }

   
    
    
}
