/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.cinema.Interface;

/**
 *
 * @author roland
 */
public interface IGestCinema {

    public void creerFilm(String titreFilm, String descriptif, String realisateur, int annee);

    public int calculeChiffreAffaires();

    public void nouvelleSemaine();

    public float tauxRemplissage(String titreFilm);

}
