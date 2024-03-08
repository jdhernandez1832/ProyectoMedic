package org.ptech.java.citasmedic.interfaces;

import java.time.LocalDateTime;

import org.ptech.java.citasmedic.entities.Consultorio;

public interface IAgendable {
    // proponer un metodo para agendar
    //cita
    public boolean agendarCita(LocalDateTime fecha,Consultorio c);
    //proponer un metodo para reagendar cita
    public boolean reagendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc);
    //cancelar una cita
    public boolean cancelarCita();
}
