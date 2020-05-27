package Questions;

public class QuestionType {
    protected final String enonce;

    public QuestionType(String question) {
        this.enonce = question;
    }

    public void afficher() {
        //TODO put all this in a better format for swing implementation
        System.out.println("'" + this.enonce + "'");
    }
}
