package Task2;

public class Triangle extends Figure {
    /*Площадь треугольника вычисляется в зависимости от самого треугольника и от известных нам данных.
     * Но я возьму в расчёт, что треугольник мой имеет один прямой угол и известны две стороны.*/

    double a;
    double b;
    double s;
    double p;

    @Override
    double square() {
        s = (a * b) / 2;
        return s;
    }

    @Override
    double perimeter() {
        p = Math.sqrt((a * a) + (b * b)) + a + b;
        return p;
    }

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
