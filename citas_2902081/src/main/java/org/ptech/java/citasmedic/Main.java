package org.ptech.java.citasmedic;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citasmedic.entities.CitasEnfermeros;
import org.ptech.java.citasmedic.entities.CitasMedicos;
import org.ptech.java.citasmedic.entities.Consultorio;
import org.ptech.java.citasmedic.entities.Enfermero;
import org.ptech.java.citasmedic.entities.Medico;
import org.ptech.java.citasmedic.entities.Paciente;
import org.ptech.java.citasmedic.entities.enums.Especialidad;
import org.ptech.java.citasmedic.entities.enums.Estado;
import org.ptech.java.citasmedic.entities.enums.TipoDocumento;
import org.ptech.java.citasmedic.entities.enums.TipoSangre;


public class Main{
    public static void main(String[] args) {
    Medico M1 =new Medico(1, " Carlos ", " hernandez ", TipoDocumento.CC,1075792381,12,Especialidad.MEDICO_GENERAL);
    Medico M2 =new Medico(2, " Andrew ", " Gilfrido ", TipoDocumento.CC,1075792318,24,Especialidad.OTORRINOLARINGOLOGIA);

    Paciente P1 = new Paciente(1, " Julian "," Hernandez ",TipoDocumento.CC,12345,"Juliangmail.com",546456,LocalDate.now(),1.75,1000.0, TipoSangre.b,'+');
    Paciente P2 = new Paciente(2, " Juan "," Pantoja ",TipoDocumento.CM,12387,"Juangmail.com",876546,LocalDate.now(),2.82,500.0, TipoSangre.a,'+');
    Paciente P3 = new Paciente(3, " Luis "," Lopez ",TipoDocumento.CC,123786,"Luisgmail.com",8968546,LocalDate.now(),3.0,400.0, TipoSangre.ab,'-');
    Paciente P4 = new Paciente(4, " Deiner "," Castillo ",TipoDocumento.CE,1231234,"Deinergmail.com",65654654,LocalDate.now(),4.0,350.0, TipoSangre.o,'+');
    Paciente P5 = new Paciente(5, " Carla "," Camacho ",TipoDocumento.TI,123096,"Carlagmail.com",6546323,LocalDate.now(),5.0,20.0, TipoSangre.o,'-');

    Enfermero E1 = new Enfermero(1, "Federico" , "Deiner", TipoDocumento.CC, 8553232);
    Enfermero E2 = new Enfermero(2, "Luis" , "WILMER", TipoDocumento.CC, 3232323);
    Enfermero E3 = new Enfermero(3, "Lopez" , "Gilfrido", TipoDocumento.CC, 354655863);

    Consultorio C1 = new Consultorio(1,"Tv 142 #150-50",123);
    Consultorio C2 = new Consultorio(2,"Tv 137 a bis #128 a 10",471);

    CitasMedicos CM1 = new CitasMedicos(1,LocalDateTime.now(),P1,C1,"Gripe",M2,Estado.AGENDADA);
    CitasMedicos CM2 = new CitasMedicos(2,LocalDateTime.now(),P2,C2,"Escopolamina",M1,Estado.AGENDADA);

    System.out.println(CM1.getFecha().toString() + CM1.getConsultorio().getNumero() + M2.getNombre() + M2.getApellido());

    CitasEnfermeros CE1= new CitasEnfermeros(1,LocalDateTime.now(),P1,C1,"tos",E1,Estado.AGENDADA);

    CE1.cancelarCita();
    System.out.println(CE1.getFecha().toString()+CE1.getConsultorio().getNumero()+M1.getNombre()+M1.getApellido());
    System.out.println(CE1.getEstado().CANCELADA);
    }

}