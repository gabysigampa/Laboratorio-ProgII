package javaapplication7;


public abstract class Persona {
       private String nombre;
       private String apellido;
       private String sexo;
       private String dni;
       private String domicilio;
       private String telefono;
       private Integer diaNac;
       private Integer mesNac;
       private Integer anioNac;
       
       public Persona(String nombre, String apellido, String sexo, String dni, String domicilio, String telefono, Integer diaNac, Integer mesNac, Integer anioNac){
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getDiaNac() {
        return diaNac;
    }

    public void setDiaNac(Integer diaNac) {
        this.diaNac = diaNac;
    }

    public Integer getMesNac() {
        return mesNac;
    }

    public void setMesNac(Integer mesNac) {
        this.mesNac = mesNac;
    }

    public Integer getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(Integer anioNac) {
        this.anioNac = anioNac;
    }

    
     
}
