
package com.ablSystem.crudHotelMarruecos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//ANOTACIONES
@Entity
@Table(name="tipo_documento")
public class mTipoPersona {
    //ANOTACIONES
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_tipo_documento;
    private String nom_tipo_documento;

    public mTipoPersona() {
    }

    public mTipoPersona(int id_tipo_documento, String nom_tipo_documento) {
        this.id_tipo_documento = id_tipo_documento;
        this.nom_tipo_documento = nom_tipo_documento;
    }

    public int getId_tipo_documento() {
        return id_tipo_documento;
    }

    public void setId_tipo_documento(int id_tipo_documento) {
        this.id_tipo_documento = id_tipo_documento;
    }

    public String getNom_tipo_documento() {
        return nom_tipo_documento;
    }

    public void setNom_tipo_documento(String nom_tipo_documento) {
        this.nom_tipo_documento = nom_tipo_documento;
    }
    
    
        
    
}
