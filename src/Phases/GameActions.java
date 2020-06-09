package Phases;

import Joueurs.EnsJoueurs;
import Joueurs.Joueur;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class GameActions {
    public static ArrayList<Joueur> eliminateLast(ArrayList<Joueur> inJoueurs, int eliminationRound) {
        if(eliminationRound>2) {
            int randJ = (int) (Math.random() * inJoueurs.size());
            inJoueurs.get(randJ).changerEtat(Joueur.ELIMINATED);
            inJoueurs.remove(randJ);
        } else {
            Joueur lastJoueur= inJoueurs.stream().min(Joueur::compareTo).get();

            ArrayList<Joueur> allLast = inJoueurs.stream().filter(j -> j.getScore() == lastJoueur.getScore()).collect(Collectors.toCollection(ArrayList::new));
            if(allLast.size() != 1) {
                TieBreak tieBreak = new TieBreak(allLast, eliminationRound);
                tieBreak.PhaseDeJeu();
                inJoueurs = new ArrayList<>(EnsJoueurs.instance.getSelected());
            } else {
                lastJoueur.changerEtat(Joueur.ELIMINATED);
                inJoueurs.remove(lastJoueur);
            }
        }
        inJoueurs.forEach(Joueur::resetTime);
        return inJoueurs;
    }
}
