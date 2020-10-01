package bibliotheque;

import java.util.LinkedList;
import java.util.List;

public class BiblioList extends Bibliotheque{


    // deuxieme methode avec linkedList ou arrayList
    private List<Ouvrage> ouvrageList = new LinkedList<>();

    @Override
    public boolean add(Ouvrage o) {
        return ouvrageList.add(o);
    }

    @Override
    public boolean remove(Ouvrage o) {
        return ouvrageList.remove(o);
    }

    @Override
    public Ouvrage get(int index) {
        return ouvrageList.get(index);
    }

    @Override
    public int size() {
        return ouvrageList.size();
    }
}
