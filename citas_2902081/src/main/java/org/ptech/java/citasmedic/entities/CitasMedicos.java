package org.ptech.java.citasmedic.entities;

import java.time.LocalDateTime;

import org.ptech.java.citasmedic.entities.enums.Estado;
import org.ptech.java.citasmedic.interfaces.IAgendable;

public class CitasMedicos extends Citas implements IAgendable{
    private String MotivoConsulta;

    Medico medico;
    Estado estado;
    public CitasMedicos(String motivoConsulta) {
        MotivoConsulta = motivoConsulta;
    }

    

    public CitasMedicos(String motivoConsulta, Medico medico, Estado estado) {
        MotivoConsulta = motivoConsulta;
        this.medico = medico;
        this.estado = estado;
    }



    public CitasMedicos(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, String motivoConsulta,
            Medico medico, Estado estado) {
        super(id, fecha, paciente, consultorio);
        MotivoConsulta = motivoConsulta;
        this.medico = medico;
        this.estado = estado;
    }



    public String getMotivoConsulta() {
        return MotivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        MotivoConsulta = motivoConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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
