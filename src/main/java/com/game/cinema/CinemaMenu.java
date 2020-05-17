/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.cinema;

import com.game.cinema.Enum.Tarif;
import com.game.cinema.entities.Seance;
import com.game.cinema.entities.Salle;
import com.game.cinema.entities.Cinema;
import com.game.cinema.entities.Film;
import com.game.cinema.exception.PasDeSeanceException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author roland
 */
public class CinemaMenu {

    /**
     * @param args the command line arguments
     * @throws com.game.cinema.exception.PasDeSeanceException
     */
    public static void main(String[] args) throws PasDeSeanceException {

        System.out.println("================================");

        System.out.println("'   Menu du programme Cinema   '");

        System.out.println("================================");

        System.out.println(" 1- Option préliminaire");

        System.out.println(" 2- Option financière");

        System.out.println(" 3- Option retour");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        outer:

        switch (option) {

            case 1:
                System.out.println(" 1-Demarrer un assistant cinéma(salle,film,seance)");

                System.out.println(" 2- Option retour");

                int optionPreliminaire = sc.nextInt();

                switch (optionPreliminaire) {

                    case 1:

                        assistantPriliminaire();

                        break;

                    case 2:
                        System.exit(1);

                        break;

                }

            case 2:
                System.out.println(" 1-Demarrer un assistant cinéma(option financière)");

                System.out.println(" 2- Option retour");

                int optionFinanciere = sc.nextInt();
                switch (optionFinanciere) {

                    case 1:
                        assistantFinanciere();
                        break;

                    // case 2 :        
                }

            case 3:
                break;

        }

        // TODO code application logic here
    }

    public static void assistantPriliminaire() {
        System.out.println(" Creation d'une salle par l'assistant");
        List<Salle> salles = new ArrayList<>();
        List<Seance> seances = new ArrayList<>();

        HashMap<Long, Long> pricePlace = new HashMap<>();
        Cinema cineA = new Cinema();
        Salle salle = new Salle();
        Seance seance = new Seance();
        //salle
        salle.setId(1L);
        salle.setLibelle("salle OUA");
        salle.setNombreTotalPlaces(Long.valueOf(500));
        salles.add(salle);
        salle.toString();
        System.out.println(salle.toString());

        //film
        Film film = new Film();
        film.setTitre("Halfaouine, l'enfant des terrasses ");
        film.setNomRealisateur("Férid Boughedir");
        film.setDescriptif("Un éveil à la sexualité qui ne manque pas de charme dans cette ville de Tunis riche en personnages finement écrits et interprétés");
        film.setYear(String.valueOf(1990));

        //seance
        pricePlace.put(Long.valueOf(103), Long.valueOf(5));
        seance.setId(1L);
        seance.setDate_horaire("18-05-2020 11h30");
        seance.setPlaceRemplie(Long.valueOf(3));
        seance.setFilm(film);
        seance.setPricePlace(pricePlace);
        seance.setSalle(salle);

        System.out.println(seance.toString());

        seances.add(seance);

        System.out.println("Mise en place d'un cinema par l'assistant ");
        // Cinema
        //method creerFilm
        cineA.creerFilm("Le Seigneur des Anneaux", "Le retour du roi", "Peter Jackson", 2003);
        cineA.creerFilm("Yeelen", "L'angoisse de tomber sur la séquence finale au bac ciné et résister à la tentation de dire \"Eh, tu veux embrasser mon oeuf ?", "Souleymane Cissé", 1987);
        cineA.setSalles(salles);
        //method lesSeances
        cineA.setSeances(seances);
        System.out.println(cineA.lesSeances());
    }

    public static void assistantFinanciere() throws PasDeSeanceException {
        System.out.println(" Creation d'une salle par l'assistant");
        List<Salle> salles = new ArrayList<>();
        List<Seance> seances = new ArrayList<>();

        HashMap<Long, Long> pricePlace = new HashMap<>();
        Cinema cineA = new Cinema();
        Salle salle = new Salle();
        Seance seance = new Seance();
        //salle
        salle.setId(1L);
        salle.setLibelle("salle OUA");
        salle.setNombreTotalPlaces(Long.valueOf(500));
        salles.add(salle);
        salle.toString();
        System.out.println(salle.toString());

        //film
        Film film = new Film();
        film.setTitre("Halfaouine, l'enfant des terrasses ");
        film.setNomRealisateur("Férid Boughedir");
        film.setDescriptif("Un éveil à la sexualité qui ne manque pas de charme dans cette ville de Tunis riche en personnages finement écrits et interprétés");
        film.setYear(String.valueOf(1990));

        //seance
        pricePlace.put(Long.valueOf(103), Long.valueOf(5));
        seance.setId(1L);
        seance.setDate_horaire("18-05-2020 11h30");
        seance.setPlaceRemplie(Long.valueOf(3));
        seance.setFilm(film);
        seance.setPricePlace(pricePlace);
        seance.setSalle(salle);

        System.out.println(seance.toString());

        seances.add(seance);

        System.out.println("Mise en place d'un cinema par l'assistant ");
        // Cinema
        //method creerFilm
        cineA.creerFilm("Le Seigneur des Anneaux", "Le retour du roi", "Peter Jackson", 2003);
        cineA.creerFilm("Yeelen", "L'angoisse de tomber sur la séquence finale au bac ciné et résister à la tentation de dire \"Eh, tu veux embrasser mon oeuf ?", "Souleymane Cissé", 1987);
        cineA.setSalles(salles);
        //method lesSeances
        cineA.setSeances(seances);
        System.out.println(cineA.lesSeances());

        System.out.println("Situation financiere ");

        cineA.achetePlace("Halfaouine, l'enfant des terrasses ", "18-05-2020 11h30", Tarif.NORMAL);
        cineA.achetePlace("Halfaouine, l'enfant des terrasses ", "18-05-2020 11h30", Tarif.REDUIT);
        cineA.achetePlace("Halfaouine, l'enfant des terrasses ", "18-05-2020 11h30", Tarif.OFFERTES);

        System.out.println(cineA.filmsALAffiche());
        System.out.println("Chiffre Affaire " + cineA.calculeChiffreAffaires() + " " + "Euro(s)");

    }
}
