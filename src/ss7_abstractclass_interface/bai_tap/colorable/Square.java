package ss7_abstractclass_interface.bai_tap.colorable;

public class Square extends Rantange implements Colorable {
    public Square() {

    }
    public Square(boolean b, int i) {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    private void setHeight(double side) {
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
