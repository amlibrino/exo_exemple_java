package exo_geometrie;

public class Triangle extends Figure implements Translater {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(int couleur, Point p1, Point p2, Point p3) {
        super(couleur);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
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

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public void translater(Point vecteur) {
        p1.translater(vecteur);
        p2.translater(vecteur);
        p3.translater(vecteur);

    }

    @Override
    public void afficher() {
        super.afficher();
        p1.afficher();
        p2.afficher();
        p3.afficher();
    }
}
