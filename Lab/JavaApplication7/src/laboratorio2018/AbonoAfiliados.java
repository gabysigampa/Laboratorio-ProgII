
package laboratorio2018;

import java.util.*;


public class AbonoAfiliados {
    
    private int diapago,mespago,aniopago;
    private Float abono;
    private String condicion;
    Calendar calendario = new GregorianCalendar();
    private ArrayList<Afiliado> afiliados = new ArrayList<Afiliado>();
    private Afiliado afiliado;
    
    public AbonoAfiliados(int diapago,int mespago,int aniopago,float abono){
        this.aniopago=aniopago;
        this.diapago=diapago;
        this.mespago=mespago;
        this.abono=abono;
    }
    public AbonoAfiliados(String condicion){
        this.condicion=condicion;
    }
    public AbonoAfiliados(int diapago,int mespago,int aniopago,float abono, String condicion){
        this.aniopago=aniopago;
        this.diapago=diapago;
        this.mespago=mespago;
        this.abono=abono;
        this.condicion=condicion;
    }
    
    public String fechaPagoAbono(){
        int diaPagar,mesPagar,anioPagar;
        anioPagar = (calendario.get(Calendar.YEAR))- aniopago;
        Math.abs(anioPagar);
        mesPagar = (calendario.get(Calendar.MONTH)+1)- mespago;
       Math.abs(mesPagar);
        diaPagar = (calendario.get(Calendar.DAY_OF_MONTH))- aniopago;
        Math.abs(diaPagar);
       
        if(anioPagar==0 && mesPagar<=2 && mesPagar>=0 /*&& diaPagar <= 0*/){
            System.out.println("Comparacion;");
            if(mesPagar==0 /*&& diaPagar>0*/){
                condicion="SIN MORA";
                System.out.println("Condicion: "+condicion);
            }
            if(mesPagar>0 && mesPagar<=2 /*&& diaPagar <=0*/){
                condicion="SIN MORA";
                System.out.println("Condicion2: "+condicion);
            }
            
            return condicion;
        }else{
            condicion="MOROSO";
            System.out.println("Condicion3: "+condicion);
        } 
        
        return condicion; 
    }
    /*public ArrayList<Afiliado> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(Afiliado a) {
        afiliados.add(a);
    }*/

    public int getDia() {
        return diapago;
    }

    public void setDia(int dia) {
        this.diapago = dia;
    }

    public int getMes() {
        return mespago;
    }

    public void setMes(int mes) {
        this.mespago = mes;
    }

    public int getAnio() {
        return aniopago;
    }

    public void setAnio(int anio) {
        this.aniopago = anio;
    }

    public float getAbono() {
        return abono;
    }

    public void setAbono(float abono) {
        this.abono = abono;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }
    @Override
    public String toString(){
        String abon = "Dia de pago: "+getDia()+"\nMes de pago: "+getMes()+"\nAño de pago: "+getAnio()+"\nAbono pagado: "+getAbono()+"\nCondicion: "+fechaPagoAbono();
        return abon;
    }
    
}
