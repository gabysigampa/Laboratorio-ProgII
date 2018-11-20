
package javaapplication7;


public class Enfermero extends Persona{
    private String numEmpleado;
    
    public Enfermero(String nombre, String apellido, String sexo, Integer dni, String domicilio, Integer telefono, Integer diaNac, Integer mesNac, Integer anioNac, String numEmpleado){
        super(nombre, apellido, sexo, dni, domicilio, telefono, diaNac, mesNac, anioNac);
        this.numEmpleado=numEmpleado;
    }
    
    public Enfermero(){}

    /**
     * @return the numEmpleado
     */
    public String getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * @param numEmpleado the numEmpleado to set
     */
    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
}
