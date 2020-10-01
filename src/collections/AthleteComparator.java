package collections;

import java.util.Comparator;

public class AthleteComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if (o1.getTechnique() > o2.getTechnique()) {
            return 1;
        } else if (o1.getTechnique() < o2.getTechnique()) {
            return -1;
        } else {
            return o1.getForce() - o2.getForce();
        }
    }
}
