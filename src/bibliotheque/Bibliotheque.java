package bibliotheque;

import bibliotheque.exception.BibliothequeRemplieException;
import bibliotheque.exception.ElementNonTrouveException;

public abstract class  Bibliotheque {

    public abstract boolean add (Ouvrage o) throws BibliothequeRemplieException;

    public abstract boolean remove (Ouvrage o) throws ElementNonTrouveException;


    public abstract Ouvrage get(int index);

    public abstract int size();



}
