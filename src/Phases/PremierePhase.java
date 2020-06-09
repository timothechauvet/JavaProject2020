package Phases;

import Joueurs.EnsJoueurs;
import Joueurs.Joueur;
import Questions.Question;
import Questions.Theme;
import Questions.Themes;

import java.util.Scanner;
import java.util.Vector;

public class PremierePhase implements Phase {
    private Vector<Joueur> inPlay;

    public PremierePhase() {
        this.inPlay = new Vector<>(4);

        SelectionerJoueurs();

        for (int round = 0; round < 4; round++) {
            PhaseDeJeu();
        }

    }

    @Override
    public void SelectionerJoueurs() {
        Joueur newPlayer;
        EnsJoueurs ej = EnsJoueurs.instance;

        for (int i = 0; i < 4; i++) {
            newPlayer = ej.selectionnerJoueur();
            newPlayer.changerEtat(Joueur.SELECTED);
            inPlay.add(newPlayer);
        }
    }

    @Override
    public void PhaseDeJeu() {
        Themes t = Themes.instance;
        Theme chosen = t.getThemeAt(t.selectionnerTheme()); //TODO change selectionner to directly get theme object
        String inStr;
        Scanner sc = new Scanner(System.in);
        Joueur playing;
        Question<?> q;
        boolean res=false;

        Vector<Joueur> waiting = (Vector<Joueur>) inPlay.clone();
        while (!waiting.isEmpty())
        {
            playing = waiting.remove((int) (Math.random() * waiting.size()));
            q = chosen.getListe().selectionnerQuestion(1);

            //-----This part handled in swing interface-----
            chosen.afficher();
            q.afficher();

            //TODO activate timer here

            if(q.saisir(sc.next())) { //obviously this only works with RC but its very temp
                playing.majScore(2);
            }

            //-----------------------------------------------
        }
    }
}
