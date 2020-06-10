package Phases;

import Joueurs.EnsJoueurs;
import Joueurs.Joueur;
import Questions.Question;
import Questions.Theme;
import Questions.Themes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TroisiemePhase implements Phase {
    private ArrayList<Joueur> inPlay;
    private int curTheme;
    private final JLabel timerLabel;

    public TroisiemePhase(JLabel timerLabel) {
        int [] phaseThemes = Themes.instance.selectionnerThemes(3);
        this.timerLabel = timerLabel;

        SelectionerJoueurs();

        for (int t : phaseThemes) {
            curTheme = t;
            PhaseDeJeu();
        }

        SelectionerJoueurs();

        inPlay.get(0).changerEtat(Joueur.WINNER);
    }

    @Override
    public void SelectionerJoueurs() {
        ArrayList<Joueur> selected = new ArrayList<>(EnsJoueurs.instance.getSelected());

        inPlay = new ArrayList<>(GameActions.eliminateLast(selected,0));
    }

    @Override
    public void PhaseDeJeu() {
        Question<?> q;
        Theme t = Themes.instance.getThemeAt(curTheme);
        Scanner sc = new Scanner(System.in);

        Timer watch = new Timer(timerLabel);

        for(Joueur playing : inPlay){
            q = t.getListe().selectionnerQuestion(3);

            watch.run();
            //-----This part handled in swing interface-----
            t.afficher();
            q.afficher();


            if(q.saisir(sc.next())) { //obviously this only works with RC but its very temp
                playing.majScore(5);
            }

            //-----------------------------------------------

            watch.stopTimer();
            playing.addTime(watch.getTime());
        }
    }
}
