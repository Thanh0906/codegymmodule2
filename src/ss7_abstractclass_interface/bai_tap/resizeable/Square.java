package ss7_abstractclass_interface.bai_tap.resizeable;

public class Square extends Ractange implements Resizeable{
    private double side;
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide () {
        return getWidth();
    }
    public void setSide (double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public String toString () {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
    public void resize(double percent) {

        this.setSide(this.getSide() * Math.sqrt(1 + percent / 100));
    }
}
