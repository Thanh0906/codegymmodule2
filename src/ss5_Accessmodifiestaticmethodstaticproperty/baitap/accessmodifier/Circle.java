package ss5_Accessmodifiestaticmethodstaticproperty.baitap.accessmodifier;

public class Circle {
    private double radius=1.0;
    private  String color="red";
    Circle(){
    }
    Circle(double radius){
        this.radius=radius;
    }
    public String getColor() {
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
