package Phases;

import Joueurs.EnsJoueurs;
import Joueurs.Joueur;
import Questions.Question;
import Questions.Theme;
import Questions.Themes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeuxiemePhase implements Phase {
    private ArrayList<Joueur> inPlay;
    private ArrayList<Theme> availableThemes;
    private final JLabel timerLabel;

    public DeuxiemePhase(JLabel timerLabel) {
        this.availableThemes = new ArrayList<>(Arrays.asList(Themes.instance.getThemes()));
        this.timerLabel = timerLabel;

        SelectionerJoueurs();

        for (int round = 0; round < 2; round++) {
            PhaseDeJeu();
        }

    }

    @Override
    public void SelectionerJoueurs() {
        ArrayList<Joueur> selected = new ArrayList<>(EnsJoueurs.instance.getSelected());

        inPlay = new ArrayList<>(GameActions.eliminateLast(selected,0));
    }

    @Override
    public void PhaseDeJeu() {
        Scanner sc = new Scanner(System.in);
        String inStr;

        Theme chosen;
        Joueur playing;
        Question<?> q;
        boolean res=false;

        Timer watch = new Timer(timerLabel);

        ArrayList<Joueur> waiting = new ArrayList<>(inPlay);
        while (!waiting.isEmpty())
        {
            playing = waiting.remove((int) (Math.random() * waiting.size()));

            //-----This part handled in swing interface-----
            System.out.println(availableThemes);
            inStr = sc.next();
            chosen = null;

            //no error check, but very TEMP
            for (Theme t : availableThemes) {
                if(t.toString().equals(inStr)) chosen=t; break;
            }

            q = chosen.getListe().selectionnerQuestion(2);// this line stays here
            watch.run();

            chosen.afficher();
            q.afficher();


            if(q.saisir(sc.next())) { //obviously this only works with RC but its very temp
                playing.majScore(3);
            }

            //-----------------------------------------------

            watch.stopTimer();
            playing.addTime(watch.getTime());

            //put in something like a next button here
        }
    }
}
