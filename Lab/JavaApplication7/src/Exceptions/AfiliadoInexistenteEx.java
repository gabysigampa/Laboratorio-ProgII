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
public class AfiliadoInexistenteEx extends Exception{
    public AfiliadoInexistenteEx(String mensaje){
        super(mensaje);
    }
    
    public AfiliadoInexistenteEx(){}
}
