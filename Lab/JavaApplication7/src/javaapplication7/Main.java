
package javaapplication7;

//import InterfazGrafica.AgregarAfiliado;
import InterfazGrafica.MenuPrincipal;



public class Main {

    public static void main(String[] args) {
        
        ColeccionEmpleados cole= new ColeccionEmpleados();
       
        
         
      
        
       Administrativo admin=new Administrativo("braian","salavarria","masculino","38915932","san antonio","000000",10,10,1998,"empleado","0001","activo");
        cole.setAdministrativos(admin);
        
        Doctor doc=new Doctor("manuel","aguirrez","masculino","300006897","cordova svc","0800",12,12,1956,"doctor","0012","activo");
        cole.setDoctores(doc);
        
        Enfermero enf=new   Enfermero("samuel","romero","masculino","300006897","cordova svc","0800",12,12,1956,"enfermero","0012","activo");
        cole.setEnfermeros(enf);
        
        Chofer chof=new Chofer("miguel","fadel","masculino","300006897","guemes","0800",12,12,1956,"chofer","0012","activo");
        cole.setChoferes(chof);
        Afiliado afiliado=new Afiliado("miguel","fadel","masculino","300006897","guemes","0800",12,12,1956,"00012",1000);
        
        MenuPrincipal interfaz=new MenuPrincipal(cole);
        interfaz.setVisible(true);
         
      // MenuPrincipal interfaz2 = new MenuPrincipal(afiliado);
       //interfaz.setVisible(true);  
         
    } 
}
