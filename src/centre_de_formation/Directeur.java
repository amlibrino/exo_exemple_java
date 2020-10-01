package centre_de_formation;

public class Directeur extends Personne {


        private int numEmploye;
        private int anciennete;

    public Directeur(String nom, String prenom, int age, String dateDeNaissance, int numEmploye, int anciennete) {
        super(nom, prenom, age, dateDeNaissance);
        this.numEmploye = numEmploye;
        this.anciennete = anciennete;
    }

    public int getNumEmploye() {
            return numEmploye;
        }

        public int getAnciennete() {
            return anciennete;
        }


        public void printCredentials() {
            System.out.println(numEmploye + anciennete);
        }

        @Override
        public void MonRoleDansLeCentre() {
            System.out.println("je dirige");
        }





}
