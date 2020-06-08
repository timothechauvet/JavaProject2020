/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueurs;

import Questions.Question;

/**
 *
 * @author remyc
 */
public class Joueur {
//	Variables
    private final int nbr;
    private final String name;
    private int score;
    private int etat;
    
    public final int SELECTED 		= 0;
    public final int WINNER 		= 1;
    public final int SUPER_WINNER 	= 2;
    public final int ELIMINATED		= 3;
    public final int WAITING		= 4;
    
    
//	Getters and setters
    public int getNbr() {
		return nbr;
	}


	public String getName() {
		return name;
	}


	public int getScore() {
		return score;
	}


//	0 = Selected
//	1 = Winner
//	2 = Super winner
//	3 = Eliminated
//	4 = Waiting
	public int getEtat() {
		return etat;
	}
    
//	Constructor
    public Joueur(int nbr, String name) {
        this.nbr 	= 100 + 10*nbr; /*Starts at 100 and increments by 10*/
        this.name 	= name;
        this.score 	= 0;
        this.etat 	= 4;
    }
    
    
    public void saisir (Question q) {
    	q.afficher();
        
    }
    
    public void afficher () {
        System.out.println("Player # " + this.nbr + " : \t" + this.name);
        System.out.println(" -> Score = " + this.score);
        System.out.print(" -> State = ");
        
        switch(etat) {
        case SELECTED :
        	System.out.println("SELECTED");
        	break;
        case WINNER :
        	System.out.println("WINNER");
        	break;
        case SUPER_WINNER :
        	System.out.println("SUPER WINNER");
        	break;
        case ELIMINATED :
        	System.out.println("ELIMINATED");
        	break;
        case WAITING :
        	System.out.println("WAITING");
        	break;
        }
    }
    
    public void majScore (int s) {
    	this.score += s;        
    }
    
    public void changerEtat (int etat) {
    	this.etat = (etat <= 4 && etat >= 0) ? etat : this.etat;
    }
}
