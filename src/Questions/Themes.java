/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Arrays;

/**
 * @author remyc
 */
public class Themes {
    // Create as Singleton
    public static final Themes instance = new Themes();

    private Theme[] themes = new Theme[10];
    private int prev;   //index of current theme


    private Themes () {
        themes[0] = new Theme("Biologie");
        themes[1] = new Theme("Sport");
        themes[2] = new Theme("Histoire");
        themes[3] = new Theme("Informatique");
        themes[4] = new Theme("Aérospatial");
        themes[5] = new Theme("Aéronautique");
        themes[6] = new Theme("Literature");
        themes[7] = new Theme("Musique");
        themes[8] = new Theme("Films");
        themes[9] = new Theme("Culture Générale");
        /* ... à continuer*/
        this.prev = -1; //initial value of prev is -1 so that any theme can be selected
    }
    
    boolean DEBBUGING = false;

    
    
    
    //-------TEMP FOR TESTS(?)--------
    public Theme getThemeAt(int index) {
        return (index<0 || index>9) ? null : this.themes[index];
    }

    public Theme[] getThemes() { return this.themes; }
    //---------------------------------
    
    public Theme getThemeNamed(String name)
    {
        int i;
        for (i = 0; i < this.themes.length; i++) {
            if(this.themes[i].toString().equals(name)) break;
        }
        
        if(i==this.themes.length) return null;
        else return this.themes[i];
    }
    
    public boolean addQuestion(String theme, Question<?> q)
    {
        Theme t=getThemeNamed(theme);
        if(t==null) return false;
        else return t.getListe().ajouterQuestion(q);
    }

    public void modifierTheme(int index, String newTheme) {
        try {
            this.themes[index] = new Theme(newTheme);
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

    public int[] selectionnerThemes(int n) {
        int[] selectedThemes = new int[n];
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
        System.out.println("selected theme: " + (this.prev == -1 ? "none" : this.themes[this.prev]));
    }


}
