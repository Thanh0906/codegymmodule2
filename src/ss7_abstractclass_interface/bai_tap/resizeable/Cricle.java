package ss7_abstractclass_interface.bai_tap.resizeable;

public class Cricle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Bán kính là"
                + getRadius()
                + ",Kế thừa của lớp cha "
                + super.toString();
    }
    public void resize(double percent) {
        this.setRadius(this.getRadius() * Math.sqrt(1 + percent / 100));
    }
}
