package principe_d_heritage;
// juste à titre d'exemple

public class Humain {
    String nom;
    String dateDeNaissance;

    public Humain(String nom, String dateDeNaissance) {
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
    }

    public void pintCredentials(String s){
        System.out.println(nom + " "+ dateDeNaissance);
    }

}
