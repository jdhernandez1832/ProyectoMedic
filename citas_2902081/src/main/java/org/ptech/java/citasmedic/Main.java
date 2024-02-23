package org.ptech.java.citasmedic;

import java.time.LocalDateTime;

import org.ptech.java.citasmedic.entities.Citas;
import org.ptech.java.citasmedic.entities.Consultorio;
import org.ptech.java.citasmedic.entities.Especialidad;
import org.ptech.java.citasmedic.entities.Estado;
import org.ptech.java.citasmedic.entities.Medico;
import org.ptech.java.citasmedic.entities.Paciente;
import org.ptech.java.citasmedic.entities.TipoDocumento;
public class Main {
    public static void main(String[] args) {
        //crear un objeto medico, instanciar
        //Una manera de dar valor a atributos privados
        //en una clase es atraves de el constructor
        //parametrizado  
        Medico  m = new Medico(1, "Federico", "Torres", TipoDocumento.CC, 12020392, 1, Especialidad.OTORRINOLARINGOLOGIA); 
        //instanciar otro medica
        Medico m2= new Medico();
        //se debe utilizar primero el Setter 
        //del atributo a asignar
        m2.setNombre("JUAN DE DIOS");
        m2.setApellido("Pantoja");
        m2.setNumeroDocumento(1075792381);
        System.out.println("Nombre del doctor: "+m2.getNombre()+ "| Apellido del doctor: " + m2.getApellido());
        System.out.println("--------------------------------------------");
        Paciente p= new Paciente();
        p.setNombre("Nicolas");
        p.setApellido("Tesla");
        System.out.println("Nombre del paciente: "+ p.getNombre()+"|Apellido del paciente:  "+ p.getApellido());
        
        System.out.println("--------------------------------------------");

        Consultorio Co = new Consultorio();
        Co.setDireccion("Tv 142 #150-50");
        Co.setNumero(1134);
        System.out.println("Direccion del consultorio: "+Co.getDireccion()+ "| Numero del consultorio: "+Co.getNumero());
       
        System.out.println("--------------------------------------------");

        Citas c = new Citas();
        c.setMedico(m2);
        c.setPaciente(p);
        c.setConsultorio(Co);
        c.setEstado(Estado.AGENDADA);
        c.setFecha(LocalDateTime.now());
        System.out.println("nombre del medico: "+c.getMedico().getNombre() +"| Nombre del paciente: "+c.getPaciente().getNombre()+"| Estado de la cita: "+c.getEstado()+"| Fecha: "+c.getFecha());

    }
}