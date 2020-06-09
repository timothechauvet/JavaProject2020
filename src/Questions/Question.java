/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.io.Serializable;

/**
 * @author remyc
 * @param <T> is either QCM, RC or VF
 */
public abstract class Question <T> implements Serializable {
    private final int number;
    private static int qTotal = 0;
    private final String theme;
    private final int difficulty;
    
    private final String enonce;
    private final T correctAnswer;    //depends on the type of questio; QCM, VF or RC

    

    public Question(String theme, int level, String enonce, T correctAnswer) {
        this.number = ++qTotal;
        this.theme = theme;
        this.difficulty = level;
        
        this.enonce = enonce;
        this.correctAnswer = correctAnswer;
    }

    
    
    
    public int getNumber () {
        return number;
    }
    
    public int getDifficulty () {
        return this.difficulty;
    }
    
    public String getenonce () {
        return this.enonce;
    }

    public void afficher() {
        System.out.println("\n\nQuestion n°\t" + this.number);
        System.out.println("Difficulty: \t" + this.difficulty);
        System.out.println("Theme : \t" + this.theme); //TEMP
        System.out.println(enonce);
    }


    public void saisir() {
        /*Une méthode Saisir qui permet la saisie d’une fonction d’un type T donné.*/
    }
    
    public boolean checkAnswer(T answer) {
        return correctAnswer == answer;
    }
}
