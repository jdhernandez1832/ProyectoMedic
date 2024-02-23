package org.ptech.java.citasmedic.entities;

import java.time.LocalDate;

public class Paciente {
    private int id;
    private String nombre;
    private String apellido;
    private String tipoIdentificacion;
    private int numeroIdentificacion;
    private String correoElectronico;
    private int celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso ;
    private TipoSangre tipoSangre ;
    private char factorRH;

    public Paciente() {
    }
    public Paciente(int id, String nombre, String apellido, String tipoIdentificacion, int numeroIdentificacion,
            String correoElectronico, int celular, LocalDate fechaNacimiento, Double altura, Double peso,
            TipoSangre tipoSangre, char factorRH) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
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
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }
    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public int getCelular() {
        return celular;
    }
    public void setCelular(int celular) {
        this.celular = celular;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }
    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    public char getFactorRH() {
        return factorRH;
    }
    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

    
}
