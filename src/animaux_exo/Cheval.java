package animaux_exo;

import animaux_exo.interfaces.Mammifere;

public class Cheval implements Mammifere {



    @Override
    public void marcher() {
        System.out.println("je marche");
    }

    @Override
    public void courir() {
        System.out.println("tagada tagada");
    }
}
