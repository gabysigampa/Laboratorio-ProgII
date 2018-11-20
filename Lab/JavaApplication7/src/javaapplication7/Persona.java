package javaapplication7;


public class Persona {
       protected String nombre;
       protected String apellido;
       protected String sexo;
       protected Integer dni;
       protected String domicilio;
       protected Integer telefono;
       protected Integer diaNac;
       protected Integer mesNac;
       protected Integer anioNac;
       
       public Persona(String nombre, String apellido, String sexo, Integer dni, String domicilio, Integer telefono, Integer diaNac, Integer mesNac, Integer anioNac){
           this.nombre=nombre;
           this.apellido=apellido;
           this.sexo=sexo;
           this.dni=dni;
           this.domicilio=domicilio;
           this.telefono=telefono;
           this.diaNac=diaNac;
           this.mesNac=mesNac;
           this.anioNac=anioNac;
       }
       
       public Persona(){}

    
    public String getNombre() {
        return nombre;
    }

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellido() {
        return apellido;
    }

    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public Integer getDni() {
        return dni;
    }

    
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    
    public String getDomicilio() {
        return domicilio;
    }

    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    
    public Integer getTelefono() {
        return telefono;
    }

    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
        
}
