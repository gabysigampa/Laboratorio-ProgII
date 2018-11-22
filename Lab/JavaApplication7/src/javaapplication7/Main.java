
package javaapplication7;

//import InterfazGrafica.AgregarAfiliado;
import InterfazGrafica.MenuPrincipal;



public class Main {

    public static void main(String[] args) {
        
        Colecciones cole= new Colecciones();
        
        Afiliado afil=new Afiliado();
        Administrativo admin=new Administrativo();
       
         
        
        Afiliado afiliado = new Afiliado("Jose","Perez","Masculino","383455555" ,"Calle falsa 123","298222", 0, 0,8,5,1998);
        cole.setAfiliados(afiliado);
        
        Administrativo admi2=new Administrativo("braian","salavarria","masculino","38915932","san antonio","000000",10,10,1998,200);
        cole.setAdministrativos(admi2);
        
        
        
        MenuPrincipal interfaz=new MenuPrincipal(afiliado,cole);
        interfaz.setVisible(true);
         
        MenuPrincipal interfaz2=new MenuPrincipal(admi2, cole);
         interfaz.setVisible(true);
        
    
    } 
}
