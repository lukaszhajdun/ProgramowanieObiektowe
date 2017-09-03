package CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {
    Cylinder cylinder = new Cylinder(2.0);

    @Test
    public void getHeightTest(){
        Assert.assertEquals(1.0, cylinder.getHeight(),0.1);
    }

    @Test
    public void setHeightTest(){
        cylinder.setHeight(3.0);
        Assert.assertEquals(3.0, cylinder.getHeight(),0.1);
    }

    @Test
    public void getVolumeTest(){
        Assert.assertEquals(12.56, cylinder.getVolume(), 0.1);
    }

    @Test
    public void getRadiusTest(){
        Assert.assertEquals(2.0, cylinder.getRadius(), 0.1);
    }

    @Test
    public void setRadiusTest(){
        cylinder.setRadius(1.0);
        Assert.assertEquals(1.0, cylinder.getRadius(), 0.1);
    }

    @Test
    public void getColorTest(){
        cylinder.getColor();
        Assert.assertEquals("red", cylinder.getColor());
    }

    @Test
    public void setColorTest(){
        cylinder.setColor("green");
        Assert.assertEquals("green", cylinder.getColor());
    }

    @Test
    public void getAreaTest(){
        Assert.assertEquals(12.56, cylinder.getArea(),0.1);
    }

    @Test
    public void toStringTest(){
        Assert.assertEquals("Cylinder[radius=2,00,color=red,height=1,00]"
                , cylinder.toString());
    }

}