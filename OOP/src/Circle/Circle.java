package Circle;

import MyPointAndMyCircle.MyPoint;

public class Circle {
    private double _radius = 1.0;
    private String _color = "red";

    public Circle(){}

    public Circle(double radius){
        _radius = radius;
    }

    public Circle(double radius, String color){
        _radius = radius;
        _color = color;
    }

    public double getRadius() {
        return _radius;
    }

    public void setRadius(double radius){
        _radius = radius;
    }



    public String getColor(){
        return _color;
    }

    public void setColor(String color){
        _color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radius, 2d);
    }

    public String toString(){
        return String.format("Circle.Circle[radius=%f,color=%s]", _radius, _color);
    }
}
