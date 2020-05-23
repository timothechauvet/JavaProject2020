/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prjt;

import Questions.Thèmes;

import Questions.Type.QCM;
import Questions.Type.VF;
import Questions.Type.RC;

import Questions.Question;
import Questions.ListeQuestions;


/**
 *
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
    
    
     public static void test () {
        Thèmes t = new Thèmes();
        
        QCM qcm = new QCM("hey", "ho", "let's", "go", "oui");
        VF vf = new VF("vraiment?", true);
        RC rc = new RC("un hotel?", "trivago");
        
        Question <QCM> q = new Question <QCM> (0, t.thèmes[t.SélectionnerTheme()], 1, qcm);
        ListeQuestions lq = new ListeQuestions(q);
        for(int i=0; i<9; i++){
            lq.AjouterQuestion(new Question <QCM> (i+1, t.thèmes[t.SélectionnerTheme()], i%3+1, qcm));
        }
        lq.AfficherListe();
    }
    
}
