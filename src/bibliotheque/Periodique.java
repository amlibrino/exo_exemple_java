package bibliotheque;

import java.util.Date;

public class Periodique {
    //nom, numéro, périodicité
    private String nom;
    private long numéro;
    private Date periodicite;


    public Periodique(String nom, long numéro, Date periodicite) {
        this.nom = nom;
        this.numéro = numéro;
        this.periodicite = periodicite;
    }

    @Override
    public String toString() {
        return "Periodique{" +
                "nom='" + nom + '\'' +
                ", numéro=" + numéro +
                ", periodicite=" + periodicite +
                '}';
    }
}
