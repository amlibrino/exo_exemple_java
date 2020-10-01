package bibliotheque;

public class Livres extends Ouvrage{
    //auteur, titre, éditeur ;

    private String auteur;
    private String titre;
    private String editeur;

    public Livres(String auteur, String titre, String editeur) {
        this.auteur = auteur;
        this.titre = titre;
        this.editeur = editeur;
    }

    public Livres() {
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public String getEditeur() {
        return editeur;
    }

    @Override
    public String toString() {
        return "Livres{" +
                "auteur='" + auteur + '\'' +
                ", titre='" + titre + '\'' +
                ", editeur='" + editeur + '\'' +
                '}';
    }
}
