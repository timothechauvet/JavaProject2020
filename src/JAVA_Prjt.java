/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Phases.PremierePhase;
import Questions.Themes;
import Questions.Question;
import Questions.ListeQuestions;

import Questions.Type.QCM;
import Questions.Type.VF;
import Questions.Type.RC;

import Joueurs.Joueur;
import Joueurs.EnsJoueurs;


import Files_Managment.FileManager;

/**
 * @author remyc
 */
public class JAVA_Prjt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        test_Theme();
        test_Question();
        test_ListeQuestions();
        test_Joueur();
        test_EnsJoueurs();
        
        test_FileManager();
    }

    
    
    

    public static void test_Theme () {
        System.out.println("\n\t -------- test_Theme --------");
        Themes t = Themes.instance;    //the different themes are hard coded
        
        t.afficher();
        t.modifierTheme(9, "Culture G");
        t.afficher();
        
        int [] cinqThemes = t.selectionnerCinqThemes();
        System.out.println("\nselected themes:");
        for (int index : cinqThemes) {
            System.out.println(" -> " + Themes.instance.getThemeAt(index));
        }
    }
    
    
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
        /*lq.AjouterQuestion(new Question <QCM>   (t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), qcm));
        lq.AjouterQuestion(new Question <VF>    (t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), vf));
        lq.AjouterQuestion(new Question <RC>    (t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), rc));
        */

        lq.afficherListe();
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


        Themes t = Themes.instance;
        ListeQuestions listeQuestions = new ListeQuestions();
        listeQuestions.afficherListe();


        FM.displayDir(VF_path);
        Question<VF> vf1 = FM.VFFromFile("\\VF1.txt");
        /*Question q = new Question(t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), );
        listeQuestions.ajouterQuestion(q);*/
        listeQuestions.ajouterQuestion(vf1);

        FM.displayDir(RC_path);
        Question<RC> rc1 = FM.RCFromFile("\\RC1.txt");
        /*q = new Question(t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), RC1);
        listeQuestions.ajouterQuestion(q);*/
        listeQuestions.ajouterQuestion(rc1);

        FM.displayDir(QCM_path);
        Question<QCM> qcm1 = FM.QCMFromFile("\\QCM1.txt");
        /*q = new Question(t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), QCM1);
        listeQuestions.ajouterQuestion(q);*/
        listeQuestions.ajouterQuestion(qcm1);


        listeQuestions.afficherListe();



        FM.ajouterQuestion("Le ciel est bleu", true);
        FM.ajouterQuestion("Un hotel", "trivago");
        FM.ajouterQuestion("2 + 2 = ?", "4", "6", "2", "Quick Maths!", 0);
        FM.displayDir(VF_path);
        FM.displayDir(RC_path);
        FM.displayDir(QCM_path);
    }
}
