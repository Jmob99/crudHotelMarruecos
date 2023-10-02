package com.ablSystem.crudHotelMarruecos.service;

import com.ablSystem.crudHotelMarruecos.model.mCliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ablSystem.crudHotelMarruecos.view.vCliente;
import com.ablSystem.crudHotelMarruecos.interfaceService.iSCliente;

@Service //
public class sCliente implements iSCliente {

    @Autowired
    private vCliente vC;

    @Override
    public List<mCliente> listar() {
        return (List<mCliente>) vC.findAll();
    }

    @Override
    public Optional<mCliente> listarId(int id) {

        return vC.findById(id);

    }

    @Override
    public int save(mCliente mC) {
        int res = 0;
        mCliente mClient = vC.save(mC);
        if(mClient != null){
            res = 1;
        }
        return res;
    }

    @Override
    public Optional<mCliente> listarNumeroDoc(long numero_documento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        vC.deleteById(id);
    }

}

   
    
