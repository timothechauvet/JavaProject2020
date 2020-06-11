/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueurs;

import Interface.StringWrapper;
import Phases.GameActions;
import Questions.Question;

/**
 *
 * @author remyc
 */
public class Joueur implements Comparable<Joueur>{
//	Variables
    private final int nbr;
    private static int jTotal = 100;
    private final String name;
    private int score;
    private int etat;
    private int time;
    
    public static final int SELECTED        = 0;
    public static final int WINNER          = 1;
    public static final int SUPER_WINNER    = 2;
    public static final int ELIMINATED      = 3;
    public static final int WAITING         = 4;
    
    
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

    public int getTime() {
        return time;
    }

    public void addTime(int added) {
            time += added;
    }

    public void resetTime() {
        time = 0;
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
    public Joueur(String name) {
        this.nbr 	= jTotal; /*Starts at 100 and increments by 10*/
        jTotal += 10;
        this.name 	= name;
        this.score 	= 0;
        this.etat 	= 4;
        this.time = 0;
    }
    
    
    
    
    public boolean saisir (Question<?> q, Object answer) {
        return q.saisir(answer);
    }
    
    
    
    public void afficher (StringWrapper nbr, StringWrapper name, StringWrapper score, StringWrapper status, StringWrapper time) {
        nbr.setText(Integer.toString(this.nbr));
        name.setText(this.name);
        score.setText(Integer.toString(this.score));
        
        switch(etat) {
        case SELECTED :
        	status.setText("SELECTED");
        	break;
        case WINNER :
        	status.setText("WINNER");
        	break;
        case SUPER_WINNER :
        	status.setText("SUPER WINNER");
        	break;
        case ELIMINATED :
        	status.setText("ELIMINATED");
        	break;
        case WAITING :
        	status.setText("WAITING");
        	break;
        }
        
        time.setText(GameActions.parseTimer(this.time));
    }
    
    public void majScore (int s) {  //depends on the current phase
    	this.score += s;        
    }
    
    public void changerEtat (int etat) {
    	this.etat = (etat <= 4 && etat >= 0) ? etat : this.etat;
    }

    @Override
    public int compareTo(Joueur joueur) {
        return Integer.compare(this.score,joueur.getScore());
    }
}
