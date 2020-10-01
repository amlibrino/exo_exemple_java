package exo_geometrie;

public class Figure {
    private int couleur;

    public Figure(){

    }

    public Figure(int couleur) {
        this.couleur = couleur;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public void afficher(){
        System.out.println(this.couleur);
    }
}
