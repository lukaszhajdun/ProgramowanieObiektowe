package Moveable;

public class MoveableCircle implements IMoveable {

    private int _radius;
    private MoveablePoint _center;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        _center = new MoveablePoint(x,y,xSpeed,ySpeed);


        _radius = radius;



    }



    @Override
    public void moveUp() {
        _center.moveUp();
    }

    @Override
    public void moveDown() {
        _center.moveDown();
    }

    @Override
    public void moveLeft() {
        _center.moveLeft();
    }

    @Override
    public void moveRight() {
        _center.moveRight();
    }
    public String toString(){

        return
                String.format("Circle[radius=%d, center=(%d,%d)]",_radius, _center.x, _center.y);
    }

}
