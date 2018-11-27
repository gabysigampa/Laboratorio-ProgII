package laboratorio2018;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class Empleado extends Persona{
    
    private String profesion;
    private String legajo;
    private Calendar fechaDeNaciemiento = Calendar.getInstance();
    private int edad;
    private ArrayList<Doctor> doctores = new ArrayList<Doctor>();
    private ArrayList<Enfermero> enfermeros = new ArrayList<Enfermero>();
    private ArrayList<Chofer> choferes = new ArrayList<Chofer>();
    private ArrayList<Administrativo> adminis = new ArrayList<Administrativo>();
    private String estado;

    public Empleado(){}

    public Empleado(String nombre, String apellido, String sexo, String dni, String direccion, String telefono,int dia, int mes,int ano,String profesion,String legajo,String estado){
        super(nombre,apellido,sexo,dni,direccion,telefono);
        this.profesion=profesion;
        this.legajo=legajo;
        this.estado=estado;
        fechaDeNaciemiento.set(ano,mes-1,dia);
        edad = this.calcularEdad();
        
    }

    public int calcularEdad(){
        int edad=0;
        Calendar fechaActual = Calendar.getInstance();
        int anioAc = fechaActual.get(Calendar.YEAR);
        int mesAc = fechaActual.get(Calendar.MONTH);
        int diaAc = fechaActual.get(Calendar.DAY_OF_MONTH);
        int anioNac = fechaDeNaciemiento.get(Calendar.YEAR);
        int mesNac = fechaDeNaciemiento.get(Calendar.MONTH);
        int diaNac = fechaDeNaciemiento.get(Calendar.DAY_OF_MONTH);
        if(mesAc>mesNac){
            edad = anioAc - anioNac;
        }
        if(mesAc<mesNac){
            edad = anioAc - anioNac-1;
        }
        if(mesAc==mesNac){
            if(diaAc>=diaNac){
                edad = anioAc - anioNac;
            }
            else{
                edad = anioAc - anioNac-1;
            }
        }
        if(edad==0){
            if(mesAc>mesNac){
                edad = mesAc - mesNac;
            }
            if(mesAc<mesNac){
                edad = 12 - mesNac + mesAc;
            }
            if(mesAc==mesNac){
                if(diaAc>=diaNac){
                    edad = mesAc - mesNac;
                }
                else{
                    edad = mesAc - mesNac-1;
                }
            }
        }
        if(anioNac>anioAc){System.out.println("FECHA DE NACIMIENTO MAL INGRESADA");}
        return edad;
    }
    
     public String getFechaDeNaciemiento() {
        DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato1.format(fechaDeNaciemiento.getTime());
        return fecha;
    }
    
    public void setFechaDeNaciemiento(int dia, int mes, int ano){
        fechaDeNaciemiento.set(ano,mes-1,dia);
    }
    
    @Override
    public String toString(){
        String empleado =getProfesion()+": "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+"\nEdad: "+calcularEdad()+"\nLegajo: "+getLegajo();
        return empleado;
    }
    
    public String getProfesion() {
        return profesion;
    }

    
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    
    public String getLegajo() {
        return legajo;
    }

    
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    public ArrayList<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(Enfermero e) {

        enfermeros.add(e);
    }
    
    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(Doctor d) {
        doctores.add(d);
    }

    public void setChoferes(Chofer c) {
        choferes.add(c);
    }

    public ArrayList<Chofer> getChoferes() {
        return choferes;
    }

    public void setAdminis(Administrativo ad) {
        adminis.add(ad);
    }

    public ArrayList<Administrativo> getAdminis() {
        return adminis;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
