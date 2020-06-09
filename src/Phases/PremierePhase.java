package Phases;

import Joueurs.EnsJoueurs;
import Joueurs.Joueur;
import Questions.Question;
import Questions.Theme;
import Questions.Themes;

import java.util.ArrayList;
import java.util.Scanner;

public class PremierePhase implements Phase {
    private ArrayList<Joueur> inPlay;

    public PremierePhase() {
        this.inPlay = new ArrayList<>(4);

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
        Scanner sc = new Scanner(System.in);
        Joueur playing;
        Question<?> q;
        boolean res=false;

        ArrayList<Joueur> waiting = new ArrayList<>(inPlay);
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
