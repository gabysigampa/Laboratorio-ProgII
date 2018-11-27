
package laboratorio2018;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class Familiar extends Persona{
    
    private String relacion;
    private String claveFamiliar;
    private Calendar fechaDeNaciemiento = Calendar.getInstance();
    private int edad;
    private Afiliado afiliado;
    private ArrayList<Asistencia> asistencias= new ArrayList<Asistencia>();

    public Familiar(String relacion, Afiliado afiliado) {
        this.relacion = relacion;
        this.afiliado = afiliado;
    }

    public Familiar(String nombre,String apellido,String sexo,String dni,String direccion,String telefono,int dia, int mes,int ano,String relacion,String claveFamiliar){
        super(nombre,apellido,sexo,dni,direccion,telefono);
        fechaDeNaciemiento.set(ano,mes-1,dia);
        edad = this.calcularEdad();
        this.relacion=relacion;
        this.claveFamiliar=claveFamiliar;
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
    @Override
    public String toString(){
        String familiar = "Familiar: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+"\nEdad: "+calcularEdad()+"\nRelacion: "+getRelacion()+"\n";
        return familiar;
    }

    

    public String getRelacion() {
        return relacion;
    }


    public String getFechaDeNaciemiento() {
        DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato1.format(fechaDeNaciemiento.getTime());
        return fecha;
    }
    
    public void setFechaDeNaciemiento(int dia, int mes, int ano){
        fechaDeNaciemiento.set(ano,mes-1,dia);
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getClaveFamiliar() {
        return claveFamiliar;
    }

    public void setClaveFamiliar(String claveFamiliar) {
        this.claveFamiliar = claveFamiliar;
    }

    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }

    
    public void setAsistencias(Asistencia as) {
        asistencias.add(as);
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }
    
    
}
