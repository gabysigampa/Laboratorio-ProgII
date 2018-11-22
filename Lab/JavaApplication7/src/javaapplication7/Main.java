
package javaapplication7;

//import InterfazGrafica.AgregarAfiliado;
import InterfazGrafica.MenuPrincipal;



public class Main {

    public static void main(String[] args) {
        
        Colecciones cole= new Colecciones();
        
        Afiliado afil=new Afiliado();
        Administrativo admin=new Administrativo();
       Doctor doctor=new Doctor();
         
        
        Afiliado afiliado = new Afiliado("Jose","Perez","Masculino","383455555" ,"Calle falsa 123","298222", 0, 0,8,5,1998);
        cole.setAfiliados(afiliado);
        
        Administrativo admi2=new Administrativo("braian","salavarria","masculino","38915932","san antonio","000000",10,10,1998,200);
        cole.setAdministrativos(admi2);
        
        Doctor doc=new Doctor("manuel","aguirrez","masculino","300006897","cordova svc","0800",12,12,1956,"doctor","0012");
        cole.setDoctores(doc);
        
        MenuPrincipal interfaz=new MenuPrincipal(afiliado,cole);
        interfaz.setVisible(true);
         
        MenuPrincipal interfaz2=new MenuPrincipal(admi2, cole);
         interfaz.setVisible(true);
        
        MenuPrincipal interfaz3=new MenuPrincipal(doc,cole);
        interfaz.setVisible(true);
         
         
         
    } 
}
