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


/**
 * @author remyc
 */
public class JAVA_Prjt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test();
    }


    public static void test() {
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

}
