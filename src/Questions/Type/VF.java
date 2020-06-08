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
public class VF extends Question {


    public VF (String theme, int level, String enonce, boolean correctAnswer) {
        super(theme, level, enonce, correctAnswer);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.print("True or False?: ");
    }
}
