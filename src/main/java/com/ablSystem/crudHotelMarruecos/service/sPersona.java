
package com.ablSystem.crudHotelMarruecos.service;

import com.ablSystem.crudHotelMarruecos.interfaceService.iSPersona;
import com.ablSystem.crudHotelMarruecos.model.mPersona;
import com.ablSystem.crudHotelMarruecos.view.vPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //
public class sPersona implements iSPersona{
    
    @Autowired
    private vPersona vP;
    
    @Override
    public List<mPersona> listar() {
        return(List<mPersona>)vP.findAll();
    }

    @Override
    public Optional<mPersona> listarId(int id) {
        return vP.findById(id);
    }

    @Override
    public int save(mPersona mP) {
        int res=0;
        mPersona mPerson=vP.save(mP);
        if(!mPerson.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        vP.deleteById(id);
    }
    
}
