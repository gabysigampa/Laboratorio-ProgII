
package laboratorio2018;

import java.util.ArrayList;

public class Doctor extends Empleado {
    private ArrayList<Afiliado> afiliados =  new ArrayList<Afiliado>();

    public Doctor(String nombre, String apellido, String sexo, String dni, String direccion, String telefono,int dia, int mes,int ano,String profesion,String legajo,String estado){
        super(nombre,apellido,sexo,dni,direccion,telefono,dia,mes,ano,profesion,legajo,estado);
    }

    @Override
    public String toString(){
        String doctor = "Doctor: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()
                +"\nDireccion: "+getDireccion()+"\nN° Legajo: "+getLegajo()+"\nEstado: "+getEstado();
        return doctor;
    }

    public Afiliado getAfiliado(String dni) {
        
        Afiliado resultado = null;
        for (Afiliado afiliado : afiliados){
            if(afiliado.getDni().equals(dni)){
                resultado = afiliado;
            }
        }
        return resultado;
    }

    public void setAfiliado(Afiliado a) {
       afiliados.add(a);
    }

}
