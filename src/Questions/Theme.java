package Questions;

public class Theme {
    private final String nom;
    private ListeQuestions liste;

    public Theme(String nom) {
        this.nom = nom;
        liste = new ListeQuestions();
    }

    public String getNom() {
        return nom;
    }

    public ListeQuestions getListe() {
        return liste;
    }

    @Override
    public String toString() {
        return  nom;
    }
}
