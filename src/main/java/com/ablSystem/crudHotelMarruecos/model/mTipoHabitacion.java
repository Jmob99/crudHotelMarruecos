
package com.ablSystem.crudHotelMarruecos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//ANOTACIONES
@Entity
@Table(name="tipo_Habitacion")
public class mTipoHabitacion {
    //ANOTACIONES
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_tipo_habitacion;
    private String nom_tipo_habitacion;

    public mTipoHabitacion() {
    }
    

    public mTipoHabitacion(int id_tipo_habitacion, String nom_tipo_habitacion) {
        this.id_tipo_habitacion = id_tipo_habitacion;
        this.nom_tipo_habitacion = nom_tipo_habitacion;
    }

    public int getId_tipo_habitacion() {
        return id_tipo_habitacion;
    }

    public void setId_tipo_habitacion(int id_tipo_habitacion) {
        this.id_tipo_habitacion = id_tipo_habitacion;
    }

    public String getNom_tipo_habitacion() {
        return nom_tipo_habitacion;
    }

    public void setNom_tipo_habitacion(String nom_tipo_habitacion) {
        this.nom_tipo_habitacion = nom_tipo_habitacion;
    }
    
    

   
}
