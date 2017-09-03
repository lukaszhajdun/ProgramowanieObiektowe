package CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    Circle defaultCircle = new Circle();
    @Test
    public void getDefaultRadiusTest(){
        Assert.assertEquals(1.0, defaultCircle.getRadius(),0.1);
    }

    @Test
    public void setRadiusTest(){
        defaultCircle.setRadius(3.1);
        Assert.assertEquals(3.1, defaultCircle.getRadius(),0.1);

    }

    @Test
    public void getColorTest(){
        Assert.assertEquals("red", defaultCircle.getColor());
    }

    @Test
    public void setColorTest(){
        defaultCircle.setColor("black");
        Assert.assertEquals("black", defaultCircle.getColor());
    }

    @Test
    public void getAreaTest(){
        Assert.assertEquals(3.14, defaultCircle.getArea(),0.1);

    }

    @Test
    public void toStringTest(){
        Assert.assertEquals("Circle.Circle[radius=1,00,color=red]", defaultCircle.toString());
    }

}