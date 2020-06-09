/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueurs;

import java.util.Vector;

/**
 * @author remyc
 */
public class EnsJoueurs {
    // Create as singleton
    public static final EnsJoueurs instance = new EnsJoueurs();

    private Vector<Joueur> joueurs;

    public EnsJoueurs() {
        joueurs = new Vector<Joueur>(20);
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
        return (Joueur) joueurs.get((int) (Math.random() * joueurs.size()));
    }
}
