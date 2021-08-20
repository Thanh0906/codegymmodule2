package ss6_inheritance.baitap.lopcirclevalopcylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle();
        circle1.setColor("đỏ");
        circle1.setRadius(20);
        System.out.println(circle1);
    }
}
