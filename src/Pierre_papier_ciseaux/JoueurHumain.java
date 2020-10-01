package Pierre_papier_ciseaux;

import Pierre_papier_ciseaux.exceptions.EntreeNonValideException;

import java.util.Scanner;

public class JoueurHumain extends Joueur {

    public Coup getChoix() throws EntreeNonValideException {
        System.out.println("faites votre choix , ROCK, PAPER, SCISSOR");
        Scanner scanner = new Scanner(System.in);
        String coup = scanner.nextLine();
        if (!coup.equals("ROCK") && !coup.equals("PAPER") && !coup.equals("SCISSSOR")) {
            throw new EntreeNonValideException(); // unchecked Exception (Runtime)
        }
        Coup monCoup = Coup.valueOf(coup);
        return monCoup;
    }
}

    /*
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String joueur1Joue;
        String joueur2Joue;

        System.out.println("Joueur 1: entrez votre jeu");
        joueur1Joue = clavier.nextLine();
        System.out.println("Joueur 2: entrez votre jeu");
        joueur2Joue = clavier.nextLine();
    }
     */

