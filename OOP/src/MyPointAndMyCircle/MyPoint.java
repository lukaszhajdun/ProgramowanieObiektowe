package MyPointAndMyCircle;

public class MyPoint {
    private int _x = 0;
    private int _y = 0;

    public MyPoint(){

    }
    public MyPoint(int x, int y){
        _x = x;
        _y = y;
    }

    public int getX(){
        return _x;
    }
    public void setX(int x){
        _x = x;
    }

    public int getY(){
        return _y;
    }
    public void setY(int y){
        _y = y;
    }

    public int[] getXY(){
        return new int[] {_x,_y};
    }
    public void setXY(int x, int y){
        _x = x;
        _y = y;
    }

    public String toString(){
        return String.format("(%d,%d)", _x, _y);
    }


//DLACZEGO TAK????????????
    public double calDistance (int x,int y){
        double pX = Math.pow(x - this._x, 2);
        double pY = Math.pow(y - this._y, 2);
        return Math.sqrt(pX+pY);
    }

    public double distance (int x, int y){
        return calDistance(x,y);
    }
    public double distance(MyPoint another){
        return calDistance(another.getX(),
                another.getY());
    }
    public double distance(){
        return calDistance(0,0);
    }

}
