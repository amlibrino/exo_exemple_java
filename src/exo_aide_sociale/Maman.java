package exo_aide_sociale;


import java.util.List;

public class Maman implements Comparable {
/*
    -	Un organisme d’aide sociale a une liste de mamans en besoin.
    Il essaie de les classer selon l’urgence de leurs besoins, selon les critères suivants (classés par importance) :
        ●	critère1 : salaire
        ●	critère 2 : nombre d’enfants
        ●	critère 3 :age
            (donc il faudra d’abord regarder le salaire, puis le nombre d’enfants puis l'âge).
         ●	Ajoutez le code nécessaire à  la classe Maman pour réaliser ce classement.*/


    private String prenom;
    private List<Enfant> enfants;
    private int age;
    private int salaire; // float

    public Maman(String prenom, List<Enfant> enfants, int age) {
        this.prenom = prenom;
        this.enfants = enfants;
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        Maman maman = ((Maman) o);
        int difSalaire = salaire - maman.salaire;
        int difNbEnfant = enfants.size() - maman.enfants.size();
        int difAge = age - maman.age;

        if (difSalaire != 0) {
            return difSalaire;
        } else if (difNbEnfant != 0) {
            return difNbEnfant;
        } else {
            return difAge;
        }
    }

}
