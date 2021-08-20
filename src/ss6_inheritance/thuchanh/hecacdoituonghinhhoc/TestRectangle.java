package ss6_inheritance.thuchanh.hecacdoituonghinhhoc;

import ss6_inheritance.thuchanh.hecacdoituonghinhhoc.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
