/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueurs;

import java.util.ArrayList;

import static java.util.stream.Collectors.toCollection;


/**
 * @author remyc
 */
public class EnsJoueurs {
    // Create as singleton
    public static final EnsJoueurs instance = new EnsJoueurs();

    private ArrayList<Joueur> joueurs;

    public EnsJoueurs() {
        joueurs = new ArrayList<Joueur>(20);
        creer();
    }

    private void creer() {
        char name = 'A';
        for (int i = 0; i < 20; i++) {
            joueurs.add(new Joueur(Character.toString(name++)));
        }
    }

    public void afficher() {
        for (Joueur j : joueurs) j.afficher();
    }

    public Joueur selectionnerJoueur() {
        Joueur selected;
        do {
            selected=joueurs.get((int) (Math.random() * joueurs.size()));
        }while(selected.getEtat()!= Joueur.WAITING);
        return selected;
    }

    public ArrayList<Joueur> getSelected() {
        return joueurs.stream().filter(j -> j.getScore() == Joueur.SELECTED).collect(toCollection(ArrayList::new));
    }
}
