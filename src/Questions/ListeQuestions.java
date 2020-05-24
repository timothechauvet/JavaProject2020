/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import Questions.Type.QCM;

import java.util.*;

/**
 * @author remyc
 */
public class ListeQuestions {
    //leave raw or as Question<TypeQuestion>?
    private LinkedList<Question> questions;


    public ListeQuestions() {
        questions = new LinkedList<>();
    }


    public void AfficherListe() {
        questions.forEach(Question::Afficher);
    }

    public void AjouterQuestion(Question question) {
        questions.add(question);
    }

    public boolean SupprimerQuestion(int qNum) {
        for (Question q : questions) {
            if (qNum == q.getNumber()) {
                return questions.remove(q);
            }
        }
        return false;
    }

    public Question SelectionnerQuestion(String theme, int difficulty) {
        //TODO
        return null;
    }
}
