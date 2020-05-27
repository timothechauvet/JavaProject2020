/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Questions.Themes;

import Questions.Type.QCM;
import Questions.Type.VF;
import Questions.Type.RC;

import Questions.Question;
import Questions.ListeQuestions;

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
        
        //test_classes();
        test_Files();
    }


    public static void test_classes () {
        Themes t = new Themes();

        QCM qcm = new QCM("hey", "ho", "let's", "go", "oui");
        VF vf = new VF("vraiment?", true);
        RC rc = new RC("un hotel?", "trivago");

        ListeQuestions lq = new ListeQuestions();

        lq.AjouterQuestion(new Question<QCM>(t.themes[t.SelectionnerTheme()], (int) (Math.random() * 3), qcm));
        lq.AjouterQuestion(new Question<VF>(t.themes[t.SelectionnerTheme()], (int) (Math.random() * 3), vf));
        lq.AjouterQuestion(new Question<RC>(t.themes[t.SelectionnerTheme()], (int) (Math.random() * 3), rc));

        lq.AfficherListe();
    }
    
    
    public static void test_Files () {
        FileManager FM = new FileManager();
        
        String Prjt_path = "D:\\WORK\\EFREI\\JAVA\\JavaProject2020";
        String VF_path = "D:\\WORK\\EFREI\\JAVA\\JavaProject2020\\Questions\\VF";
        String RC_path = "D:\\WORK\\EFREI\\JAVA\\JavaProject2020\\Questions\\RC";
        String QCM_path = "D:\\WORK\\EFREI\\JAVA\\JavaProject2020\\Questions\\QCM";
        
        Themes t = new Themes();
        ListeQuestions listeQuestions = new ListeQuestions();
        listeQuestions.AfficherListe();
        
        
        FM.DisplayDir(VF_path);
        VF VF1 = FM.VFFromFile(VF_path + "\\VF1.txt");
        Question q = new Question(t.themes[t.SelectionnerTheme()], (int) (Math.random() * 3), VF1);
        listeQuestions.AjouterQuestion(q);
        
        FM.DisplayDir(RC_path);
        RC RC1 = FM.RCFromFile(RC_path + "\\RC1.txt");
        q = new Question(t.themes[t.SelectionnerTheme()], (int) (Math.random() * 3), RC1);
        listeQuestions.AjouterQuestion(q);
        
        FM.DisplayDir(QCM_path);
        QCM QCM1 = FM.QCMFromFile(QCM_path + "\\QCM1.txt");
        q = new Question(t.themes[t.SelectionnerTheme()], (int) (Math.random() * 3), QCM1);
        listeQuestions.AjouterQuestion(q);
        
        
        listeQuestions.AfficherListe();        
    }

}
