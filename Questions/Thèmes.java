/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import static java.lang.Math.random;

/**
 *
 * @author remyc
 */
public class Thèmes {
    private String [] thèmes = new String [9];
    private Integer prev;   //index of current theme, is Integer so that it can be initialized to null

    
    public Thèmes() {
        this.thèmes[0] = "Scinces";
        this.thèmes[1] = "Sport";
        this.thèmes[2] = "Histoire";
        /* ... à continuer*/
        this.prev = null;
    }
    
    
    public void ModifierTheme() {
        
    }
    
    public int SélectionnerTheme() {
        int rdn = (int) (Math.random() * 10);
        while(rdn == this.prev) {   //then new theme is same as previous and need to be changed
            rdn = (int) (Math.random() * 10);
        }
        
        int save = this.prev;
        this.prev = rdn;
        return save;
    }
    
    public int [] SelectionnerCinqThemes() {
        int [] selectedThemes = new int [4];
        for(int i=0; i<selectedThemes.length; i++) {    //select 5 differents themes
            int rdn = (int) (Math.random() * 10);
            for(int j=0; j<selectedThemes.length; j++) {    //checks if randomly selected index (rdn) is already selected
                if(selectedThemes [j] == rdn) break;
                if(j == 4) selectedThemes[i] = rdn;
            }
        }
        
        return selectedThemes;
    }
    
    public void Afficher() {
        for(int i=0; i<this.thèmes.length; i++) {
            System.out.println(i + " -> " + this.thèmes[i]);
        }
        System.out.println("selected theme: " + this.thèmes[this.prev]);
    }
    
    
}
