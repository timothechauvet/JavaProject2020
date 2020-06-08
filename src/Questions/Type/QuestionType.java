package Questions.Type;

public abstract class QuestionType<T> {
    protected final String enonce;
    protected final T correct;

    public QuestionType(String enonce, T correct) {
        this.enonce = enonce;
        this.correct = correct;
    }

    public void afficher() {
        System.out.println("'" + this.enonce + "'");
    }

    public boolean checkAnswer(Object answer) {
        if(answer.getClass().equals(correct.getClass())) {
            return correct == (T) answer;
        }
        return false;
    }
}