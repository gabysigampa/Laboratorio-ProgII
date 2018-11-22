
package javaapplication7;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Colecciones {
    private ArrayList<Afiliado> afiliados=new ArrayList<Afiliado>();
    private ArrayList<Familiar> familiares=new ArrayList<Familiar>();
    private ArrayList<Doctor> doctores= new ArrayList<>();
    private ArrayList<Enfermero> enfermeros=new ArrayList<>();
    private ArrayList<Chofer> choferes=new ArrayList<>();
    private ArrayList<Administrativo> administrativos=new ArrayList<Administrativo>();

    
    
     
    public ArrayList<Afiliado> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(Afiliado afiliado) {
         afiliados.add(afiliado);
    }
    
    public ArrayList<Familiar> getFamiliares(){
        return familiares;
    }
    
    public void setFamiliares(Familiar familiar){
        familiares.add(familiar);
    }
    
    public ArrayList<Doctor> getDoctores(){
        return doctores;
    }
    
    public void setDoctores(Doctor doctor){
        doctores.add(doctor);
    }
    
    public ArrayList<Enfermero> getEnfermeros(){
        return enfermeros;
    }
    
    public void setEnfermeros(Enfermero enfermero){
        enfermeros.add(enfermero);
    }
    
    public ArrayList<Chofer> getChoferes(){
        return choferes;
    }

    public void setChoferes(Chofer chofer){
        choferes.add(chofer);
    }
    
    public ArrayList<Administrativo> getAdministrativos(){
        return administrativos;
    }
    
    public void setAdministrativos(Administrativo admin){
        administrativos.add(admin);
    }
    
   
}
