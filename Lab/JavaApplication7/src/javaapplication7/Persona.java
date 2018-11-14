package javaapplication7;


public class Persona {
       private String nombre;
       private String apellido;
       private Integer dni;
       private String domicilio;
       private Integer telefono;
       
       public Persona(String nombre, String apellido, Integer dni, String domicilio, Integer telefono){
           this.nombre=nombre;
           this.apellido=apellido;
           this.dni=dni;
           this.domicilio=domicilio;
           this.telefono=telefono;
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
