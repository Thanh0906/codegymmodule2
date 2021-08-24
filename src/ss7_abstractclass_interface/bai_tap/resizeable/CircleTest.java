package ss7_abstractclass_interface.bai_tap.resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Cricle circle = new Cricle();
        System.out.println(circle);

        circle = new Cricle(3.5);
        System.out.println(circle);

        circle = new Cricle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
