package org.ptech.java.citasmedic.entities;

import java.time.LocalDateTime;


public class Citas {
    private int id;
    private LocalDateTime fecha;
    private Paciente paciente;
    private Consultorio consultorio;
    
    public Citas() {
    }

    public Citas(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio) {
        this.id = id;
        this.fecha = fecha;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }



}
