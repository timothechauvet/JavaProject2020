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
    
    public ListeQuestions supprQuestion(int difficulte, String question){
        ListeQuestions nouvelleListe = new ListeQuestions();
        for(int i = 0; i < this.getLenght(); i++){
            if(liste.getQuestionX(i).getDifficulty() == difficulte && liste.getQuestionX(i).getEnonce().getEnonce().equals(question))
                System.out.println("Question supprimée");
            else
                nouvelleListe.ajouterQuestion(liste.getQuestionX(i));
        }
        return nouvelleListe;
    }
    
    public void setListe (ListeQuestions lq) {
        liste = lq;
    }
    
    public ListeQuestions getListe() {
        return liste;
    }

    public int getLenght(){
        return liste.getLength();
    }
    
    @Override
    public String toString() {
        return  nom;
    }

    public void afficher() {
        System.out.println("\tTheme: " + nom);
    }
}
