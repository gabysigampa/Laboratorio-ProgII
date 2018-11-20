
package javaapplication7;


public class Administrativo extends Persona{
    private Integer numEmpleado;
    
    public Administrativo(String nombre, String apellido, String sexo, Integer dni, String domicilio, Integer telefono, Integer diaNac, Integer mesNac, Integer anioNac, Integer numEmpleado){
        super(nombre, apellido,sexo, dni, domicilio, telefono, diaNac, mesNac, anioNac);
        this.numEmpleado=numEmpleado;
    }
    
    public Administrativo(){}

    /**
     * @return the numEmpleado
     */
    public Integer getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * @param numEmpleado the numEmpleado to set
     */
    public void setNumEmpleado(Integer numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

   
    
}
