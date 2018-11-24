
package javaapplication7;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class ColeccionEmpleados extends Persona {

    String especialidad;
    String nEmp;
    String estado;
    private ArrayList<Doctor> doctores= new ArrayList<Doctor>();
    private ArrayList<Enfermero> enfermeros=new ArrayList<Enfermero>();
    private ArrayList<Chofer> choferes=new ArrayList<Chofer>();
    private ArrayList<Administrativo> administrativos=new ArrayList<Administrativo>();

    
    
    public ColeccionEmpleados(){}
        
        
    public ColeccionEmpleados(String nombre, String apellido, String sexo, String dni, String domicilio, String telefono, Integer diaNac, Integer mesNac, Integer anioNac,String especialidad,String nEmp,String estado){
        super(nombre,apellido,sexo,dni,domicilio,telefono ,diaNac, mesNac,anioNac);
        this.especialidad=especialidad;
        this.nEmp=nEmp;
        this.estado=estado;
       
     
        
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getnEmp() {
        return nEmp;
    }

    public void setnEmp(String nEmp) {
        this.nEmp = nEmp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(Doctor d) {
        doctores.add(d);
    }

    public ArrayList<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(Enfermero e) {
        enfermeros.add(e);
    }

    public ArrayList<Chofer> getChoferes() {
        return choferes;
    }

    public void setChoferes(Chofer c) {
        choferes.add(c);
    }

    public ArrayList<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(Administrativo a) {
        this.administrativos.add(a);
    }
        
        
        
    
    
    
    
    
    
    
   /*     @Override
    public String toString(){

        String empleadoss= ""+getNombre()+"  "+getApellido()+
                         "\nSexo:  "+getSexo()+"  "+"\nDni:  "+getDni()+"  "+
                         "\nDomicilio:  "+getDomicilio()+"  "+"\nFecha de Nacimiento:  "+" "+
                         getDiaNac()+" / "+getMesNac()+" / "+getAnioNac()+"\nTelefono:  "+getTelefono();
                         return empleadoss;
        
        */
        
    }
    
    

    
    

    
    
     


