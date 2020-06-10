package Questions.Type;

import Interface.StringWrapper;
import java.io.Serializable;

public abstract class QuestionType<T> implements Serializable {
    protected final String enonce;
    protected final T answer;

    public QuestionType(String enonce, T correct) {
        this.enonce = enonce;
        this.answer = correct;
    }

    public void afficher(StringWrapper enonce,StringWrapper r1,StringWrapper r2,StringWrapper r3,StringWrapper r4,StringWrapper reponse) {
        enonce.setText(this.enonce);
    }
    
    public boolean checkAnswer(Object answer) {
        if(answer.getClass().equals(this.answer.getClass())) {
            if(answer.getClass() == String.class){ // pour les RC 
                String s = (String) this.answer;
                if(s.trim().compareToIgnoreCase((String)answer) == 0)
                    return true;
                else 
                    return false;
            }
            else{  // pour les VF ou QCM
                return this.answer == answer;
            }
        }
        else {
            System.out.println("Pas la même classe");
            return false;
        }
    }
    
    public String getEnonce(){
        return enonce;
    }
}