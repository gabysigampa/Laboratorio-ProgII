
package laboratorio2018;

import Interfaz.MenuPrincipal;

public class Laboratorio2018 {

    public static void main(String[] args) {
        
        
        AbonoAfiliados abono1 = new AbonoAfiliados(15,11,2018,1000); //abono1.fechaPagoAbono();System.out.println("cond: "+abono1.fechaPagoAbono());
        AbonoAfiliados abono2 = new AbonoAfiliados(2,11,2018,1000);//abono2.fechaPagoAbono();
        AbonoAfiliados abono3 = new AbonoAfiliados(10,10,2018,1000);//abono3.fechaPagoAbono();
        
        
        Afiliado afi1 = new Afiliado("Fernando","Zalazar","Masculino","39015819","32 vv sur","231259",17,6,1996);
        Afiliado afi2 = new Afiliado("Billy","Salvatierra","Masculino","34765845","San Antonio","342555",11,10,1995);
        Afiliado afi3 = new Afiliado("MAria","Andrada","Femenina","31078983","Alem","40234210",5,1,1988);
        
        afi1.setAbono(abono1);
        afi2.setAbono(abono2);
        afi3.setAbono(abono3);
        
        Familiar f1 = new Familiar("Enzo","Avellaneda","Masculino","31231755","Sumalao","382556",14,8,1981,"Hermano","41015072");
        Familiar f2 = new Familiar("Maria","Rodriguez","Femenino","10123456","Sumalao","123456",2,10,1993,"Prima","12345678");
        
        afi1.setFamiliares(f1);
        afi2.setFamiliares(f2);
        
    
        Movil m1 = new Movil("2016","Mercedes-Benz","AB778UE","1","Libre");
        Movil m2 = new Movil("2015","Volkswagen","AB669WE","2","Libre");
        Movil m3 = new Movil("2016","Sterling","AB145RE","3","Libre");
        Movil m4 = new Movil("2014","Skoda","AB568TE","Ambulancia 4","Libre");
        Movil m5 = new Movil("2013","Peugeot","AB113OE","Ambulancia 5","Libre");
        Movil m6 = new Movil("2017","Toyota","AB998PE","Ambulancia 6","Libre");
        
        
        Doctor doc1 = new Doctor("Paola","Jacobo","Femenina","20147158","Av Ocampos","777888",1,2,1980,"Doctor","1125","Libre");
        Doctor doc2 = new Doctor("Nain","Maldonado","Masculino","20123456","Maipu","123456",2,3,1977,"Doctor","1138","Libre");
        Doctor doc3 = new Doctor("Roberto","Maza","Masculino","31213546","Chacabuco","651475",4,5,1960,"Doctor","1100","Libre");
        
        Enfermero enf1 = new Enfermero("Fabian","Moya","Masculino","30123456","Santa Rosa","854698",4,6,1985,"Enfermero","123","Libre");
        Enfermero enf2 = new Enfermero("Silvio","Moya","Masculino","250123456","Sumalao","212425",14,8,1956,"Enfermero","124","Libre");
        Enfermero enf3 = new Enfermero("Adriana","Romero","Femenino","14111774","Sumalao","121314",22,12,1974,"Enfermero","125","Libre");
        
        Chofer ch1 = new Chofer("Jeronimo","Rivas","Masculino","193456","San Isidro","854588",18,2,1983,"Chofer","12","Libre");
        Chofer ch2 = new Chofer("Eduardo","Monje","Masculino","13222333","Fray Mamerto","147547",13,11,1980,"Chofer","13","Libre");
        Chofer ch3 = new Chofer("Armando","Avellaneda","Masculino","9123456","Sumalao","969669",1,29,1957,"Chofer","14","Libre");
        
        Administrativo ad1 = new Administrativo("Natalia","Florez","Femenino","38123456","San Martin","654321",23,5,1968,"Administrativo","1","Libre");
        Administrativo ad2 = new Administrativo("Mercedes","Castro","Femenino","37123456","Mate de Luna","222244",5,6,1975,"Administrativo","2","Libre");
        Administrativo ad3 = new Administrativo("Elizabeth","Perna","Femenino","34555888","Rivadavia","363532",4,10,1970,"Administrativo","3","Libre");
        
        
        
        
        Sistema sistema = new Sistema();
        
        sistema.setAfiliados(afi1);
        sistema.setAfiliados(afi2);
        sistema.setAfiliados(afi3);
        
        
        sistema.setDoctores(doc1);
        sistema.setDoctores(doc2);
        sistema.setDoctores(doc3);
        
        sistema.setEnfermeros(enf1);
        sistema.setEnfermeros(enf2);
        sistema.setEnfermeros(enf3);
        
        sistema.setChoferes(ch1);
        sistema.setChoferes(ch2);
        sistema.setChoferes(ch3);
        
        sistema.setMovil(m1);
        sistema.setMovil(m2);
        sistema.setMovil(m3);
        sistema.setMovil(m4);
        sistema.setMovil(m5);
        sistema.setMovil(m6);
        
        sistema.setAdminis(ad1);
        sistema.setAdminis(ad2);
        sistema.setAdminis(ad3);
        
        Afiliado afiliado = new Afiliado();
        
        afiliado.setFamiliares(f1);
        afiliado.setFamiliares(f2);
        
        Empleado emple1 = new Doctor("Paola","Jacobo","Femenina","20147158","Av Ocampos","777888",1,2,1980,"Doctor","1125","Libre");
        Empleado emple2 = new Doctor("Nain","Maldonado","Masculino","20123456","Maipu","123456",2,3,1977,"Doctor","1138","Libre");
        Empleado emple3 = new Doctor("Roberto","Maza","Masculino","31213546","Chacabuco","651475",4,5,1960,"Doctor","1100","Libre");
        Empleado emple4 = new Enfermero("Fabian","Moya","Masculino","30123456","Santa Rosa","854698",4,6,1985,"Enfermero","123","Libre");
        Empleado emple5 = new Enfermero("Silvio","Moya","Masculino","250123456","Sumalao","212425",14,8,1956,"Enfermero","124","Libre");
        Empleado emple6 = new Enfermero("Adriana","Romero","Femenino","14111774","Sumalao","121314",22,12,1974,"Enfermero","125","Libre");
        Empleado emple7 = new Chofer("Jeronimo","Rivas","Masculino","193456","San Isidro","854588",18,2,1983,"Chofer","12","Libre");
        Empleado emple8 = new Chofer("Eduardo","Monje","Masculino","13222333","Fray Mamerto","147547",13,11,1980,"Chofer","13","Libre");
        Empleado emple9 = new Chofer("Armando","Avellaneda","Masculino","9123456","Sumalao","969669",1,29,1957,"Chofer","14","Libre");
        Empleado emple10 = new Administrativo("Natalia","Florez","Femenino","38123456","San Martin","654321",23,5,1968,"Administrativo","1","Libre");
        Empleado emple11 = new Administrativo("Mercedes","Castro","Femenino","37123456","Mate de Luna","222244",5,6,1975,"Administrativo","2","Libre");
        Empleado emple12 = new Administrativo("Elizabeth","Perna","Femenino","34555888","Rivadavia","363532",4,10,1970,"Administrativo","3","Libre");
        
        Empleado empleado = new Empleado();
        empleado.setDoctores(doc1);
        empleado.setDoctores(doc2);
        empleado.setDoctores(doc3);
        empleado.setEnfermeros(enf1);
        empleado.setEnfermeros(enf2);
        empleado.setEnfermeros(enf3);
        empleado.setChoferes(ch1);
        empleado.setChoferes(ch2);
        empleado.setChoferes(ch3);
        empleado.setAdminis(ad1);
        empleado.setAdminis(ad2);
        empleado.setAdminis(ad3);
       
       sistema.setEmpleados(emple1);
       sistema.setEmpleados(emple2);
       sistema.setEmpleados(emple3);
       sistema.setEmpleados(emple4);
       sistema.setEmpleados(emple5);
       sistema.setEmpleados(emple6);
       sistema.setEmpleados(emple7);
       sistema.setEmpleados(emple8);
       sistema.setEmpleados(emple9);
       sistema.setEmpleados(emple10);
       sistema.setEmpleados(emple11);
       sistema.setEmpleados(emple12);
      
        MenuPrincipal menu1 = new MenuPrincipal();
        menu1.setVisible(true);
         
    }
    
}
