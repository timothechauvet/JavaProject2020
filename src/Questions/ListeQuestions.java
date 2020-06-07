/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.*;

/**
 * @author remyc
 */
public class ListeQuestions {
    private LinkedList <Question> questions;


    public ListeQuestions () {
        questions = new LinkedList <Question> ();
    }

    
    

    public void afficherListe () {
        questions.forEach(Question :: afficher);
    }

    public void ajouterQuestion (Question question) {
        questions.add(question);
    }

    public void supprimerQuestion (int qNum) {
        for (Question q : questions) {
            if (qNum == q.getNumber()) {
                questions.remove(q);
            }
        }
    }

    public Question selectionnerQuestion (String theme, int difficulty) {
        //TODO
        return null;
    }
}
