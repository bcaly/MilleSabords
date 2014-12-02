package Jeu;

import java.io.File;

/**
 * Created by Berenice on 14/11/14.
 */
public class Model {
    Deck deckJeu;
    int nombreJoueur;
    Partie partie;

    public Model() {
        deckJeu = new Deck();
        deckJeu.melangerDeck();
    }

    public Carte tirerUneCarte() {
        return deckJeu.piocheCarte();
    }

    public void setPartie(Partie game) {
        partie = game;
    }
    public void setNbJoueur(int nb) { nombreJoueur = nb; }
    public int getNbJoueur() { return nombreJoueur; }

    public void supprimerCarteRepertoireScore() {
        File scoresRep=new File("src/Jeu/scores"); //
        File[] f = scoresRep.listFiles();
        for (int i = 0; i<f.length;i++){
            if (f[i].isFile()){
                f[i].delete();
            }
        }
    }
}
