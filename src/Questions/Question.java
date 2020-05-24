/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import Questions.Type.QuestionType;

/**
 * @author remyc
 */
public class Question<Type extends QuestionType> {
    private final int number;
    private static int qTotal = 0;
    private final String theme;
    private final int difficulty;
    private final Type enonce;    //QCM, VF or RC


    public Question(String theme, int level, Type type) {
        this.number = ++qTotal;
        this.theme = theme;
        this.difficulty = level;
        this.enonce = type;
    }

    public int getNumber() {
        return number;
    }

    public void Afficher() {
        System.out.println("\n\nDifficulty: \t" + this.difficulty);
        System.out.println("Theme : \t" + this.theme); //TEMP
        enonce.afficher();
    }


    public void Saisir() {
        //this.enonce.afficher();    //marche pas aled
    }
}
