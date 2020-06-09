package Phases;

import Joueurs.EnsJoueurs;
import Joueurs.Joueur;
import Questions.Theme;
import Questions.Themes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeuxiemePhase implements Phase {
    private ArrayList<Joueur> inPlay;
    private ArrayList<Theme> availableThemes;

    public DeuxiemePhase() {
        this.inPlay = new ArrayList<>(3);
        this.availableThemes = new ArrayList<>(Arrays.asList(Themes.instance.getThemes()));

        SelectionerJoueurs();

        for (int round = 0; round < 2; round++) {
            PhaseDeJeu();
        }

    }

    @Override
    public void SelectionerJoueurs() {
        ArrayList<Joueur> selected = new ArrayList<>(EnsJoueurs.instance.getSelected());
        Joueur lastJoueur= selected.stream().min(Joueur::compareTo).get();

        ArrayList<Joueur> allLast = selected.stream().filter(j -> j.getScore() == lastJoueur.getScore()).collect(Collectors.toCollection(ArrayList::new));
        if(allLast.size() != 1) {
            TieBreak tieBreak = new TieBreak(selected);
            tieBreak.PhaseDeJeu();
            inPlay.addAll(EnsJoueurs.instance.getSelected());
        }
        else {
            lastJoueur.changerEtat(Joueur.ELIMINATED);
            selected.remove(lastJoueur);
            inPlay.addAll(selected);
        }
    }

    @Override
    public void PhaseDeJeu() {

    }
}
