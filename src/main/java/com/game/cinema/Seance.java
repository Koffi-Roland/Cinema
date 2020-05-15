/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.cinema;

import com.game.cinema.Enum.Tarif;
import static java.lang.Long.sum;
import java.util.HashMap;

/**
 *
 * @author roland
 */
public class Seance {

    private Long id;

    private String date_horaire;

    private Salle salle;

    private Film film;

    private Long placeRemplie;

    private HashMap<String, Long> pricePlace = new HashMap<>();

    public HashMap<String, Long> getPricePlace() {
        return pricePlace;
    }

    public void setPricePlace(HashMap<String, Long> pricePlace) {
        this.pricePlace = pricePlace;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate_horaire() {
        return date_horaire;
    }

    public void setDate_horaire(String date_horaire) {
        this.date_horaire = date_horaire;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Long getPlaceRemplie() {

        if (null == placeRemplie) {
            placeRemplie = Long.valueOf(0);
        }
        return placeRemplie;
    }

    public void setPlaceRemplie(Long placeRemplie) {
        this.placeRemplie = placeRemplie;
    }

    //method   updatePlaceRemplie
    public Long updatePlaceRemplie() {
        //  Long placeOccupe;

        Long placeOccupe = sum(this.getPlaceRemplie(), 1);
        this.setPlaceRemplie(placeOccupe);

        return placeOccupe;

    }

    //method estComplete
    public boolean estComplete() {

        return salle.getNombreTotalPlaces() == placeRemplie;

    }

    //method for get tarif
    public int getTarif(Tarif tarif) {
        switch (tarif) {
            case NORMAL:
                return 5;
            case REDUIT:
                return 2;
            case OFFERTES:
                return 0;
        }

        return 0;
    }

}
