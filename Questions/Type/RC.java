/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Type;

/**
 *
 * @author remyc
 */
public class RC {
    private final String question;
    private final String correctAnswer;


    public RC(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }
    
    
    public void afficher(){
        System.out.println("'"+ this.question +"'");
        System.out.print("Your answer: ");
    }
}
