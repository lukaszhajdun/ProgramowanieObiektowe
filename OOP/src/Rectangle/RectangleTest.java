package Rectangle;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    Rectangle rectangle = new Rectangle(4.5f, 3.5f);

    @Test
    public void getLengthTest(){
        rectangle.getLength();
        Assert.assertEquals(4.5f, rectangle.getLength(), 0.1);
    }

    @Test
    public void setLengthTest(){
        rectangle.setLength(2f);
        Assert.assertEquals(2f, rectangle.getLength(), 0.1);
    }

    @Test
    public void getWidthTest(){
        rectangle.getWidth();
        Assert.assertEquals(3.5f, rectangle.getWidth(), 0.1);
    }

    @Test
    public void setWidthTest(){
        rectangle.setWidth(8.5f);
        Assert.assertEquals(8.5f, rectangle.getWidth(), 0.1);
    }

    @Test
    public void getAreaTest(){
        Assert.assertEquals(15.75f,rectangle.getArea(),0.1);
    }

    @Test
    public void toStringTest(){
        Assert.assertEquals("Rectangle[length=4,50,width=3,50]", rectangle.toString());
    }

}