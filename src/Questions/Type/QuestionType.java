package Questions.Type;

import java.io.Serializable;

public abstract class QuestionType<T> implements Serializable {
    protected final String enonce;
    protected final T answer;

    public QuestionType(String enonce, T correct) {
        this.enonce = enonce;
        this.answer = correct;
    }

    public void afficher() {
        System.out.println("'" + this.enonce + "'");
        System.out.println("Correct rep: \t" + answer);
    }

    public T getAnswerX(int i){
        return answer;
    }
    
    public boolean checkAnswer(Object answer) {
        if(answer.getClass().equals(this.answer.getClass())) {
            return this.answer == (T) answer;
        }
        return false;
    }
}