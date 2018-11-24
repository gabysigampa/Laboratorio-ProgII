
package javaapplication7;


public class Enfermero extends ColeccionEmpleados{
    
    public Enfermero(String nombre, String apellido, String sexo, String dni, String domicilio, String telefono, Integer diaNac, Integer mesNac, Integer anioNac,String especialidad, String nEmp,String estado){
        super(nombre, apellido, sexo, dni, domicilio, telefono, diaNac, mesNac, anioNac,especialidad,nEmp,estado);
    }
 public Enfermero(){
     
 }
    
 
      
        @Override
    public String toString(){

        String enfermero= "Enfermero:  "+getNombre()+"  "+getApellido()+
                         "\nSexo:  "+getSexo()+"  "+"\nDni:  "+getDni()+"  "+
                         "\nDomicilio:  "+getDomicilio()+"  "+"\nFecha de Nacimiento:  "+" "+
                         getDiaNac()+" / "+getMesNac()+" / "+getAnioNac()+"\nTelefono:  "+getTelefono()
                        + "\nN° de Legajo:  "+nEmp;
                        return enfermero;
        
        
}
}
