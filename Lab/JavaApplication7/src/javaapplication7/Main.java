
package javaapplication7;

//import InterfazGrafica.AgregarAfiliado;
import InterfazGrafica.MenuPrincipal;



public class Main {

    public static void main(String[] args) {
        
        Afiliado afil=new Afiliado();
        Colecciones cole= new Colecciones();
        
       
         Afiliado afiliado1 = new Afiliado("Jose","Perez","Masculino","383455555" ,"Calle falsa 123","298222", 0, 0,8,5,1998);
        cole.setAfiliados(afiliado1);
        Afiliado afiliado2 = new Afiliado("Fernando", "Zalazar", "Masculino", "39015819", "Barrio 32 vv sur casa 3", "3834231359", 17, 06, 1996, 0, 0);
        cole.setAfiliados(afiliado2);
        MenuPrincipal interfaz=new MenuPrincipal(afil, cole);
        
       
        
        interfaz.setVisible(true);
        
    
    } 
}
