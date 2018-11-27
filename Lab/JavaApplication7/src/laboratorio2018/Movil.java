
package laboratorio2018;

public class Movil {
    private String modelo;
    private String marca;
    private String patente;
    private String num;
    private String estado;
    
    public Movil(){}
    
    public Movil(String modelo,String marca,String patente,String num,String estado){
        this.marca=marca;
        this.modelo=modelo;
        this.patente=patente;
        this.num=num;
        this.estado=estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        String movil ="MOVIL: "+"\nNumero: "+getNum()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nPatente: "+getPatente()+"\nEstado: "+getEstado();
        return movil;
    }
    
}
