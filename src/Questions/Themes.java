/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 * @author remyc
 */
public class Themes {
    public String[] themes = new String[10];
    private int prev;   //index of current theme, is Integer so that it can be initialized to null


    public Themes() {
        this.themes[0] = "Biologie";
        this.themes[1] = "Sport";
        this.themes[2] = "Histoire";
        this.themes[3] = "Informatique";
        this.themes[4] = "Aérospatial";
        this.themes[5] = "Aéronautique";
        this.themes[6] = "Literature";
        this.themes[7] = "Musique";
        this.themes[8] = "Films";
        this.themes[9] = "Culture Générale";
        /* ... à continuer*/
        this.prev = -1;
    }


    public void modifierTheme() {

    }

    public int selectionnerTheme() {
        int rdn = (int) (Math.random() * 10);
        while (rdn == this.prev) {   //then new theme is same as previous and need to be changed
            rdn = (int) (Math.random() * 10);
        }

        this.prev = rdn;
        return this.prev;
    }

    public int[] selectionnerCinqThemes() {
        int[] selectedThemes = new int[5];
        for (int i = 0; i < selectedThemes.length; i++) {    //select 5 differents themes
            int rdn = (int) (Math.random() * 10);
            for (int j = 0; j < selectedThemes.length; j++) {    //checks if randomly selected index (rdn) is already selected
                if (selectedThemes[j] == rdn) break;
                if (j == selectedThemes.length) selectedThemes[i] = rdn;
            }
        }

        return selectedThemes;
    }

    public void afficher() {
        for (int i = 0; i < this.themes.length; i++) {
            System.out.println(i + " -> " + this.themes[i]);
        }
        System.out.println("selected theme: " + this.themes[this.prev]);
    }


}
