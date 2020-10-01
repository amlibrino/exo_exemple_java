package Pierre_papier_ciseaux;

import java.util.Random;

public class Computer extends  Joueur {
    public int getRandomInt() {
        Random r = new Random();
        return r.nextInt();
    }

    public Coup getChoix() {
        int randomNumber = getRandomInt();
        if (randomNumber % 3 == 0) {
            return Coup.PAPER;
        } else if (randomNumber % 3 == 1) {
            return Coup.ROCK;
        }
        return Coup.SCISSOR;
    }
}
