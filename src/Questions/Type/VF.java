/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Type;


/**
 * @author remyc
 */
public class VF extends QuestionType<Boolean> {
    public VF (String enonce, boolean correct) {
        super(enonce,correct);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.print("True or False?: ");
    }
}
