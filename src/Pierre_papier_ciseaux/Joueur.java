package Pierre_papier_ciseaux;


import Pierre_papier_ciseaux.exceptions.EntreeNonValideException;

public abstract class Joueur {

    public abstract Coup getChoix() throws EntreeNonValideException;
}
