
package javaapplication7;

import InterfazGrafica.AgregarAfiliado;



public class Main {

    public static void main(String[] args) {
        Afiliado afil=new Afiliado();
        Colecciones cole= new Colecciones();
        AgregarAfiliado interfaz= new AgregarAfiliado(afil, cole);
        
        interfaz.setVisible(true);
        
    
    } 
}
