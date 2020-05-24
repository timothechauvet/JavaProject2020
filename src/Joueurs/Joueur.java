/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueurs;

/**
 *
 * @author remyc
 */
public class Joueur {
    private final int nbr;
    private final String name;
    private int score;
    private String état;

    
    public Joueur(int nbr, String name) {
        this.nbr = 100 + 10*nbr;    //numéro du joueur est un numéro qui commence à 100 et est incrémenté de 10 à chaque fois (100, 110, 120, 130, …).
        this.name = name;
        this.score = 0;
        this.état = "en attente";
    }
    
    
    public void Saisir () {
        
    }
    
    public void Afficher () {
        System.out.println("player n°"+this.nbr+": \t" + this.name);
        System.out.println(" -> " + this.score);
        System.out.println(" -> " + this.état);
    }
    
    public void MAJScore () {
        
    }
    
    public void ChangerEtat (String etat) {
        this.état = etat.trim().toLowerCase();
    }
    
}
