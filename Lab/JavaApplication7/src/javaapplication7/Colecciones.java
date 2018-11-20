
package javaapplication7;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Colecciones {
    private ArrayList<Afiliado> afiliados=new ArrayList<>();
    private ArrayList<Doctor> doctores= new ArrayList<>();
    private ArrayList<Enfermero> enfermeros=new ArrayList<>();
    private ArrayList<Chofer> choferes=new ArrayList<>();
    private ArrayList<Administrativo> administrativos=new ArrayList<>();
    
    
    
    public ArrayList<Afiliado> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(Afiliado afiliado) {
        getAfiliados().add(afiliado);
    }
    
    public ArrayList<Doctor> getDoctores(){
        return doctores;
    }
    
    public void setDoctores(Doctor doctor){
        getDoctores().add(doctor);
    }
    
    public ArrayList<Enfermero> getEnfermeros(){
        return enfermeros;
    }
    
    public void setEnfermeros(Enfermero enfermero){
        getEnfermeros().add(enfermero);
    }
    
    public ArrayList<Chofer> getChoferes(){
        return choferes;
    }

    public void setChoferes(Chofer chofer){
        getChoferes().add(chofer);
    }
    
    public ArrayList<Administrativo> getAdministrativos(){
        return administrativos;
    }
    
    public void setAdministrativos(Administrativo admin){
        getAdministrativos().add(admin);
    }
    
    
}