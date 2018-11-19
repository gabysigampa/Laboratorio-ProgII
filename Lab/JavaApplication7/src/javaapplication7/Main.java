
package javaapplication7;

import InterfazGrafica.AgregarAfiliado;
import InterfazGrafica.MenuPrincipal;



public class Main {

    public static void main(String[] args) {
        Afiliado afil=new Afiliado();
        Colecciones cole= new Colecciones();
        MenuPrincipal interfaz=new MenuPrincipal(afil, cole);
        
        
        interfaz.setVisible(true);
        
    
    } 
}
