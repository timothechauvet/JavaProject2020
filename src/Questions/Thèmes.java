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
    public String [] thèmes = new String [10];
    private Integer prev;   //index of current theme, is Integer so that it can be initialized to null

    
    public Thèmes() {
        this.thèmes[0] = "Biologie";
        this.thèmes[1] = "Sport";
        this.thèmes[2] = "Histoire";
        this.thèmes[3] = "Informatique";
        this.thèmes[4] = "Aérospatial";
        this.thèmes[5] = "Aéronautique";
        this.thèmes[6] = "je";
        this.thèmes[7] = "n'ai";
        this.thèmes[8] = "plus";
        this.thèmes[9] = "d'idée";
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
        int [] selectedThemes = new int [5];
        for(int i=0; i<selectedThemes.length; i++) {    //select 5 differents themes
            int rdn = (int) (Math.random() * 10);
            for(int j=0; j<selectedThemes.length; j++) {    //checks if randomly selected index (rdn) is already selected
                if(selectedThemes [j] == rdn) break;
                if(j == selectedThemes.length) selectedThemes[i] = rdn;
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
