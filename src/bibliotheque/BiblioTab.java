package bibliotheque;

import bibliotheque.exception.BibliothequeRemplieException;

public class BiblioTab extends Bibliotheque {

    // premier facon de faire les methodes avec un tavleau
    private static final int CAPACITY = 5;
    private Ouvrage[] tableauOuvrage = new Ouvrage[CAPACITY];
    private int position = 0;

    @Override
    public boolean add(Ouvrage o) throws BibliothequeRemplieException {
        if (position >= CAPACITY - 1) {
            throw new BibliothequeRemplieException("message");
        }
        tableauOuvrage[position] = o;
        position++;
        return true; // lorsque le tableau est rempli

    }

    @Override
    public boolean remove(Ouvrage o) {
        if (o == null) return false;

        for (int i = 0; i < position; i++) {
            if (o.equals(tableauOuvrage[i])) {
                tableauOuvrage[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Ouvrage get(int index) {
        if (index < position){
            return tableauOuvrage[index];
        }
        return null;
    }

    @Override
    public int size() {

        return position;//retourne position de nombre inserer dans le tableau
    }

}
