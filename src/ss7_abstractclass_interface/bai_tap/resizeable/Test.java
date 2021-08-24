package ss7_abstractclass_interface.bai_tap.resizeable;

public class Test {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Cricle(x, "yellow", false);
        shapes[1] = new Rectangle(x, x, "infinity", true);
        shapes[2] = new Square(x, "melinda", true);
        for (Shape shape : shapes){
            System.out.println(shape);
        }

        for (Shape shape : shapes) {
            shape.resize(Math.random() * 1000);
        }
    }
}
