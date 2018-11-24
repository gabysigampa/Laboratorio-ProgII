
package javaapplication7;

/**
 *
 * @author Fernando
 */
public class Chofer extends ColeccionEmpleados{
   Movil movil;
    
    public Chofer(String nombre, String apellido, String sexo, String dni, String domicilio, String telefono, Integer diaNac, Integer mesNac, Integer anioNac,String especialidad,String nEmp,String estado){
        super(nombre, apellido, sexo, dni, domicilio, telefono, diaNac, mesNac, anioNac,especialidad,nEmp,estado);
      
    }
   public Chofer(){} 
    
    @Override
    public String toString(){

        String chofer= "Chofer:  "+getNombre()+"  "+getApellido()+
                         "\nSexo:  "+getSexo()+"  "+"\nDni:  "+getDni()+"  "+
                         "\nDomicilio:  "+getDomicilio()+"  "+"\nFecha de Nacimiento:  "+" "+
                         getDiaNac()+" / "+getMesNac()+" / "+getAnioNac()+"\nTelefono:  "+getTelefono()
                         + "\nN° de Legajo:  "+nEmp;
                         return chofer;
    }
}
