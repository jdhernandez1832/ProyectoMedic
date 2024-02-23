package org.ptech.java.citasmedic.entities;



public class Consultorio {
    int id;
    String direccion;
    int numero;
    public Consultorio() {
    }
    public Consultorio(int id, String direccion, int numero) {
        this.id = id;
        this.direccion = direccion;
        this.numero = numero;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
}
