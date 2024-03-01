package org.ptech.java.citasmedic.entities;

import java.time.LocalDateTime;

import org.ptech.java.citasmedic.entities.enums.Estado;

public class Citas {
    private int id;
    private LocalDateTime fecha;
    private Medico medico;
    private Paciente paciente;
    private Consultorio consultorio;
    private Estado estado;
    
    public Citas() {
    }

    public Citas(int id, LocalDateTime fecha, Medico medico, Paciente paciente, Consultorio consultorio,
            Estado estado) {
        this.id = id;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.consultorio = consultorio;
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
}
