/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Type;


import Interface.StringWrapper;


/**
 * @author remyc
 */
public class VF extends QuestionType<Boolean> {
    public VF (String enonce, boolean correct) {
        super(enonce,correct);
    }

    @Override
    public void afficher(StringWrapper enonce,StringWrapper r1,StringWrapper r2,StringWrapper r3,StringWrapper r4,StringWrapper reponse) {
        super.afficher(enonce,null,null,null,null,null);
        r1.setText("Vrai");
        r2.setText("Faux");
        r3.setText("-");
        r4.setText("-");
        reponse.setText(answer ? "Vrai" : "Faux");
    }
}
