/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Fernando
 */
public class CampoVacioEx extends Exception{
    public CampoVacioEx(String mensaje){
        super(mensaje);
    }
    
    public CampoVacioEx(){}
}
