
package laboratorio2018;


public class Chofer extends Empleado{
    
    private Movil movil;

    public Chofer(String nombre, String apellido, String sexo, String dni, String direccion, String telefono,int dia, int mes,int ano,String profesion,String legajo,String estado){
        super(nombre,apellido,sexo,dni,direccion,telefono,dia,mes,ano,profesion,legajo,estado);
        this.movil=movil;
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }

    @Override
    public String toString(){
        String chofer = "Chofer: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()
                +"\nDireccion: "+getDireccion()+"\nLegajo: "+getLegajo()+"\nEstado: "+getEstado();
        return chofer;
    }
    
}
