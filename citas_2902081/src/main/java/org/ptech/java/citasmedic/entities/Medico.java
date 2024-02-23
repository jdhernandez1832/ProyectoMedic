package org.ptech.java.citasmedic.entities;

public class Medico {
    //POR REGLA GENERA:
    //Los atributos de una clase debe ser private
    private int id;
    private String nombre;
    private String apellido;
    private TipoDocumento tipoIdentificacion;
    private int numeroDocumento;
    private int registroMedico;
    private Especialidad especialidad;

    public Medico() {
    }

    public Medico(int id, String nombre, String apellido, TipoDocumento tipoIdentificacion, int numeroDocumento,
            int registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroDocumento = numeroDocumento;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }
    //Getters y Setters
    //deben ser publicos
    //Firma de un Getter
    //Tipo de dato de retorno de un getter
    //el tipo de dato del atributo
    //Nombre del metodo:
    //          get seguido del nombre del atributo
    //Parametros: 0
    //retorna: el valor de un atributo
    public String getNombre() {
        //return sirve para
        //retornar el valor
        //al invocante 
        return this.nombre;
    }
    //Setter: sirve para asignar
    //un valor a un atributo privado
    //Firma de un setter
    //-Tipo de dato de retorno: Void-vacio
    //- Nombre: set seguido del atributo
    //- Parametros: 1, ingresar del valor a asignar al
    //                  al atributo 
    //- Retorna: nada
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDocumento getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoDocumento tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    
}
