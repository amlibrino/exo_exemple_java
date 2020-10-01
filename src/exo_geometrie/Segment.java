package exo_geometrie;

public class Segment extends Figure implements Translater {

    private Point p1;
    private Point p2;

    public Segment(int couleur, Point p1, Point p2) {
        super(couleur);
        if (p1 == p2){
            throw new NotRealSegmentException();
        }
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    // en mode translation par vecteur
    @Override
    public void translater(Point vecteur) {
        p1.translater(vecteur);
        p2.translater(vecteur);
    }

    @Override
    public void afficher() {
        super.afficher();
        p1.afficher();
        p2.afficher();
    }
}
