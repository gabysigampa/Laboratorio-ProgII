
package javaapplication7;
import javaapplication7.Familiar;
import java.util.ArrayList;

public class Afiliado extends Persona{
    private String numeroAfiliado;
    private Integer abono;
    //atrubituo para ver familiares asignados a este afiliado
    
    private ArrayList<Familiar> familiares=new ArrayList<Familiar>();
    
    
    public Afiliado(String nombre, String apellido, String sexo, String dni, String domicilio, String telefono, Integer diaNac,Integer mesNac, Integer anioNac, String numeroAfiliado, Integer abono){
        super(nombre, apellido, sexo, dni, domicilio, telefono, diaNac, mesNac, anioNac);
        this.numeroAfiliado=numeroAfiliado;
        this.abono=abono;
    }
    
    public Afiliado(){}

    
    public String getNumeroAfiliado() {
        return numeroAfiliado;
    }

    
    public void setNumeroAfiliado(String numeroAfiliado) {
        this.numeroAfiliado = numeroAfiliado;
    }

    
    public Integer getAbono() {
        return abono;
    }

    
    public void setAbono(Integer abono) {
        this.abono = abono;
    }

    @Override
    public String toString(){

        String afiliado= "Afiliado:  "+getNombre()+"  "+getApellido() +
                         "\nSexo:  "+getSexo()+"  "+"\nDni:  "+getDni()+"  "+
                         "\nDomicilio:  "+getDomicilio()+"  "+"\nFecha de Nacimiento:  "+" "+
                         getDiaNac()+" / "+getMesNac()+" / "+getAnioNac()+"\nTelefono:  "+getTelefono();
                         return afiliado;
    }
    
}