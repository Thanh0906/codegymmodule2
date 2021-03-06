package ss7_abstractclass_interface.bai_tap.resizeable;

public class Ractange extends Shape implements Resizeable{
    private double width;
    private double height;
    public Ractange() {
        this(1.0, 1.0);
    }
    public Ractange(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Ractange(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth () {
        return this.width;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight (double height) {
        this.height = height;
    }
    public double getArea () {
        return this.width * this.height;
    }
    public double getPerimeter () {
        return 2 * (this.width + this.height);
    }
    @Override
    public String toString () {

        return "A Rectangle with width = " + getWidth() + " and height = " + getHeight() + ", which is a subclass of " + super.toString();
    }
    @Override
    public void resize(double percent) {
        this.setWidth(this.getWidth() * Math.sqrt(1 + percent / 100));
        this.setHeight((this.getWidth()*Math.sqrt(1 + percent/100)*this.getHeight()/this.getWidth()));
}
}
