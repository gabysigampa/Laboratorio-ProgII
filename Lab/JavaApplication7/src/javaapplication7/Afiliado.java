
package javaapplication7;

public class Afiliado extends Persona{
    private Integer numeroAfiliado;
    private Integer abono;
    //otro atrubituo para ver familiares asignados a este afiliado
    
    public Afiliado(String nombre, String apellido, Integer dni, String domicilio, Integer telefono, Integer numeroAfiliado, Integer abono){
        super(nombre, apellido, dni, domicilio, telefono);
        this.numeroAfiliado=numeroAfiliado;
        this.abono=abono;
    }
    
    public Afiliado(){}

    
    public Integer getNumeroAfiliado() {
        return numeroAfiliado;
    }

    
    public void setNumeroAfiliado(Integer numeroAfiliado) {
        this.numeroAfiliado = numeroAfiliado;
    }

    
    public Integer getAbono() {
        return abono;
    }

    
    public void setAbono(Integer abono) {
        this.abono = abono;
    }
    
}
