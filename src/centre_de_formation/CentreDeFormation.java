package centre_de_formation;

import centre_de_formation.exceptions.ExpertNotFoundException;

import java.util.List;

public class CentreDeFormation {

    private String nom;
    private String adresse;
    private Administration administration;
    private Integer anneeDeCreation;
    private List<Matiere> matieres;
    private List<Formateur>formateurs;

    public CentreDeFormation(String nom, String adresse, Administration administration, Integer anneeDeCreation, List<Matiere> matieres, List<Formateur> formateurs) {
        this.nom = nom;
        this.adresse = adresse;
        this.administration = administration;
        this.anneeDeCreation = anneeDeCreation;
        this.matieres = matieres;
        this.formateurs = formateurs;
    }

    public boolean reserverCours(Matiere m){
        if (!matieres.contains(m)) {
            return false;
        }
        for (Formateur f : formateurs) {
            if (f.isExpertIn(m)) {
                return true;
            }
        }
        throw new ExpertNotFoundException("On a pas trouvé d'expert pour cette matiere");
    }

}
