package org.ptech.java.citasmedic.entities;

import java.time.LocalDate;

import org.ptech.java.citasmedic.entities.enums.TipoDocumento;
import org.ptech.java.citasmedic.entities.enums.TipoSangre;

public class Paciente extends Usuario{
    private String correoElectronico;
    private int celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso ;
    private TipoSangre tipoSangre ;
    private char factorRH;

    
    
    @Override
    public String toString() {
        return " nombre= " + super.nombre + " apellido= " + super.apellido + " tipoIdentificacion= " + super.tipoIdentificacion + " numeroDocumento= " + super.numeroDocumento +" Paciente [correoElectronico= " + correoElectronico + ", celular= " + celular + ", fechaNacimiento= "
                + fechaNacimiento + ", altura= " + altura + ", peso=" + peso + ", tipoSangre= " + tipoSangre
                + ", factorRH= " + factorRH + "]";
    }

    public Paciente() {
    }

    public Paciente(int id, String nombre, String apellido, TipoDocumento tipoIdentificacion, int numeroDocumento, String correoElectronico, int celular, LocalDate fechaNacimiento, Double altura, Double peso,
    TipoSangre tipoSangre, char factorRH) {
        super(id, nombre, apellido, tipoIdentificacion, numeroDocumento);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
        //si quieres instanciar un medico
        //tambien debes instanciar el usuario
        // super en el constructor invoca (llama, ejecuta)
        //al constuctor de la clase padre( superclase )
        //el super() llama al constructor de la superclase
        //debe ser lo primero que aparezca
        //en la clase hija 
        //a continuacion incializamos 
        //atributos propios de la clase hijo

    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

    
    
    
}
