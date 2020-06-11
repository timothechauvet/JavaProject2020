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
public class QCM extends QuestionType<Integer> {
    private final String [] answers;
    
    public QCM(String enonce, int correct, String r1, String r2, String r3, String r4) {
        super(enonce, correct);
        this.answers = new String [4];
        this.answers[0] = r1;
        this.answers[1] = r2;
        this.answers[2] = r3;
        this.answers[3] = r4;
    }
    
    @Override
    public void afficher(StringWrapper enonce,StringWrapper r1,StringWrapper r2,StringWrapper r3,StringWrapper r4,StringWrapper reponse) {
        super.afficher(enonce,null,null,null,null,null);
        r1.setText(this.answers[0]);
        r2.setText(this.answers[1]);
        r3.setText(this.answers[2]);
        r4.setText(this.answers[3]);
        reponse.setText(this.answers[answer]);
    }
}
