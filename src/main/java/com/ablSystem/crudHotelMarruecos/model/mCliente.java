
package com.ablSystem.crudHotelMarruecos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//ANOTACIONES
@Entity
@Table(name="cliente")
public class mCliente {
    //ANOTACIONES
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_cliente;
    @Column()
    private long numero_documento;
    private String nombre;
    private String apellido;
    private long telefono;
    private String direccion;
    private String correo_electronico;
    
    @ManyToOne
    @JoinColumn(name="id_tipo_documento")
    private mTipoPersona mtipopersona;

    public mCliente() {
    }

    public mCliente(int id_cliente, long numero_documento, String nombre, String apellido, long telefono, String direccion, String correo_electronico, mTipoPersona mtipopersona) {
        this.id_cliente = id_cliente;
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo_electronico = correo_electronico;
        this.mtipopersona = mtipopersona;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public long getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(long numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public mTipoPersona getMtipopersona() {
        return mtipopersona;
    }

    public void setMtipopersona(mTipoPersona mtipopersona) {
        this.mtipopersona = mtipopersona;
    }

    
    

    
}
