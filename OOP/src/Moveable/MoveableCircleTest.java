package Moveable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveableCircleTest {

    MoveableCircle circle = new MoveableCircle(1,2,3,4,8);

    @Test
    public void defaultCircleToString(){
        Assert.assertEquals("Circle[radius=8, center=(1,2)]", circle.toString());
    }

    @Test
    public void moveUp(){
        circle.moveUp();
        Assert.assertEquals("Circle[radius=8, center=(1,4)]", circle.toString());
    }

    @Test
    public void moveDown(){
        circle.moveDown();
        Assert.assertEquals("Circle[radius=8, center=(1,-4)]", circle.toString());
    }

    @Test
    public void moveLeft(){
        circle.moveLeft();
        Assert.assertEquals("Circle[radius=8, center=(-3,2)]", circle.toString());
    }

    @Test
    public void moveRight(){
        circle.moveRight();
        Assert.assertEquals("Circle[radius=8, center=(3,2)]", circle.toString());
    }

}