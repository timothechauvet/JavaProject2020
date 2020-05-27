/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Type;

import Questions.QuestionType;

/**
 * @author remyc
 */
public class RC extends QuestionType {
    private final String correctAnswer;


    public RC(String question, String correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }


    @Override
    public void afficher() {
        super.afficher();
        System.out.print("Your answer: ");
    }
}
