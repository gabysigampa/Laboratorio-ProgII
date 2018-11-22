
package javaapplication7;


public class Administrativo extends Persona{
    private Integer numEmpleado;
    
    public Administrativo(String nombre, String apellido, String sexo, String dni, String domicilio, String telefono, Integer diaNac, Integer mesNac, Integer anioNac, Integer numEmpleado){
        super(nombre, apellido,sexo, dni, domicilio, telefono, diaNac, mesNac, anioNac);
        this.numEmpleado=numEmpleado;
    }
    
    public Administrativo(){}

    
    public Integer getNumEmpleado() {
        return numEmpleado;
    }

    
    public void setNumEmpleado(Integer numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

   
    
    @Override
    public String toString(){

        String administrativo= "Empleado Admnistrativo:  "+getNombre()+"  "+getApellido()+
                         "\nSexo:  "+getSexo()+"  "+"\nDni:  "+getDni()+"  "+
                         "\nDomicilio:  "+getDomicilio()+"  "+"\nFecha de Nacimiento:  "+" "+
                         getDiaNac()+" / "+getMesNac()+" / "+getAnioNac()+"\nTelefono:  "+getTelefono();
                         return administrativo;
    }
    
}
