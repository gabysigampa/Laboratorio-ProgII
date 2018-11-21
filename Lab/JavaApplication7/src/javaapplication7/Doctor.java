
package javaapplication7;

/**
 *
 * @author Fernando
 */
public class Doctor extends Persona{
    private String especialidad;
    private String numEmpleado;
    
    public Doctor(String nombre, String apellido, String sexo, String dni, String domicilio, String telefono, Integer diaNac, Integer mesNac, Integer anioNac, String especialidad, String numEmpleado ){
        super(nombre, apellido, sexo, dni, domicilio, telefono, diaNac, mesNac, anioNac);
        this.especialidad=especialidad;
        this.numEmpleado=numEmpleado;
    }

    
    public String getEspecialidad() {
        return especialidad;
    }

    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
