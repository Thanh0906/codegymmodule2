package ss7_abstractclass_interface.thuchanh.trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Arrays;
import java.util.Comparator;

public class TestRectangleComparator {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle(3.0, 1.8);
        rectangles[1] = new Rectangle(2.9, 2.1, "red", false);
        rectangles[2] = new Rectangle();
        rectangles[3] = new Rectangle(4.4, 3.1);

        System.out.println("Pre-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        Comparator rectangleComparator = new RectangleComparator() {
            @Override
            public int compare(CircleComparator o1, CircleComparator o2) {
                return 0;
            }
        };
        Arrays.sort(rectangles, rectangleComparator);
        System.out.println("After-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
