package shape;

public class Circle extends Shape {
    final static double PI =3.14;
    private double radius ;

    public Circle(int i, int i1) { radius = 0 ;
    }

    public Circle(double x, double y, double r) { super(x,y) ;
        radius = r ;
    }

    @Override
    public String toString() {
        return super.toString() + " Rayon : " + radius ;
    }
}
