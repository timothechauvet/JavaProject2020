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
public class QCM {
    private final String question;
    private final String r1;
    private final String r2;
    private final String r3;
    private final String correctAnswer;
    
    
    public QCM(String question, String r1, String r2, String r3, String CA){
        this.question = question;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.correctAnswer = CA;
    }
    
    
    public void afficher(){
        System.out.println("'"+ this.question +"'");
        System.out.println(" -> "+this.r1);
        System.out.println(" -> "+this.r2);
        System.out.println(" -> "+this.r3);
        System.out.print("Your answer: ");
    }
}
