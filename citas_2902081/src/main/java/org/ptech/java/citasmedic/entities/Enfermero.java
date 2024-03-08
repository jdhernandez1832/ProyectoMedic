package org.ptech.java.citasmedic.entities;

import java.util.ArrayList;
import java.util.List;

import org.ptech.java.citasmedic.entities.enums.TipoDocumento;

public class Enfermero extends Usuario{
    private List<String> procedimiento;

    

    @Override
    public String toString() {
        return " nombre= " + super.nombre + " apellido= " + super.apellido + " tipoIdentificacion= " + super.tipoIdentificacion + " numeroDocumento= " + super.numeroDocumento +" Enfermero [procedimiento= " + procedimiento + "]";
    }

    public Enfermero() {
    }
    //1. llamar al constructor de la super clase
    //
    public Enfermero(int id, String nombre, String apellido, TipoDocumento tipoIdentificacion, int numeroDocumento) {
        super(id, nombre, apellido, tipoIdentificacion, numeroDocumento);
    //2. inicializar atributos intrinsecps del objeto

    this.procedimiento= new ArrayList<String>();
    }

    public void addProcedure(String procedure){
        //añadir el procedimiento a
        // a la lista de procedimiento
        this.procedimiento.add(procedure);
    }

    public List<String> getProcedimiento() {
        return procedimiento;
    }

    


}
