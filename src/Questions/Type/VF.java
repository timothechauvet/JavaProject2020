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
public class VF {
    private final String question;
    private final boolean correcteAnswer;

    
    public VF(String question, boolean correcteAnswer) {
        this.question = question;
        this.correcteAnswer = correcteAnswer;
    }


    public void afficher(){
        System.out.println("'"+ this.question +"'");
        System.out.print("Your answer: ");
    }
}
