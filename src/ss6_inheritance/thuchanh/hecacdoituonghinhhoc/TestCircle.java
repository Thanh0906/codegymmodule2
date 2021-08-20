package ss6_inheritance.thuchanh.hecacdoituonghinhhoc;

import ss6_inheritance.thuchanh.hecacdoituonghinhhoc.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
