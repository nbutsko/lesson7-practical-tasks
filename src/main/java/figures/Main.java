package figures;

public class Main {
    static AbstractFigure circle = new Circle(1.5);
    static AbstractFigure rectangle = new Rectangle(1.5, 2.5);
    static AbstractFigure triangle = new Triangle(1.5, 2.5, 3.5);

    public static void main(String[] args) {
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);

        System.out.println("=== Figures area: ===");
        System.out.println("Circle: " + circle.getArea());
        System.out.println("Rectangle: " + rectangle.getArea());
        System.out.println("Triangle: " + triangle.getArea());

        System.out.println("=== Figures perimeter: ===");
        System.out.println("Circle: " + circle.getPerimeter());
        System.out.println("Rectangle: " + rectangle.getPerimeter());
        System.out.println("Triangle: " + triangle.getPerimeter());


    }
}
