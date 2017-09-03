package Moveable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveablePointTest {
    MoveablePoint pointMove = new MoveablePoint(1,2,3,4);
    @Test
    public void defalutXYPointPositionTest(){
        Assert.assertEquals(1, pointMove.x);
        Assert.assertEquals(2, pointMove.y);
    }

    @Test
    public void moveUpTest(){
        pointMove.moveUp();
        Assert.assertEquals(4,pointMove.y);
    }

    @Test
    public void moveDownTest(){
        pointMove.moveDown();
        Assert.assertEquals(-4,pointMove.y);
    }

    @Test
    public void moveLeftTest(){
        pointMove.moveLeft();
        Assert.assertEquals(-3,pointMove.x);
    }

    @Test
    public void moveRightTest(){
        pointMove.moveRight();
        Assert.assertEquals(3,pointMove.x);
    }

    @Test
    public void DefaultPointToStringTest(){
        Assert.assertEquals("(1,2)", pointMove.toString());
    }

    @Test
    public void MovePointToStringTest(){
        pointMove.moveLeft();
        pointMove.moveUp();
        Assert.assertEquals("(-3,4)", pointMove.toString());
    }

}