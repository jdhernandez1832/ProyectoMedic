package org.ptech.java.citasmedic.entities;

import java.time.LocalDate;
import org.ptech.java.citasmedic.entities.enums.Especialidad;
import org.ptech.java.citasmedic.entities.enums.TipoDocumento;
import org.ptech.java.citasmedic.entities.enums.TipoSangre;

public class PruebasPolimorfismo {
    public static void main(String[] args) {
        //instancioar un usuario
        Usuario U = new Usuario(1,"Jhon", "Cufiño",TipoDocumento.TI,1049795566 );
        System.out.println(U.toString());
        Medico M = new Medico(1, " Alex "," Marin ", TipoDocumento.CC, 1234567890 , 2345 ,Especialidad.OTORRINOLARINGOLOGIA);
        System.out.println(M.toString());
        Paciente P = new Paciente(1, " xd "," xd2 ",TipoDocumento.CC,123,"xdgmail.com",12356,LocalDate.now(),2.0,200.0, TipoSangre.a,'-');
        System.out.println(P.toString());
        Enfermero e1= new Enfermero(1, "Federico" , "WILMER", TipoDocumento.CC, 1075792381);
        e1.addProcedure("Lavado de dinero");
        System.out.println(e1.toString());
        
    }
}
