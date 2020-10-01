package bibliotheque;

public class CD extends Ouvrage{
    private String auteur;
    private String titre;

    public CD() {
    }

    public CD(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "CD{" +
                "auteur='" + auteur + '\'' +
                ", titre='" + titre + '\'' +
                '}';
    }
}
