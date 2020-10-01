package centre_de_formation;

import java.util.HashMap;
import java.util.Map;

public class Etudiant extends Personne implements Comparable {

    private String numEtudiant;
    // cree map
    private Map<Matiere, Float> matiereNoteMap = new HashMap<>();

    public Etudiant(String nom, String prenom, int age, String numEtudiant, String dateDeNaissance) {
        super(nom, prenom, age, dateDeNaissance);
        this.numEtudiant = numEtudiant;
    }

    public String getNumEtudiant() {
        return numEtudiant;
    }

    @Override
    public void printCredentials() {
        System.out.println(numEtudiant + getNumEtudiant());
    }

    @Override
    public void MonRoleDansLeCentre() {
        System.out.println("je me forme");
    }

    //calcule de ma moyenne des note
    public float calculeMoyenne() {
        float sommeCoefficient = 0;// on initialise
        float sommeMatiere = 0;

        for (Matiere matiere : matiereNoteMap.keySet()) { // parcourir toute les cle de la map
            sommeCoefficient += matiere.getCoeffecient();
            sommeMatiere += matiere.getCoeffecient() * matiereNoteMap.get(matiere);
        }
        return sommeMatiere / sommeCoefficient;
    }

    //capareTo est fixé par l'interface a int
    @Override
    public int compareTo(Object o) {
        Etudiant etudiant = ((Etudiant) o);
        float differenceMoyenne = calculeMoyenne() - etudiant.calculeMoyenne();
        if (differenceMoyenne == 0) {
            return 0;
        } else if (differenceMoyenne < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
