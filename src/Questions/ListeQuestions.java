/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import Questions.Type.QCM;

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
    public ListeQuestions(Question curr) {
        this.curr = curr;
        this.next = null;
    }
    
    
    public void AfficherListe() {
        if(this.curr != null) {
            curr.Afficher();
            next.AfficherListe();
        }
    }
    
    public void AjouterQuestion (Question<QCM> q) {
        if(this.curr != null) this.next.AjouterQuestion(q);
        else this.curr = q;
    }
    
    public void SupprimerQuestion(int index) {
        int cpt=0;
        if(cpt == index-1){
            this.next = this.next.next;
        }
        else SupprimerQuestion(index, cpt);
    }
    private void SupprimerQuestion(int index, int cpt) {
        if(cpt == index-1){
            this.next = this.next.next;
        }
    }


}
