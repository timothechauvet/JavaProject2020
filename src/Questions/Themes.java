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
public class Themes {
    public String [] themes = new String [10];
    private Integer prev;   //index of current theme, is Integer so that it can be initialized to null

    
    public Themes() {
        this.themes[0] = "Biologie";
        this.themes[1] = "Sport";
        this.themes[2] = "Histoire";
        this.themes[3] = "Informatique";
        this.themes[4] = "Aérospatial";
        this.themes[5] = "Aéronautique";
        this.themes[6] = "je";
        this.themes[7] = "n'ai";
        this.themes[8] = "plus";
        this.themes[9] = "d'idée";
        /* ... à continuer*/
        this.prev = null;        
    }
    
    
    public void ModifierTheme() {
        
    }
    
    public int SelectionnerTheme() {
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
        for(int i=0; i<this.themes.length; i++) {
            System.out.println(i + " -> " + this.themes[i]);
        }
        System.out.println("selected theme: " + this.themes[this.prev]);
    }
    
    
}
