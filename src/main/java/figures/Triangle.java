package figures;

public class Triangle extends AbstractFigure {

    private double firstSideLength;
    private double secondSideLength;
    private double thirdSideLength;

    public Triangle(double firstSideLength, double secondSideLength, double thirdSideLength) {
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
    }

    @Override
    public double getArea() {
        double halfMeter = getPerimeter() / 2;
        return Math.sqrt(halfMeter * (halfMeter - firstSideLength) * (halfMeter - secondSideLength) * (halfMeter - thirdSideLength));
    }

    @Override
    public double getPerimeter() {
        return firstSideLength + secondSideLength + thirdSideLength;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSideLength=" + firstSideLength +
                ", secondSideLength=" + secondSideLength +
                ", thirdSideLength=" + thirdSideLength +
                '}';
    }
}
