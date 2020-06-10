/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





import Questions.Theme;
import Questions.Themes;

import Questions.Question;
import Questions.ListeQuestions;

import Questions.Type.QCM;
import Questions.Type.VF;
import Questions.Type.RC;

import Joueurs.Joueur;
import Joueurs.EnsJoueurs;


import Files_Managment.FileManager;
import Interface.Lancement;

/**
 * @author remyc
 */
public class JAVA_Prjt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        test_Question();
        test_ListeQuestions();
        
        test_Theme();
        test_Themes();
        
        test_Joueur();
        test_EnsJoueurs();
        
        
        
        test_FileManager();
        */
    }
    
    
    
    
    /*
    public static void test_Question () {
        System.out.println("\n\t -------- test_Question --------");
        Themes t = Themes.instance;    //there is a single instance of themes, the different themes are hard coded

        Question<QCM> qcm= new Question<>(1, new QCM("répondez svp", 1, "hey", "ho", "let's", "go"));
        Question<RC> rc= new Question<>(1,new RC("un hotel?","trivago"));
        Question<VF> vf = new Question<>(3,new VF("vraiment?", true));
        
        ListeQuestions lq = new ListeQuestions();
        
        lq.ajouterQuestion(qcm);
        lq.ajouterQuestion(rc);
        lq.ajouterQuestion(vf);

        lq.afficherListe();
        for(int i=0 ; i<lq.getLength() ; i++) lq.getQuestionX(i).afficherReponse();
    }    
    
    public static void test_ListeQuestions () {
        System.out.println("\n\t -------- test_ListeQuestions --------");
        ListeQuestions lq = new ListeQuestions ();
        
        lq.afficherListe();
        
        System.out.println("\n\tadd question");
        Question<VF> vf = new Question<>(3,new VF("vraiment?", true));
        lq.ajouterQuestion(vf);
        Question<QCM> qcm= new Question<>(1, new QCM("répondez svp", 1, "hey", "ho", "let's", "go"));
        lq.ajouterQuestion(qcm);
        Question<RC> rc= new Question<>(1,new RC("un hotel?","trivago"));
        lq.ajouterQuestion(rc);
        lq.afficherListe();
        
        System.out.println("\n\tselect question");
        Question<?> q = lq.selectionnerQuestion(1);
        q.afficher();
        
        System.out.println("\n\tdelete question");
        lq.supprimerQuestion(5);
        lq.afficherListe();
    }
    
    
    public static void test_Theme () {
        System.out.println("\n\t -------- test_Theme --------");
        //First we create one ListeQuestions for each 10 hardcoded themes
        Themes themes = Themes.instance;    //the different themes are hard coded
        for (Theme theme : themes.getThemes()) {
            theme.ajouterQuestion(new Question<>(1, new QCM("répondez svp", 1, "hey", "ho", "let's", "go")));
            theme.afficher();
        }
        
        System.out.println("\n\tsave each Theme as a file");
        FileManager fm = new FileManager();
        for (Theme theme : themes.getThemes()) {  
            fm.ajouterListeQuestions(theme.toString(), theme.getListe());
        }
        fm.displayDir("Questions");
        
        System.out.println("\n\tload each Theme from files");
        for (Theme theme : themes.getThemes()) {
            theme.setListe(fm.getListeQuestionsFromFile(theme.toString()));
            theme.afficher();
        }
    }
    
    public static void test_Themes () {
        System.out.println("\n\t -------- test_Themes --------");
        Themes t = Themes.instance;    //the different themes are hard coded
        
        t.afficher();
        t.modifierTheme(9, "Culture G");
        t.afficher();
        
        int [] cinqThemes = t.selectionnerThemes(5);
        System.out.println("\n\tselected themes:");
        for (int index : cinqThemes) {
            System.out.println(" -> " + Themes.instance.getThemeAt(index));
        }
    }
    
    
    public static void test_Joueur () {
        System.out.println("\n\t -------- test_Joueur --------");
        Joueur j = new Joueur( "Billy");
        
        j.afficher();
        
        j.majScore(10);
        j.changerEtat(0);
        j.afficher();

        Question<QCM> qcm= new Question<>(1, new QCM("répondez svp", 1, "hey", "ho", "let's", "go"));
        if (j.saisir(qcm, 3)) System.out.println("WIN!");
        else System.out.println("LOSE!");
        if (j.saisir(qcm, 1)) System.out.println("WIN!");
        else System.out.println("LOSE!");
    }    
    
    public static void test_EnsJoueurs () {
        System.out.println("\n\t -------- test_EnsJoueur --------");
        EnsJoueurs ej = EnsJoueurs.instance; //there is a single instance of themes, the 20 players are named from A to T
        
        System.out.println("\n\tdisplay player");
        ej.afficher();
        
        System.out.println("\n\tselect random player");
        ej.selectionnerJoueur().afficher();
    }

    

    public static void test_FileManager () {
        System.out.println("\n\t -------- test_FileManager --------");
        FileManager FM = new FileManager();
        String Prjt_path =  "";
        String VF_path =    Prjt_path + "Questions\\VF";
        String RC_path =    Prjt_path + "Questions\\RC";
        String QCM_path =   Prjt_path + "Questions\\QCM";
        
        String Questions_path =     Prjt_path + "Questions";
        String CultG_path =         Prjt_path + "Questions\\Culture Générale";
        
        
        System.out.println("\n\tadd a new listeQuestions");
        ListeQuestions lq = new ListeQuestions();
        Question <VF> vf = new Question <> (3, new VF("vraiment?", true));
        lq.ajouterQuestion(vf);
        
        FM.displayDir(Questions_path);
        FM.ajouterListeQuestions("ListeQuestions", lq);
        FM.displayDir(Questions_path);
        
        
        System.out.println("\n\tcreate listeQuestions from file");
        ListeQuestions lq2 = FM.getListeQuestionsFromFile("ListeQuestions");
        lq2.afficherListe();
    }
    */
}
