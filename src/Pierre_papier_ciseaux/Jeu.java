package Pierre_papier_ciseaux;


import Pierre_papier_ciseaux.exceptions.EntreeNonValideException;

public class Jeu {
    public static void main(String[] args) {
        Joueur Joueur1 = new JoueurHumain();
        Joueur Joueur2 = new Computer();
        jouer(Joueur1, Joueur2);
    }

    private static void jouer(Joueur joueur1, Joueur joueur2) {
        int maxRetries = 5;
        Coup choixJoueur1 = null;
        while (choixJoueur1 == null && maxRetries > 0) {
            maxRetries--;
            try {
                choixJoueur1 = joueur1.getChoix();
            } catch (EntreeNonValideException e) {
                e.printStackTrace();
            }
        }

        Coup choixJoueur2 = null;
        while (choixJoueur2 == null && maxRetries > 0) {
            maxRetries--;
            try {
                choixJoueur2 = joueur2.getChoix();
            } catch (EntreeNonValideException e) {
                e.printStackTrace();
            }
        }

        if (choixJoueur1 == choixJoueur2) {
            System.out.println("Egalite");
        } else if (((choixJoueur1 == Coup.ROCK) && (choixJoueur2 == Coup.SCISSOR)) ||
                ((choixJoueur1 == Coup.PAPER) && (choixJoueur2 == Coup.ROCK)) ||
                ((choixJoueur1 == Coup.SCISSOR) && (choixJoueur2 == Coup.PAPER))) {
            System.out.println("Le joueur 1 a gagné");
        } else {
            System.out.println("Le joueur 2 a gagné");
        }
    }
}
