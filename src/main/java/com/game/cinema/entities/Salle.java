/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.cinema.entities;

import java.io.Serializable;

/**
 *
 * @author roland
 */
public class Salle implements Serializable{

    private Long id;
    private String libelle;
    private Long nombreTotalPlaces;
    
    private static final long serialVersionUID = 1L;


  /*  public Salle(Long id, String libelle, Long nombreTotalPlaces) {
        this.id = id;
        this.libelle = libelle;
        this.nombreTotalPlaces = nombreTotalPlaces;
    }

    public Salle(String libelle, Long nombreTotalPlaces) {
        this.libelle = libelle;
        this.nombreTotalPlaces = nombreTotalPlaces;
    }*/
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Long getNombreTotalPlaces() {
        return nombreTotalPlaces;
    }

    public void setNombreTotalPlaces(Long nombreTotalPlaces) {
        this.nombreTotalPlaces = nombreTotalPlaces;
    }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", libelle=" + libelle + ", nombreTotalPlaces=" + nombreTotalPlaces + '}';
    }
    
    

}
