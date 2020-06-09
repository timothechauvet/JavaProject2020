/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Questions.Themes;
import Questions.Question;
import Questions.ListeQuestions;

import Questions.Type.QCM;
import Questions.Type.VF;
import Questions.Type.RC;

import Joueurs.Joueur;
import Joueurs.EnsJoueurs;


import Files_Managment.FileManager;
import java.util.Vector;
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
        Themes t = new Themes();    //the different themes are hard coded
        
        t.afficher();
        t.modifierTheme(9, "Culture G");
        t.afficher();
        
        int [] themes = t.selectionnerCinqThemes();
        System.out.println("\nselected themes:");
        for (int index : themes) {
            System.out.println(" -> " + t.themes[index]);
        }
    }
    
    
    public static void test_Question () {
        System.out.println("\n\t -------- test_Question --------");
        Themes t = new Themes();    //the different themes are hard coded
        
        QCM qcm = new QCM(t.themes[t.selectionnerTheme()], 1, "répondez svp", 1, "hey", "ho", "let's", "go");
        RC rc = new RC(t.themes[t.selectionnerTheme()], 2, "un hotel?", "trivago");
        VF vf = new VF(t.themes[t.selectionnerTheme()], 3, "vraiment?", true);

        
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
        VF vf = new VF("thme", 3, "vraiment?", true);
        lq.ajouterQuestion(vf);
        QCM qcm = new QCM("thme", 1, "répondez svp", 1, "hey", "ho", "let's", "go");
        lq.ajouterQuestion(qcm);
        RC rc = new RC("thme", 2, "un hotel?", "trivago");
        lq.ajouterQuestion(rc);
        lq.afficherListe();
        
        System.out.println("\n\tselect question");
        Question q = lq.selectionnerQuestion(2);
        q.afficher();
        
        System.out.println("\n\tdelete question");
        lq.supprimerQuestion(5);
        lq.afficherListe();
    }
    
    
    public static void test_Joueur () {
        System.out.println("\n\t -------- test_Joueur --------");
        Joueur j = new Joueur(1, "Billy");
        
        j.afficher();
        
        j.majScore(10);
        j.changerEtat(0);
        j.afficher();
        
        QCM qcm = new QCM("thme", 1, "répondez svp", 1, "hey", "ho", "let's", "go");
        if (j.saisir(qcm, 3)) System.out.println("WIN!");
        else System.out.println("LOSE!");
        if (j.saisir(qcm, 1)) System.out.println("WIN!");
        else System.out.println("LOSE!");
    }
    
    
    public static void test_EnsJoueurs () {
        System.out.println("\n\t -------- test_EnsJoueur --------");
        Joueur j = new Joueur(1, "Billy");
        Vector <Joueur> vect = new Vector();
        vect.add(j);
        EnsJoueurs ej = new EnsJoueurs(vect);
        
        System.out.println("\n\tdisplay player");
        ej.afficher();
        
        System.out.println("\n\tadd new player");
        Joueur j2 = new Joueur(2, "Max");
        ej.ajouterJoueur(j2);
        ej.afficher();
        
        System.out.println("\n\tselect random playter");
        ej.selectionnerJoueur().afficher();
    }
    
    
    
    
    public static void test_FileManager () {
        System.out.println("\n\t -------- test_FileManager --------");
        FileManager FM = new FileManager();
        
        String Prjt_path =  "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020";
        String VF_path =    "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020\\Questions\\VF";
        String RC_path =    "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020\\Questions\\RC";
        String QCM_path =   "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020\\Questions\\QCM";
        
        String Questions_path =     "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020\\Questions";
        String CultG_path =         "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020\\Questions\\Culture Générale";
        
    
        
        System.out.println("\n\tadd a new listeQuestions");
        //Themes t = new Themes();
        ListeQuestions lq = new ListeQuestions();
        VF vf = new VF("Culture Générale", 1, "le ciel est bleu", true);
        lq.ajouterQuestion(vf);
        
        FM.displayDir(Questions_path);
        FM.ajouterListeQuestions(lq);
        FM.displayDir(Questions_path);
        
        
        System.out.println("\n\tcreate listeQuestions from file");
        ListeQuestions lq2 = FM.getListeQuestionsFromFile();
        lq2.afficherListe();
        
        
        
        
        /**
        FM.displayDir(VF_path);
        VF vf1 = FM.VFFromFile("\\VF1.txt");
        listeQuestions.ajouterQuestion(vf1);
        
        FM.displayDir(RC_path);
        RC rc1 = FM.RCFromFile("\\RC1.txt");
        listeQuestions.ajouterQuestion(rc1);
        
        FM.displayDir(QCM_path);
        QCM qcm1 = FM.QCMFromFile("\\QCM1.txt");
        listeQuestions.ajouterQuestion(qcm1);
        
        
        
        listeQuestions.afficherListe();
        
        
        
        FM.ajouterQuestion("Le ciel est bleu", true);
        FM.ajouterQuestion("Un hotel", "trivago");
        FM.ajouterQuestion("2 + 2 = ?", "4", "6", "2", "Quick Maths!", 0);
        FM.displayDir(VF_path);
        FM.displayDir(RC_path);
        FM.displayDir(QCM_path);
        */
    }

}
