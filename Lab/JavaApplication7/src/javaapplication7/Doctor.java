
package javaapplication7;

/**
 *
 * @author Fernando
 */
public class Doctor extends Persona{
    private String especialidad;
    private Integer matricula;
    
    public Doctor(String nombre, String apellido, Integer dni, String domicilio, Integer telefono, String especialidad, Integer matricula){
        super(nombre, apellido, dni, domicilio, telefono);
        this.especialidad=especialidad;
        this.matricula=matricula;
    }

    
    public String getEspecialidad() {
        return especialidad;
    }

    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    public Integer getMatricula() {
        return matricula;
    }

    
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
