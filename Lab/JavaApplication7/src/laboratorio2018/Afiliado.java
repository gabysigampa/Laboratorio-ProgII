 
package laboratorio2018;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class Afiliado extends Persona { 
    
    private Doctor doctor;
    private Diagnostico diagnostico;
    private ArrayList<Familiar> familiares =  new ArrayList<Familiar>();
    private AbonoAfiliados abono;
    private int edad;
    private Calendar fechaDeNaciemiento = Calendar.getInstance();
    private ArrayList<Asistencia> asistencias= new ArrayList<Asistencia>();
  
    public Afiliado(){}
    
    public Afiliado(String nombre,String apellido,String sexo,String dni,String direccion,String telefono,int dia, int mes,int ano){
        super(nombre,apellido,sexo,dni,direccion,telefono);
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
        String afiliado = "Afiliado: "+getNombre() +" " +getApellido() +
                "\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()
                +"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+
                "\nEdad: "+calcularEdad();
        return afiliado;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

   
    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public ArrayList<Familiar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(Familiar f) {
        familiares.add(f);
    }

    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }

    
    public void setAsistencias(Asistencia as) {
        asistencias.add(as);
    }

    public int cantidadAsistencias(){
        int i=0;
        if(!getAsistencias().isEmpty()) {
            Iterator iterador = getAsistencias().listIterator(); 
            while (iterador.hasNext()) {
                i++; 
            }
        }
        else{
            return i;
        }
        return i;
    }
  
    public AbonoAfiliados getAbono() {
        return abono;
    }

    public void setAbono(AbonoAfiliados abono) {
        this.abono = abono;
    }  
}
