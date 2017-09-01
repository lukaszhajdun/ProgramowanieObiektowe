package MyPointAndMyCircle;

public class MyCircle {
    private MyPoint _center;
    private int _radius;

    public MyCircle(){
        _center = new MyPoint(0,0);
    }
    public MyCircle(int x, int y, int radius){
        _center = new MyPoint(x,y);

        _radius = radius;

    }

    public MyCircle(MyPoint center, int radius){
        _center = center;
        _radius = radius;

    }

    public int getRadius() {
        return _radius;
    }

    public void setRadius(int radius){
        _radius = radius;
    }

    public MyPoint getCenter(){
        return _center;
    }

    public void setCenter(MyPoint center){
        _center = center;
    }

    public int getCenterX(){


        return _center.getX();
    }

    public void setCenterX(int x){
        _center.setX(x);
    }




    public int getCenterY(){
        int _y =_center.getX();
        return _y;
    }

    public String toString(){
        return String.format("MyCircle[radius=%d, %d]",_radius, _center);
    }
}
