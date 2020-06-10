/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import Interface.StringWrapper;
import Questions.Type.QuestionType;
import java.io.Serializable;

/**
 * @author remyc
 * @param <T> is either QCM, RC or VF
 */
public class Question <T extends QuestionType<?>> implements Serializable{
    private final int number;
    private static int qTotal = 0;
    private final int difficulty;
    
    private final T enonce;     //depends on the type of question; QCM, VF or RC

    public Question(int level, T enonce) {
        this.number = ++qTotal;
        this.difficulty = level;
        this.enonce = enonce;
    }

    public int getNumber () {
        return number;
    }
    
    public T getEnonce(){
        return enonce;
    }
    
    public int getDifficulty () {
        return this.difficulty;
    }

    public void afficher(StringWrapper qNum, StringWrapper diff,StringWrapper enonce,StringWrapper r1,StringWrapper r2,StringWrapper r3,StringWrapper r4,StringWrapper reponse) {
        qNum.setText(Integer.toString(this.number));
        diff.setText(Integer.toString(this.difficulty));
        this.enonce.afficher(enonce,r1,r2,r3,r4,reponse);
    }

    public boolean saisir(Object reponse) {
        return enonce.checkAnswer(reponse);
    }
}
