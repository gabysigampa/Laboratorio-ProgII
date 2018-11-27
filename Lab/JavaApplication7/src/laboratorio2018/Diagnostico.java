
package laboratorio2018;


public class Diagnostico {

    
    private String tratamiento;
  
    public Diagnostico(){}
    
    public Diagnostico(String tratamiento){
        
        this.tratamiento = tratamiento;
        
    }
    @Override
    public String toString(){
        String diagnostico = getTratamiento();
        return diagnostico;
    }

    
    public String getTratamiento() {
        return tratamiento;
    }


    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
    


    
}
