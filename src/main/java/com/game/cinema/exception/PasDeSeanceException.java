/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.cinema.exception;

/**
 *
 * @author roland
 */
public class PasDeSeanceException extends Exception{
    
public PasDeSeanceException()  {
    super("Veuillez contacter l'administrateur. Ce film n'a pas été programmé");
}  


}
