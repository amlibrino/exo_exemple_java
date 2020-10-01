package exo_geometrie;

public class Point implements Translater {

    private int x; // abscisse
    private int y; // ordonnée

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /* en mode translation par vecteur
    => Un vecteur commençant au point (0,0) et le point
        en parametre indique la direction de la translation

     */
    @Override
    public void translater(Point vecteur) {

        this.x += vecteur.getX();
        this.y += vecteur.getY();

    }

    public void afficher(){
        System.out.println(x + " " + y);
    }
}
