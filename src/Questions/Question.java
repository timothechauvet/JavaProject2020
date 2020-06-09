/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

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
    
    public int getDifficulty () {
        return this.difficulty;
    }

    public void afficher() {
        System.out.println("\n\nQuestion n°\t" + this.number);
        System.out.println("Difficulty: \t" + this.difficulty);
        enonce.afficher();
    }


    public boolean saisir(Object reponse) {
        return enonce.checkAnswer(reponse);
    }
}
