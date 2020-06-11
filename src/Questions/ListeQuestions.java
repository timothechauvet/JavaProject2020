/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import Interface.StringWrapper;
import java.io.Serializable;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 * @author remyc
 */
public class ListeQuestions implements Serializable {
    private LinkedList <Question<?>> questions;

    public ListeQuestions () {
        questions = new LinkedList <> ();
    }

    public void afficherListe (DefaultTableModel model) {
        StringWrapper diff,enonce,r1,r2,r3,r4,reponse;
        diff = new StringWrapper();
        enonce = new StringWrapper();
        r1 = new StringWrapper();
        r2 = new StringWrapper();
        r3 = new StringWrapper();
        r4 = new StringWrapper();
        reponse = new StringWrapper();
        
        questions.stream().map((q) -> {        
            q.afficher(new StringWrapper(),diff,enonce,r1,r2,r3,r4,reponse);
            return q;
        }).forEachOrdered((_item) -> {
            model.addRow(new Object[]{diff.getText(),enonce.getText(),r1.getText(),r2.getText(),r3.getText(),r4.getText(),reponse.getText()});
        });
    }

    public boolean ajouterQuestion (Question<?> question) {
        return questions.add(question);
    }

    public void supprimerQuestion (int qNum) {
        for (Question<?> q : questions) {
            if (qNum == q.getNumber()) {
                questions.remove(q);
                break;
            }
        }
    }
    
    public Question<?> getRandomQuestion () {
        return questions.get((int) (Math.random() * questions.size()));
    }

    public Question<?> selectionnerQuestion (int difficulty) {
        ListeQuestions selectedQuestions = new ListeQuestions();
        for (Question<?> q : questions) {
            if (q.getDifficulty() == difficulty) selectedQuestions.ajouterQuestion(q);
        }
        return selectedQuestions.getRandomQuestion();
    }
    
    public Question<?> getQuestionX(int i){
        return questions.get(i);
    }
    
    public int getLength(){
        return questions.size();
    }
}
