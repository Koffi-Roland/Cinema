/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.cinema;

/**
 *
 * @author roland
 */
public class Film {

    private Long id;

    private String titre;

    private String nomRealisateur;

    private String year;

    private String descriptif;

    private boolean aLaffiche;

    public Film(String titre, String nomRealisateur, String year, String descriptif, boolean aLaffiche) {
        this.titre = titre;
        this.nomRealisateur = nomRealisateur;
        this.year = year;
        this.descriptif = descriptif;
        this.aLaffiche = aLaffiche;
    }

    public Film(String titre, String nomRealisateur, String year, String descriptif) {
        this.titre = titre;
        this.nomRealisateur = nomRealisateur;
        this.year = year;
        this.descriptif = descriptif;
    }

    public Film(Long id, String titre, String nomRealisateur, String year, String descriptif, boolean aLaffiche) {
        this.id = id;
        this.titre = titre;
        this.nomRealisateur = nomRealisateur;
        this.year = year;
        this.descriptif = descriptif;
        this.aLaffiche = aLaffiche;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isaLaffiche() {
        return aLaffiche;
    }

    public void setaLaffiche(boolean aLaffiche) {
        this.aLaffiche = aLaffiche;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNomRealisateur() {
        return nomRealisateur;
    }

    public void setNomRealisateur(String nomRealisateur) {
        this.nomRealisateur = nomRealisateur;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

}
