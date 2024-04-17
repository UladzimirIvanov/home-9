package Task2;

public class Rectangle extends Figure {
    int a;
    int b;
    int s;
    int p;

    @Override
    double square() {
        s = a * b;
        return s;
    }

    @Override
    double perimeter() {
        p = 2 * (a + b);
        return p;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
