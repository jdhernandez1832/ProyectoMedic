package org.ptech.java.citasmedic.entities;

import java.time.LocalDateTime;

import org.ptech.java.citasmedic.entities.enums.Estado;
import org.ptech.java.citasmedic.interfaces.IAgendable;

public class CitasEnfermeros extends Citas implements IAgendable {

    private String procedimientoRealizar;

    Paciente paciente;
    Enfermero enfemero;
   Estado estado;

    

    public CitasEnfermeros(){
        
    }

    public CitasEnfermeros(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio,
        String procedimientoRealizar, Paciente paciente2, Enfermero enfemero, Estado estado) {
    super(id, fecha, paciente, consultorio);
    this.procedimientoRealizar = procedimientoRealizar;
    paciente = paciente2;
    this.enfemero = enfemero;
    this.estado = estado;
}

    public String getProcedimientoRealizar() {
        return procedimientoRealizar;
    }

    public void setProcedimientoRealizar(String procedimientoRealizar) {
        this.procedimientoRealizar = procedimientoRealizar;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Enfermero getEnfemero() {
        return enfemero;
    }

    public void setEnfemero(Enfermero enfemero) {
        this.enfemero = enfemero;
    }

    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
        this.setFecha(fecha);
        this.setConsultorio(c);
        return true;
    }

    @Override
    public boolean reagendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc) {
        this.setFecha(nuevaFecha);
        this.setConsultorio(nuevoc);
        return true;
    }

    @Override
    public boolean cancelarCita() {
    this.estado=Estado.CANCELADA;
        return true;
    }

}