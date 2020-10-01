package centre_de_formation;

import java.util.List;

public class Formateur extends Personne {
    private int numFormateur;
    private List<Matiere> specialite;

    //cree une map

    public Formateur(String nom, String prenom, int age, int numFormateur, String dateDeNaissance) {
        super(nom, prenom, age, dateDeNaissance);
        this.numFormateur = numFormateur;
    }

    public int getNumFormateur() {
        return numFormateur;
    }

    public List<Matiere> getSpecialite() {
        return specialite;
    }

    public boolean isExpertIn(Matiere m) {
        return specialite.contains(m);
    }

    @Override
    public void printCredentials() {
        System.out.println(numFormateur);
        super.printCredentials();
    }

    @Override
    public void MonRoleDansLeCentre() {
        System.out.println("j'enseigne");

    }
}
