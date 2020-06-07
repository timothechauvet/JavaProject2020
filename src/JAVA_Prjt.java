/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Questions.ListeQuestions;
import Questions.Themes;
import Questions.Question;

import Questions.Type.QCM;
import Questions.Type.VF;
import Questions.Type.RC;

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
        
        test_classes();
        //test_ReadFromFiles();
    }


    public static void test_classes () {
        Themes t = new Themes();    //the different themes are hard coded

        QCM qcm = new QCM(t.themes[t.selectionnerTheme()], 1, "répondez svp", 1, "hey", "ho", "let's", "go");
        RC rc = new RC(t.themes[t.selectionnerTheme()], 2, "un hotel?", "trivago");
        VF vf = new VF(t.themes[t.selectionnerTheme()], 3, "vraiment?", true);

        ListeQuestions lq = new ListeQuestions();


        lq.AjouterQuestion(new Question<QCM>(t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), qcm));
        lq.AjouterQuestion(new Question<VF>(t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), vf));
        lq.AjouterQuestion(new Question<RC>(t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), rc));

        lq.afficherListe();
    }
    
    
    public static void test_ReadFromFiles () {
        FileManager FM = new FileManager();
        
        String Prjt_path =  "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020";
        String VF_path =    "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020\\Questions\\VF";
        String RC_path =    "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020\\Questions\\RC";
        String QCM_path =   "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020\\Questions\\QCM";
        
    
        Themes t = new Themes();
        ListeQuestions listeQuestions = new ListeQuestions();
        listeQuestions.afficherListe();
        
        
        FM.displayDir(VF_path);
        VF VF1 = FM.VFFromFile("\\VF1.txt");
        Question q = new Question(t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), VF1);
        listeQuestions.ajouterQuestion(q);
        
        FM.displayDir(RC_path);
        RC RC1 = FM.RCFromFile("\\RC1.txt");
        q = new Question(t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), RC1);
        listeQuestions.ajouterQuestion(q);
        
        FM.displayDir(QCM_path);
        QCM QCM1 = FM.QCMFromFile("\\QCM1.txt");
        q = new Question(t.themes[t.selectionnerTheme()], (int) (Math.random() * 3), QCM1);
        listeQuestions.ajouterQuestion(q);
        
        
        listeQuestions.afficherListe();
        
        
        
        FM.AjouterQuestion("Le ciel est bleu", true);
        FM.AjouterQuestion("Un hotel?", "trivago");
        FM.ajouterQuestion("2 + 2 = ?", "4", "2", "Quick Maths!", "4");
        FM.displayDir(VF_path);
        FM.displayDir(RC_path);
        FM.displayDir(QCM_path);
    }

}
