package Circle;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    //Testowanie metod domyślnego konstruktora
    @Test
    public void circleDefaultGetRadiusTest(){
        Circle circle = new Circle();
        Assert.assertEquals(1.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleDefaultSetRadiusTest(){
        Circle circle = new Circle();
        circle.setRadius(3.0);
        Assert.assertEquals(3.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleDefaultGetColorTest(){
        Circle circle = new Circle();
        Assert.assertEquals("red", circle.getColor());
    }

    @Test
    public void circleDefaultSetColorTest(){
        Circle circle = new Circle();
        circle.setColor("yellow");
        Assert.assertEquals("yellow", circle.getColor());
    }

    @Test
    public void circleDefaultAreaTest(){
        Circle circle = new Circle();
        Assert.assertEquals(3.14, circle.getArea(), 0.01);
    }

    public void circleRadiusStingTest(){
        Circle circle = new Circle();
        Assert.assertEquals("Circle.Circle[radius=1,000000,color=red]", circle.toString());
    }

    //Testowanie konstruktora z argumentem promień
    @Test
    public void circleRadius2GetRadiusTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(2.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius2SetRadiusTest(){
        Circle circle = new Circle(2.0);
        circle.setRadius(3.0);
        Assert.assertEquals(3.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius2GetColorTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals("red", circle.getColor());
    }

    @Test
    public void circleRadius2SetColorTest(){
        Circle circle = new Circle(2.0);
        circle.setColor("yellow");
        Assert.assertEquals("yellow", circle.getColor());
    }

    @Test
    public void circleRadius2GetAreaTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(12.56, circle.getArea(), 0.01);
    }

    @Test
    public void circleRadius2StingTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals("Circle.Circle[radius=2,000000,color=red]", circle.toString());
    }

    //Testowanie konstruktora z argumentem promień i kolor
    @Test
    public void circleRadius3ColorGreenGetRadiusTest(){
        Circle circle = new Circle(3.0, "green");
        Assert.assertEquals(3.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius3ColorGreenSetRadiusTest(){
        Circle circle = new Circle(3.0, "green");
        circle.setRadius(4.0);
        Assert.assertEquals(4.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius3ColorGreenGetColorTest(){
        Circle circle = new Circle(3.0, "green");
        Assert.assertEquals("green", circle.getColor());
    }

    @Test
    public void circleRadius3ColorGreenSetColorTest(){
        Circle circle = new Circle(3.0, "green");
        circle.setColor("yellow");
        Assert.assertEquals("yellow", circle.getColor());
    }

    @Test
    public void circleRadius3ColorGreenGetAreaTest(){
        Circle circle = new Circle(3.0);
        Assert.assertEquals(28.27, circle.getArea(), 0.01);
    }

    @Test
    public void circleRadius3ColorGreenStingTest(){
        Circle circle = new Circle(3.0, "green");
        Assert.assertEquals("Circle.Circle[radius=3,000000,color=green]", circle.toString());
    }
}
