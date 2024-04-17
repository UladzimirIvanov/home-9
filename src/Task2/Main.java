package Task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 10);
        System.out.println("Площадь прямоугольника равна: " + rectangle.square());
        System.out.println("Периметр прямоугольника равен: " + rectangle.perimeter());

        System.out.println();
        System.out.println("*********************************");
        System.out.println();

        Circle circle = new Circle(12);
        System.out.println("Площать круга равна: " + circle.square());
        System.out.println("Периметр круга равен: " + circle.perimeter());
    }
}
