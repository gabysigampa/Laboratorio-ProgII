package laboratorio2018;

import Exceptions.VerificarRepetidosException;
import Exceptions.AfiliadoNoEncontradoException;
import Exceptions.EmpleadoNoEncontradoException;
import Exceptions.FamiliarNoEncontradoException;
import Exceptions.VerficarCampoVacioException;
import Exceptions.VerificarDniException;
import java.util.ArrayList;

public class Sistema { 

    private ArrayList<Afiliado> afiliados = new ArrayList<Afiliado>();
    private ArrayList<Familiar> familiares = new ArrayList<Familiar>();
    private ArrayList<Doctor> doctores = new ArrayList<Doctor>();
    private ArrayList<Diagnostico> diagnosticos = new ArrayList<Diagnostico>();
    private ArrayList<Enfermero> enfermeros = new ArrayList<Enfermero>();
    private ArrayList<Chofer> choferes = new ArrayList<Chofer>();
    private ArrayList<Administrativo> adminis = new ArrayList<Administrativo>();
    private ArrayList<Movil> moviles = new ArrayList<Movil>();
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private ArrayList<AbonoAfiliados> abonos = new ArrayList<AbonoAfiliados>();
    private ArrayList<Asistencia> asistencias= new ArrayList<Asistencia>();

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

    public void verificarDatos(String dni, String nombre, String apellido, String domicilio, String telefono) throws VerificarDniException, VerficarCampoVacioException {

        if (dni.length() == 8 || dni.length() == 7) {
            int numero = Integer.parseInt(dni);
            if (numero < 1000000) {
                throw new VerificarDniException();
            }
        } else {
            throw new VerificarDniException();
        }

        if (nombre.equals("") || apellido.equals("") || domicilio.equals("") || telefono.equals("")) {
            throw new VerficarCampoVacioException();
        }

    }
    

    public void verificarDni(String dni) throws VerificarDniException {

        if (dni.length() == 8 || dni.length() == 7) {
            int numero = Integer.parseInt(dni);
            if (numero < 1000000) {
                throw new VerificarDniException();
            }
        } else {
            throw new VerificarDniException();
        }
        
    }

    public void buscarAfiliado(String dni) throws AfiliadoNoEncontradoException {
        int bandera = 0;
        for (Afiliado afi : this.getAfiliados()) {
            if (afi.getDni().equals(dni)) {
                bandera = 1;
                break;
            }
        }
        if (bandera == 0) {
            throw new AfiliadoNoEncontradoException();
        }
    }

    public void buscarRepetido(String dni) throws VerificarRepetidosException {
        for (Afiliado afi : this.getAfiliados()) {
            if (afi.getDni().equals(dni)) {
                throw new VerificarRepetidosException();
            }
        }
    }
        
        public void buscarEmpleado(String dni) throws EmpleadoNoEncontradoException {
        int bandera = 0;
        for (Afiliado afi : this.getAfiliados()) {
            if (afi.getDni().equals(dni)) {
                bandera = 1;
                break;
            }
        }
        if (bandera == 0) {
            throw new EmpleadoNoEncontradoException();
        }
    }

    public void buscarRepetido1(String dni) throws VerificarRepetidosException {
        for (Empleado emp : this.getEmpleados()) {
            if (emp.getDni().equals(dni)) {
                throw new VerificarRepetidosException();
            }
        }
    }
    public void buscarFamiliar(String dni) throws FamiliarNoEncontradoException {
        int bandera = 0;
        for (Familiar fam : this.getFamiliares()) {
            if (fam.getDni().equals(dni)) {
                bandera = 1;
                break;
            }
        }
        if (bandera == 0) {
            throw new FamiliarNoEncontradoException();
        }
    }

    public void buscarRepetido2(String dni) throws VerificarRepetidosException {
        for (Familiar fam : this.getFamiliares()) {
            if (fam.getDni().equals(dni)) {
                throw new VerificarRepetidosException();
            }
        }
    }

 
    
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    
    public void setEmpleados(Empleado emp) {
        empleados.add(emp);
    }

}
