package Moveable;

public class MoveablePoint implements IMoveable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    @Override
    public void moveUp() {
        y = ySpeed;
    }

    @Override
    public void moveDown() {
        y = -ySpeed;
    }

    @Override
    public void moveLeft() {
        x = -xSpeed;
    }

    @Override
    public void moveRight() {
        x = xSpeed;
    }

    public String toString(){
        return String.format("(%d,%d)", x, y);
    }
}
