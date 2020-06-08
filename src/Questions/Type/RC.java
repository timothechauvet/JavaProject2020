/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Type;

import Questions.Question;

/**
 * @author remyc
 */
public class RC extends Question {


    public RC (String theme, int level, String enonce, String correctAnswer) {
        super(theme, level, enonce, correctAnswer);
    }


    @Override
    public void afficher() {
        super.afficher();
        System.out.print("Your answer: ");
    }
}
