/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import Files_Managment.FileManager;
import Questions.Type.QCM;
import Questions.Type.RC;
import Questions.Type.VF;
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
        FileManager fm = new FileManager();
        
        if(fm.existSaved())
        {
            fm.getThemesFromFiles(themes);
        } else {
            generateThemes();
            generateQuestions();
        }
        
        this.prev = 0; //initial value of prev is -1 so that any theme can be selected
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
        do {   
            newTheme = (int) (Math.random() * 10);
        } while (newTheme == this.prev); //then new theme is same as previous and need to be changed

        this.prev = newTheme;
        return this.prev;
    }

    public int[] selectionnerThemes(int n) {
        int[] selectedThemes = new int[n];
        int newTheme;

        for (int i = 0; i < n; i++) {    //select n differents themes
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

    public final void generateThemes() {
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
    }
    
    public final void generateQuestions() {
        //Biologie
        themes[0].ajouterQuestion(new Question(1, 
                new QCM("Combien de noyeau(x) dans une cellule?", 1, "0", "1", "2", "3" )));
        themes[0].ajouterQuestion(new Question(2, 
                new VF("There are only two genders", false)));
        themes[0].ajouterQuestion(new Question(3, 
                new RC("Combien de doigts sur une main droite ?", "5")));
        //Sport
        themes[1].ajouterQuestion(new Question(1, 
                new QCM("Combien de fois la france à t-elle gagné la coupe du monde de Football?", 1, "1", "2", "3", "4" )));
        themes[1].ajouterQuestion(new Question(2, 
                new VF("Teddy Rinner à passé 9 ans sans perdre 1 seul match", true)));
        themes[1].ajouterQuestion(new Question(3, 
                new RC("Qui détient le record du monde du 100m ?", "Usain Bolt")));
        //Histoire
        themes[2].ajouterQuestion(new Question(1, 
                new QCM("En quelle année les femmes Française ont-elles obtenue le droit de vote ?", 1, "1886", "1944", "1945", "1947" )));
        themes[2].ajouterQuestion(new Question(2, 
                new VF("Il existe environ 7000 langues parlées dans le monde", true)));
        themes[2].ajouterQuestion(new Question(3, 
                new RC("Quel est le nom complet de Napoleon Bonaparte", "Napoleon Bonaparte")));
        //Informatique
        themes[3].ajouterQuestion(new Question(1, 
                new QCM("Combien de bit dans un octet ?", 1, "1", "8", "16", "32" )));
        themes[3].ajouterQuestion(new Question(2, 
                new VF("Internet à été inventé à des fins militaires", true)));
        themes[3].ajouterQuestion(new Question(3, 
                new RC("Quel était le nom du premier ordinateur du monde ?", "IBM701")));
        //Aérospatial
        themes[4].ajouterQuestion(new Question(1, 
                new QCM("De quand date le première objet dans l'espace ?", 1, "1951", "1957", "1958", "1960" )));
        themes[4].ajouterQuestion(new Question(2, 
                new VF("Les Etats-Unis ont gagné la course à l'espace", false)));
        themes[4].ajouterQuestion(new Question(3, 
                new RC("Quel est le nom du première homme dans l'espace ?", "Youri Gagarine")));
        //Aéronautique
        themes[5].ajouterQuestion(new Question(1, 
                new QCM("De quand date le premier vol en avion ?", 1, "1902", "1903", "1908", "1910" )));
        themes[5].ajouterQuestion(new Question(2, 
                new VF("Les avions commerciaux rejettent délibérément des produit chimiques dans l'atmosphère", false)));
        themes[5].ajouterQuestion(new Question(3, 
                new RC("Quel est le nom des frères ayant fait voler le premier avion ?", "Wright")));//avril 1952
        //Literature
        themes[6].ajouterQuestion(new Question(1, 
                new QCM("En quelle année est né Victor Hugo ?", 1, "1702", "1802", "1902", "2002" )));
        themes[6].ajouterQuestion(new Question(2, 
                new VF("Paul Verlaine à contribué à l'écriture de 'L'Encyclopédie", false)));
        themes[6].ajouterQuestion(new Question(3, 
                new RC("De qui Arthur Rimbaud était le contemporain ?", "Paul Verlaine")));
        //Musique
        themes[7].ajouterQuestion(new Question(1, 
                new QCM("De quelle nationallité est le groupe 'The Rolling Stones' ?", 1, "Français", "Britanique", "Russe", "Américain" )));
        themes[7].ajouterQuestion(new Question(2, 
                new VF("Freddy Mercury est mort d'un cancer", false)));
        themes[7].ajouterQuestion(new Question(3, 
                new RC("Quel est l'album le plus vendu de Michael Jackson ?", "Thriller")));
        //Films
        themes[8].ajouterQuestion(new Question(1, 
                new QCM("De quelle année date le premier film parlant ?", 1, "1914", "1927", "1930", "1933" )));
        themes[8].ajouterQuestion(new Question(2, 
                new VF("Charlie Chaplin à réaliser le premier film parlant", false)));
        themes[8].ajouterQuestion(new Question(3, 
                new RC("Quel est le plus vue de Charlie Chaplin ?", "City Light")));
        //Culture Générale
        themes[9].ajouterQuestion(new Question(1, 
                new QCM("Combien des nations peuplent l'Union Européene?", 1, "19", "27", "30", "33" )));
        themes[9].ajouterQuestion(new Question(2, 
                new VF("La murraile de Chine est visible depui l'espace", false)));
        themes[9].ajouterQuestion(new Question(3, 
                new RC("Qui à été le tout premier président de la Réublique Française ?", "Napoléon Bonaparte")));
    }
}
