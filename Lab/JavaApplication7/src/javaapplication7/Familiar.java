/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Fernando
 */
public class Familiar extends Persona{
    private String dniFamiliar;
    
    public Familiar(String nombre, String apellido, String sexo, String dni, String domicilio, String telefono, Integer diaNac,Integer mesNac, Integer anioNac, String dniFamiliar){
        super(nombre, apellido, sexo, dni, domicilio, telefono, diaNac, mesNac, anioNac);
        this.dniFamiliar=dniFamiliar;
    }
    
    public Familiar(){}

    
    public String getDniFamiliar() {
        return dniFamiliar;
    }

    
    public void setDniFamiliar(String dniFamiliar) {
        this.dniFamiliar = dniFamiliar;
    }
}
