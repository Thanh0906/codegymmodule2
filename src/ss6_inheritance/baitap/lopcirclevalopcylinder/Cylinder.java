package ss6_inheritance.baitap.lopcirclevalopcylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getSquare(){
        return this.height*this.getRadius()*this.getRadius()*Math.PI;
    }
    public String toString(){
        return " Hình trụ có chiều cao = "+height+" "
                + super.toString() + " "
                +"Thể tích = "+getSquare();
    }
}
