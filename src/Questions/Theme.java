package Questions;

public class Theme {
    private final String nom;
    private ListeQuestions liste;

    public Theme(String nom) {
        this.nom = nom;
        liste = new ListeQuestions();
    }

    

    public void ajouterQuestion(Question q) {
        liste.ajouterQuestion(q);
    }
    
    public void setListe (ListeQuestions lq) {
        liste = lq;
    }
    
    public ListeQuestions getListe() {
        return liste;
    }

    
    
    @Override
    public String toString() {
        return  nom;
    }

    public void afficher() {
        System.out.println("\tTheme: " + nom);
    }
}
