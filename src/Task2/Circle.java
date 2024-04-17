package Task2;

public class Circle extends Figure {
    final double PI = 3.14;
    double r;
    double s;
    double p;

    @Override
    double square() {
        s = PI * (r * r);
        return s;
    }

    @Override
    double perimeter() {
        p = 2 * PI * r;
        return p;
    }
    public Circle(double r){
        this.r = r;
    }
}
