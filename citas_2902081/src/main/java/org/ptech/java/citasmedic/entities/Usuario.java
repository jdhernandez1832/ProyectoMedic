package org.ptech.java.citasmedic.entities;

import org.ptech.java.citasmedic.entities.enums.TipoDocumento;

//clase padre
//superclase
//clase maestra
//clase base
//clase superior
public class Usuario {
    //atributos heredados
    //deben ser protected

    protected int id;
    protected String nombre;
    protected String apellido;
    protected TipoDocumento tipoIdentificacion;
    protected int numeroDocumento;
    
    //sobreescribir el metodo toString
    
    
    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoIdentificacion="
                + tipoIdentificacion + ", numeroDocumento=" + numeroDocumento + "]";
    }

    public Usuario(int id, String nombre, String apellido, TipoDocumento tipoIdentificacion, int numeroDocumento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroDocumento = numeroDocumento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public TipoDocumento getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoDocumento tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
    
}
