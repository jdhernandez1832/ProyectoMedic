package org.ptech.java.citasmedic.entities;

import org.ptech.java.citasmedic.entities.enums.Especialidad;
import org.ptech.java.citasmedic.entities.enums.TipoDocumento;

//clases que heredan se le llaman: 
//-hijas
//-subclases
//-clases detalles
//-clases especificas
public class Medico extends Usuario {

    //POR REGLA GENERA:
    //Los atributos de una clase debe ser private
    
    private int registroMedico;
    private Especialidad especialidad;

    public Medico() {
    }

    public Medico(int id, String nombre, String apellido, TipoDocumento tipoIdentificacion, int numeroDocumento,
            int registroMedico, Especialidad especialidad) {
        super(id, nombre, apellido, tipoIdentificacion, numeroDocumento);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public int getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(int registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    



    

    
    //Getters y Setters
    //deben ser publicos
    //Firma de un Getter
    //Tipo de dato de retorno de un getter
    //el tipo de dato del atributo
    //Nombre del metodo:
    //get seguido del nombre del atributo
    //Parametros: 0
    //retorna: el valor de un atributo

    
    
    //Setter: sirve para asignar
    //un valor a un atributo privado
    //Firma de un setter
    //-Tipo de dato de retorno: Void-vacio
    //- Nombre: set seguido del atributo
    //- Parametros: 1, ingresar del valor a asignar al
    //                  al atributo 
    //- Retorna: nada
   

    
}
