package laboratorio2018;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;


public class Asistencia {

    private Movil movil;
    private Empleado empleado;
    private Diagnostico diagnostico;
    private Doctor doctor;
    private Enfermero enfermero;
    private Chofer chofer;
    private Administrativo administrativo;
    private Calendar fecha = Calendar.getInstance();
    private String dia;
    private String mes;
    private String anio;
    private Afiliado afi;
    private Familiar fam;

    public Asistencia(Afiliado afil,Familiar famil,Movil m, Doctor doc, Enfermero enf, Chofer ch, Administrativo ad, String dia, String mes, String anio, Diagnostico d) {
        doctor = doc;
        movil = m;
        enfermero = enf;
        chofer = ch;
        administrativo = ad;
        diagnostico = d;
        afi=afil;
        fam=famil;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        String datos = "Fecha de la Asistencia:" + getDia() + "/" + getMes() + "/" + getAnio()+
                "\n\nAfiliado: "+getAfi().getNombre()+" "+getAfi().getApellido()+
                "\n\nFamiliar: "+getFam().getNombre()+" "+getFam().getApellido()+
                "\n\nEMPLEADOS QUE ASISTIERON A LA EMERGENCIA MEDICA:\n\n"
                + "Doctor: "+getDoctor().getNombre()+" "+getDoctor().getApellido()+
                "\n\nEnfermero: "+getEnfermero().getNombre()+" "+getEnfermero().getApellido()
                +"\n\nChofer: "+getChofer().getNombre()+" "+getChofer().getApellido()+
                "\n\nAdministrativo que tomo el pedido de asistencia: "
                +getAdministrativo().getNombre()+" "+getAdministrativo().getApellido()
                +"\n\nMovil:  "+getMovil().getNum()+"\nMarca: "+getMovil().getMarca()+
                "\nPatente: "+getMovil().getPatente()+
                "\n\nDIAGNOSTICO Y TRATAMIENTO:\n\n"+getDiagnostico();
        return datos;
    }

    public Afiliado getAfi() {
        return afi;
    }

    public void setAfi(Afiliado afi) {
        this.afi = afi;
    }

    public String getFecha() {

        DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        String time = formato1.format(fecha.getTime());
        return time;
    }

    public void setFecha(int dia, int mes, int anio) {
        fecha.set(dia, mes, anio);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public Administrativo getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }

    public Familiar getFam() {
        return fam;
    }

    public void setFam(Familiar fam) {
        this.fam = fam;
    }

    
    
    
}
