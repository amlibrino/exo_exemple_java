package animaux_exo;

import animaux_exo.interfaces.Mammifere;
import animaux_exo.interfaces.Parleur;
import animaux_exo.interfaces.Siffleur;

public class Homme implements Mammifere, Parleur, Siffleur {

    private String nom;
    private String prenom;

    public Homme(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Hommes{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }


    @Override
    public void marcher() {

    }

    @Override
    public void courir() {
        System.out.println("je cours");
    }

    @Override
    public void parler() {

    }

    @Override
    public void siffler() {

    }
}
