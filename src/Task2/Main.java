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

        System.out.println();
        System.out.println("*********************************");
        System.out.println();

        Triangle triangle = new Triangle(4, 7);
        System.out.println("Площать реугольника равна: " + triangle.square());
        System.out.println("Периметр треугольника равен: " + triangle.perimeter());

        System.out.println();
        System.out.println("*********************************");
        System.out.println();

        double a = 0;
        double[] arr = {triangle.perimeter(), circle.perimeter(), rectangle.perimeter(), circle.perimeter(), triangle.perimeter()};
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];
        }
        System.out.println(a);


        /*Мне кажется, что в этой задаче родитель Figure максимально бесполезен, я всё равно расписывал методы в каждом наследнике*/
    }
}
