package collections;

public class Athlete implements Comparable<Athlete> {
    private int force;
    private float agilite;
    private int technique;

    public Athlete(int force, float agilite, int technique) {
        this.force = force;
        this.agilite = agilite;
        this.technique = technique;
    }

    public int getForce() {
        return force;
    }

    public float getAgilite() {
        return agilite;
    }

    public int getTechnique() {
        return technique;
    }

    @Override
    public int compareTo(Athlete o) {
        if (o.getAgilite() == agilite) {
            return 0;
        } else {
            return Math.round(Math.signum(agilite - o.getAgilite()));
        }
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "force=" + force +
                ", agilite=" + agilite +
                ", technique=" + technique +
                '}';
    }
}

