/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.cinema.Interface;

import com.game.cinema.exception.PasDeSeanceException;
import com.game.cinema.Enum.Tarif;
import java.util.List;

/**
 *
 * @author roland
 */
public interface ICinema {
    
public List<String> lesSeances();
public String descriptifFilm(String titreFilm);
public List<String> filmsALAffiche();
public boolean achetePlace(String titreFilm,String jourHoraire, Tarif tarif)
throws PasDeSeanceException;
    
    
    
}
