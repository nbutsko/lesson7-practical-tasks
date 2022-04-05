package figures;

public class Main {
    static AbstractFigure square = new Square(1.5);
    static AbstractFigure rectangle = new Rectangle(1.5, 2.5);
    static AbstractFigure circle = new Circle(1.5);

    public static void main(String[] args) {
        System.out.println(square);
        System.out.println(rectangle);
        System.out.println(circle);

        System.out.println("Figures area:");
        System.out.println("Square: " + square.getArea());
        System.out.println("Rectangle: " + rectangle.getArea());
        System.out.println("Circle: " + circle.getArea());

        System.out.println("Figures perimeter:");
        System.out.println("Square: " + square.getPerimeter());
        System.out.println("Rectangle: " + rectangle.getPerimeter());
        System.out.println("Circle: " + circle.getPerimeter());

    }
}
