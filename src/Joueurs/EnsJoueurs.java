/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueurs;

import java.util.Vector;

/**
 *
 * @author remyc
 */
public class EnsJoueurs {
    private Vector joueurs;

    
    public EnsJoueurs(Vector joueurs) {
        this.joueurs  = new Vector(20);
    }
    
    public void Creer () {
        for(int i=0; i<20; i++){
            //this.joueurs.add();
        }
    }
    
    public Joueur SelectionnerJoueur () {
        return (Joueur) this.joueurs.get((int) (Math.random() * this.joueurs.size()));
    }
}
