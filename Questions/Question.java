/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author remyc
 */
public class Question <Type> {
    private final int number;
    private final String theme;
    private final int difficulty;
    private final Type énoncé;    //QCM, VF or RC
    
    
    public Question(int nbr, String theme, int level, Type type){
        this.number = nbr;
        this.theme = theme;
        this.difficulty = level;
        this.énoncé = type;
    }
    
    
    public void Afficher(){
        System.out.println("difficulty: \t"+this.difficulty);
        System.out.println("-> "+this.énoncé);
    }
    
    
    public void Saisir(){
        /*this.énoncé.afficher*/    //marche pas aled
    }
}
