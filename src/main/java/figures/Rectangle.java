package figures;

public class Rectangle extends AbstractFigure {

    private double firstSideLength;
    private double secondSideLength;

    public Rectangle(double firstSideLength, double secondSideLength) {
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    @Override
    public double getArea() {
        return firstSideLength * secondSideLength;
    }

    @Override
    public double getPerimeter() {
        return 2 * (firstSideLength + secondSideLength);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "firstSideLength=" + firstSideLength +
                ", secondSideLength=" + secondSideLength +
                '}';
    }
}
