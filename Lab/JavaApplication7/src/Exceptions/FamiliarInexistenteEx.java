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
public class FamiliarInexistenteEx extends Exception{
    public FamiliarInexistenteEx(String mensaje){
        super(mensaje);
    }
    
    public FamiliarInexistenteEx(){}
}
