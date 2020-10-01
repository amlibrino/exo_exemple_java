package centre_de_formation;

public abstract class Personne {
    // le but c'est de transformer la class personne en class abstraite
    private String nom;
    private String prenom;
    private int age; /// type entier : classement par taille : byte (8bits) puis short , int puis long.
    private String dateDeNaissance;

    //String role; // Directeur , centre_de_formation.Formateur, Secretaire, Stagiaire


    public Personne(String nom, String prenom, int age, String dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void printCredentials() {
        System.out.println(nom + prenom + age);
    }

    public abstract void MonRoleDansLeCentre();
}
