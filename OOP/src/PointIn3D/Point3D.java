package PointIn3D;

public class Point3D extends Point2D {

    private float _z = 0.0f;

    public Point3D(float x, float y, float z){
        super(x,y);
        _z = z;
    }
    public Point3D(){

    }

    public float getZ(){
        return _z;
    }
    public void setZ(float z){
        _z = z;
    }

//    CZY TO PONIZEJ TAK MA BYC?????????????
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        _z = z;
    }
    public float[] getXYZ(){
       return new float[] {getX(),getY(),_z};
    }
    public String toString(){
        return String.format("(%f,%f,%f)", getX(), getY(),_z);
    }



}
