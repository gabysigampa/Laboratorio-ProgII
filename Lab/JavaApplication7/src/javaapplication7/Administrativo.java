
package javaapplication7;


public class Administrativo extends Persona{
    private Integer numeroIdentificacion;
    
    public Administrativo(String nombre, String apellido, Integer dni, String domicilio, Integer telefono, Integer numeroIdentificacion){
        super(nombre, apellido, dni, domicilio, telefono);
        this.numeroIdentificacion=numeroIdentificacion;
    }
    
    public Administrativo(){}

   
    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    
    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
}
