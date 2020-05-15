/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.cinema;

import com.game.cinema.Enum.Tarif;
import com.game.cinema.exception.PasDeSeanceException;
import com.game.cinema.Interface.IGestCinema;
import com.game.cinema.Interface.ICinema;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author roland
 */
public class Cinema implements ICinema, IGestCinema {

    private Long id;

    private List<Salle> salles = new ArrayList<>();

    private List<Film> films = new ArrayList<>();
    private List<Seance> seances = new ArrayList<>();

    private int chiffeAffaireTotal = 0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public int getChiffeAffaireTotal() {
        return chiffeAffaireTotal;
    }

    public void setChiffeAffaireTotal(int chiffeAffaireTotal) {
        this.chiffeAffaireTotal = chiffeAffaireTotal;
    }

    @Override
    public List<String> lesSeances() {
        List<String> descriptifsDesSeances = new ArrayList<>();

        seances.forEach((seance) -> {
            descriptifsDesSeances.add(
                    "Film: " + seance.getFilm().getTitre()
                    + "  Date: " + seance.getDate_horaire()
                    + "  Salle: " + seance.getSalle().getLibelle()
                    + "  \n");
        });
        return descriptifsDesSeances;
    }

    @Override
    public String descriptifFilm(String titreFilm) {

        String descriptifFilmDemande = "";
        for (Seance seance : seances) {
            if (titreFilm.equals(seance.getFilm().getTitre())) {
                descriptifFilmDemande = seance.getFilm().getDescriptif();
            }
        }
        return descriptifFilmDemande;
    }

    @Override
    public List<String> filmsALAffiche() {
        Set<String> set = new HashSet<>();
        List<String> filmsALaffiche = new ArrayList<>(set);
        seances.stream().filter((seance) -> (seance.getFilm().isaLaffiche())).forEachOrdered((seance) -> {
            set.add(seance.getFilm().getTitre());
        });
        filmsALaffiche.addAll(set);
        return filmsALaffiche;
    }

    @Override
    public boolean achetePlace(String titreFilm, String jourHoraire, Tarif tarif) throws PasDeSeanceException {
        for (Seance seance : seances) {
            if (!seance.getFilm().getTitre().equals(titreFilm) | !seance.getDate_horaire().equals(jourHoraire)) {
                throw new PasDeSeanceException();
            }

            if (seance.estComplete()) {
                return false;
            }
            chiffeAffaireTotal += seance.getTarif(tarif);

        }
        return true;
    }

    @Override
    public void creerFilm(String titreFilm, String descriptif, String realisateur, int annee) {
        Film film = new Film(titreFilm, realisateur, String.valueOf(annee), descriptif, false);

    }

    @Override
    public int calculeChiffreAffaires() {
        return chiffeAffaireTotal;
    }

    @Override
    public void nouvelleSemaine() {
        seances.clear();
    }

    @Override
    public float tauxRemplissage(String titreFilm) {

        for (Seance seance : seances) {
            if (titreFilm.equals(seance.getFilm().getTitre())) {
                float taux = seance.getPlaceRemplie() / seance.getSalle().getNombreTotalPlaces();
                return taux;
            }
        }

        return 0;
    }

}
