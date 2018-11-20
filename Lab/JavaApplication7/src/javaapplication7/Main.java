
package javaapplication7;

import InterfazGrafica.AgregarAfiliado;
import InterfazGrafica.MenuPrincipal;



public class Main {

    public static void main(String[] args) {
        Afiliado afil=new Afiliado();
        Colecciones cole= new Colecciones();
        MenuPrincipal interfaz=new MenuPrincipal(afil, cole);
        
        Afiliado afiliado = new Afiliado("Jose","Perez","Masculino",383455555 ,"Calle falsa 123",298222, 0, 0,8,5,1998);
        cole.setAfiliados(afiliado);
        
        interfaz.setVisible(true);
        
    
    } 
}
