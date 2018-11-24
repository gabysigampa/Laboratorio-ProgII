
package javaapplication7;


public class Administrativo extends ColeccionEmpleados{
   
    
    public Administrativo(String nombre, String apellido, String sexo, String dni, String domicilio, String telefono, Integer diaNac,Integer mesNac,Integer anioNac,String especialidad,String nEmp,String estado){
        super(nombre, apellido,sexo, dni, domicilio, telefono, diaNac, mesNac, anioNac,especialidad,nEmp,estado);
       
    }
    public Administrativo(){
 
    }
    

   
    
    @Override
    public String toString(){

        String administrativo1= "Empleado Admnistrativo:  "+getNombre()+"  "+getApellido()+
                         "\nSexo:  "+getSexo()+"  "+"\nDni:  "+getDni()+"  "+
                         "\nDomicilio:  "+getDomicilio()+"  "+"\nFecha de Nacimiento:  "+" "+
                         getDiaNac()+" / "+getMesNac()+" / "+getAnioNac()+"\nTelefono:  "+getTelefono();
                         return administrativo1;
    }
    
}
