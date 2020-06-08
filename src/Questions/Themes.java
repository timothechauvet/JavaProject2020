/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author remyc
 */
public class Themes {
    public Theme[] themes = new Theme[10];
    private int prev;   //index of current theme


    public Themes () {
        this.themes[0] = new Theme("Biologie");
        this.themes[1] = new Theme("Sport");
        this.themes[2] = new Theme("Histoire");
        this.themes[3] = new Theme("Informatique");
        this.themes[4] = new Theme("Aérospatial");
        this.themes[5] = new Theme("Aéronautique");
        this.themes[6] = new Theme("Literature");
        this.themes[7] = new Theme("Musique");
        this.themes[8] = new Theme("Films");
        this.themes[9] = new Theme("Culture Générale");
        /* ... à continuer*/
        this.prev = -1; //initial value of prev is -1 so that any theme can be selected
    }
    
    
    
    boolean DEBBUGING = true;
    


    public void modifierTheme(int index, String newTheme) {
        try {
            themes[index] = new Theme(newTheme);
        }
        catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("\nERROR:\t" + aiobe);
            aiobe.printStackTrace();
        }
    }

    public int selectionnerTheme() {
        int newTheme;
        do {   //then new theme is same as previous and need to be changed
            newTheme = (int) (Math.random() * 10);
        } while (newTheme == this.prev);

        this.prev = newTheme;
        return this.prev;
    }

    public int[] selectionnerCinqThemes() {
        int[] selectedThemes = new int[5];
        int newTheme;

        for (int i = 0; i < 5; i++) {    //select 5 differents themes
            if (DEBBUGING) System.out.println("prev = " + prev);

            do{
                newTheme=selectionnerTheme();
            } while (Arrays.asList(selectedThemes).contains(newTheme));

            selectedThemes[i]=newTheme;
            
            if (DEBBUGING) {
                System.out.println();
                for (int test : selectedThemes) System.out.println(test);
            }
        }

        return selectedThemes;
    }

    public void afficher() {
        System.out.println();
        for (int i = 0; i < this.themes.length; i++) {
            System.out.println(i + " -> " + this.themes[i]);
        }
        System.out.println("selected theme: " + (this.prev== -1 ? "none" : this.themes[this.prev]));
    }


}
