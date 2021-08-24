package ss5_accessmodifi_estaticmethod_staticproperty.bai_tap.accessmodifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Diện tích hình tròn có bán kính = " + circle.getRadius() + " là: " + circle.getArea());
        Circle circle1 = new Circle();
        circle1.setRadius(10);
        System.out.println("Diện tích hình tròn có bán kính = " + circle1.getRadius() + " là: " + circle1.getArea());

    }
}
