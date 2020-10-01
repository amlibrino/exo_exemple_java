package principe_d_heritage;

// juste un exemple

public class Etudiant_exemple extends Humain {
    int num_etudiant;

    public Etudiant_exemple(String nom, String dateDeNaissance, int num_etudiant) {
        super(nom, dateDeNaissance);
        this.num_etudiant = num_etudiant;
    }

    @Override
    public void pintCredentials(String s) {
        super.pintCredentials(nom + " " + dateDeNaissance);
    }
}
