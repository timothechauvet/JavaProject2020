/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author remyc
 */
public class ListeQuestions {
    private Question curr;
    private ListeQuestions next;

    
    public ListeQuestions(Question curr, ListeQuestions next) {
        this.curr = curr;
        this.next = next;
    }
    
    
    public void AfficherListe() {
        if(this.curr != null) {
            curr.Afficher();
            next.AfficherListe();
        }
    }
    
    public void AjouterQestion (Question q) {
        if(this.curr != null) this.next.AjouterQestion(q);
        else this.curr = q;
    }
    
    public void SupprimierQuestion(int index) {
        int cpt=0;
        if(cpt == index) {
            
        }
    }
    public void SupprimierQuestion(int index, int cpt) {
        
    }
    
}
