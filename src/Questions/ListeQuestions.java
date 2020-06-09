/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * @author remyc
 */
public class ListeQuestions implements Serializable {
    private LinkedList <Question<?>> questions;

    public ListeQuestions () {
        questions = new LinkedList <> ();
    }

    public void afficherListe () {
        questions.forEach(Question :: afficher);
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
}
