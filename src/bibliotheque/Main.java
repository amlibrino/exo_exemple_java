package bibliotheque;

import bibliotheque.exception.BibliothequeRemplieException;
import bibliotheque.exception.ElementNonTrouveException;

public class Main {

    public static void main(String[] args) throws BibliothequeRemplieException, ElementNonTrouveException {

        Livres livre1 = new Livres();
        CD cd1 = new CD();
        Livres livre2 = new Livres();
        CD cd2 = new CD();
        Livres livre3 = new Livres();
        CD cd3 = new CD();

        BiblioTab biblioTab = new BiblioTab();
        try {
            biblioTab.add(livre1);
            biblioTab.add(livre2);
            biblioTab.add(livre3);
            biblioTab.add(cd1);
            biblioTab.add(cd2);
            biblioTab.remove(cd1);
        } catch (BibliothequeRemplieException bibliothequeRemplieExceptions) {
            System.out.println("!!!!!");
            bibliothequeRemplieExceptions.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("Fin du programme.");


    }
}
