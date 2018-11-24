
package javaapplication7;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Doctor extends ColeccionEmpleados{
   
    private ArrayList<Afiliado> afiliados =  new ArrayList<Afiliado>();
    
    public Doctor(String nombre, String apellido, String sexo, String dni, String domicilio, String telefono, Integer diaNac, Integer mesNac, Integer anioNac, String especialidad, String nEmp,String estado ){
        super(nombre, apellido, sexo, dni, domicilio, telefono, diaNac, mesNac, anioNac,especialidad,nEmp,estado);
       
    }
    public Doctor(){}
   
@Override
    public String toString(){

        String doctor= "Doctor:  "+getNombre()+"  "+getApellido()+
                         "\nSexo:  "+getSexo()+"  "+"\nDni:  "+getDni()+"  "+
                         "\nDomicilio:  "+getDomicilio()+"  "+"\nFecha de Nacimiento:  "+" "+
                         getDiaNac()+" / "+getMesNac()+" / "+getAnioNac()+"\nTelefono:  "+getTelefono()
                         + "\nN° de Legajo:  "+nEmp;
                         return doctor;
    }
    
   
}
