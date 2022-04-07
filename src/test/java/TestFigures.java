import figures.AbstractFigure;
import figures.Circle;
import figures.Rectangle;
import figures.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFigures {

    private AbstractFigure figure;

    @Test
    public void testCalculationOfTheCirclePerimeter(){
        figure = new Circle(1.5);
        assertEquals(9.425, figure.getPerimeter(), 0.001);
    }

    @Test
    public void testCalculationOfTheCircleArea(){
        figure = new Circle(1.5);
        assertEquals(7.069, figure.getArea(), 0.001);
    }

    @Test
    public void testCalculationOfTheRectanglePerimeter(){
        figure = new Rectangle(1.5, 2.5);
        assertEquals(8.0, figure.getPerimeter(), 0.001);
    }

    @Test
    public void testCalculationOfTheRectangleArea(){
        figure = new Rectangle(1.5, 2.5);
        assertEquals(3.75, figure.getArea(), 0.001);
    }

    @Test
    public void testCalculationOfTheTrianglePerimeter(){
        figure = new Triangle(1.5, 2.5, 3.5);
        assertEquals(7.5, figure.getPerimeter(), 0.001);
    }

    @Test
    public void testCalculationOfTheTriangleArea(){
        figure = new Triangle(1.5, 2.5, 3.5);
        assertEquals(1.624, figure.getArea(), 0.001);
    }


}
