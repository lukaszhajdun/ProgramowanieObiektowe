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

        return getArea() * _height;
    }

    public String toString(){
        return String.format("Cylinder[radius=%.2f,color=%s,height=%.2f]"
                , super.getRadius(), super.getColor(), _height);
    }

}
