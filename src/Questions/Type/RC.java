/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Type;


/**
 * @author remyc
 */
public class RC extends QuestionType<String> {
    public RC (String enonce, String correct) {
        super(enonce,correct);
    }

    @Override
    public void afficher() {
        super.afficher();
    }

    @Override
    public void afficherReponse() {
        super.afficherReponse();
        System.out.println("\t"+answer);
    }
}
