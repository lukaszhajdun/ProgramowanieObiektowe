package CircleAndCylinder;

public class Cylinder extends Circle {

    private double _height = 1.0;

    public Cylinder() {
        super();
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){
        super(radius);
        _height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        double _height = height;
    }
    public double getHeight(){
        return _height;
    }
    public void setHeight(double height){
        _height = height;
    }
    public double getVolume(){
        return super.getArea()*_height;
    }

}
