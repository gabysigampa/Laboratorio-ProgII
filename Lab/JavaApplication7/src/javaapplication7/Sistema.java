/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;
import Exceptions.AfiliadoInexistenteEx;
import Exceptions.FamiliarInexistenteEx;
import Exceptions.EmpleadoInexistenteEx;
import Exceptions.CampoVacioEx;
import Exceptions.VerificarDniEx;
import Exceptions.VerificarRepetidosEx;


/**
 *
 * @author Fernando
 */
public class Sistema {
    
    private ArrayList<Afiliado> afiliados = new ArrayList<>();
    private ArrayList<Familiar> familiares = new ArrayList<Familiar>();
    private ArrayList<Doctor> doctores = new ArrayList<Doctor>();
    //private ArrayList<Diagnostico> diagnosticos = new ArrayList<Diagnostico>();
    private ArrayList<Enfermero> enfermeros = new ArrayList<Enfermero>();
    private ArrayList<Chofer> choferes = new ArrayList<Chofer>();
    private ArrayList<Administrativo> adminis = new ArrayList<Administrativo>();//no es necesario
    private ArrayList<Movil> moviles = new ArrayList<Movil>();
    private ArrayList<ColeccionEmpleados> empleados = new ArrayList<>();
    //private ArrayList<AbonoAfiliados> abonos = new ArrayList<AbonoAfiliados>();
    //private ArrayList<Asistencia> asistencias= new ArrayList<Asistencia>();
    
    public Sistema(){}

    public ArrayList<Afiliado> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(Afiliado a) {
        afiliados.add(a);
    }
    
    public void setFamiliares(Familiar f) {
        familiares.add(f);
    }
    public ArrayList<Familiar> getFamiliares() {
        return familiares;
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
    
    public void setMovil(Movil m){
        moviles.add(m);
    }
    
    public ArrayList<Movil> getMovil(){
        return moviles;
    }
/*
    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(Diagnostico d) {
        diagnosticos.add(d);
    }
    
    public ArrayList<AbonoAfiliados> getAbonos() {
        return abonos;
    }

    public void setAbonos(AbonoAfiliados a) {
        abonos.add(a);
    }
    
    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }

    
    public void setAsistencias(Asistencia as) {
        asistencias.add(as);
    }
*/
    public void verificarDatos(String dni, String nombre, String apellido, String domicilio, String telefono) throws VerificarDniEx, CampoVacioEx {

        if (dni.length() == 8 || dni.length() == 7) {
            int numero = Integer.parseInt(dni);
            if (numero < 1000000) {
                throw new VerificarDniEx();
            }
        } else {
            throw new VerificarDniEx();
        }

        if (nombre.equals("") || apellido.equals("") || domicilio.equals("") || telefono.equals("")) {
            throw new CampoVacioEx();
        }

    }
    

    public void verificarDni(String dni) throws VerificarDniEx {

        if (dni.length() == 8 || dni.length() == 7) {
            int numero = Integer.parseInt(dni);
            if (numero < 1000000) {
                throw new VerificarDniEx();
            }
        } else {
            throw new VerificarDniEx();
        }
        
    }

    public void buscarAfiliado(String dni) throws AfiliadoInexistenteEx {//busca a los afiliados
        int bandera = 0;
        for (Afiliado afi : this.getAfiliados()) {
            if (afi.getDni().equals(dni)) {
                bandera = 1;
                break;
            }
        }
        if (bandera == 0) {
            throw new AfiliadoInexistenteEx();
        }
    }

    public void buscarRepetido(String dni) throws VerificarRepetidosEx {//si se repite algun afiliado
        for (Afiliado afi : this.getAfiliados()) {
            if (afi.getDni().equals(dni)) {
                throw new VerificarRepetidosEx();
            }
        }
    }
        
        public void buscarEmpleado(String dni) throws EmpleadoInexistenteEx {//busca a los empleados
        int bandera = 0;
        for (Afiliado afi : this.getAfiliados()) {
            if (afi.getDni().equals(dni)) {
                bandera = 1;
                break;
            }
        }
        if (bandera == 0) {
            throw new EmpleadoInexistenteEx();
        }
    }

    public void buscarRepetido1(String dni) throws VerificarRepetidosEx {//si se repite algun empleado
        for (ColeccionEmpleados emp : this.getEmpleados()) {
            if (emp.getDni().equals(dni)) {
                throw new VerificarRepetidosEx();
            }
        }
    }
    public void buscarFamiliar(String dni) throws FamiliarInexistenteEx {//busca a los familiares de los afiliados
        int bandera = 0;
        for (Familiar fam : this.getFamiliares()) {
            if (fam.getDni().equals(dni)) {
                bandera = 1;
                break;
            }
        }
        if (bandera == 0) {
            throw new FamiliarInexistenteEx();
        }
    }

    public void buscarRepetido2(String dni) throws VerificarRepetidosEx {//si se repite algun familiar
        for (Familiar fam : this.getFamiliares()) {
            if (fam.getDni().equals(dni)) {
                throw new VerificarRepetidosEx();
            }
        }
    }

 
    
    public ArrayList<ColeccionEmpleados> getEmpleados() {
        return empleados;
    }

    
    public void setEmpleados(ColeccionEmpleados emp) {
        empleados.add(emp);
    }
    
}
