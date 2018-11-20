
package javaapplication7;

/**
 *
 * @author Fernando
 */
public class Chofer extends Persona{
    private String numEmpleado;
    
    public Chofer(String nombre, String apellido, String sexo, Integer dni, String domicilio, Integer telefono, Integer diaNac, Integer mesNac, Integer anioNac, String numEmpleado){
        super(nombre, apellido, sexo, dni, domicilio, telefono, diaNac, mesNac, anioNac);
        this.numEmpleado=numEmpleado;
    }

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
