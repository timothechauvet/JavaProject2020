/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Type;

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

    
    public void afficher() {
        super.afficher();
        for (String answer : this.answers) System.out.println(" -> " + answer);
        System.out.print("Your answer: ");
    }
}
