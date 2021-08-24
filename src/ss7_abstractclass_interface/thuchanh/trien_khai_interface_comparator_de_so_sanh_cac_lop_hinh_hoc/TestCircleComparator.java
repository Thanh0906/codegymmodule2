package ss7_abstractclass_interface.thuchanh.trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Arrays;
import java.util.Comparator;

public class TestCircleComparator {
    public static void main(String[] args) {
       Cricle[] circles = new Cricle[3];
        circles[0] = new Cricle(3.6);
        circles[1] = new Cricle();
        circles[2] = new Cricle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Cricle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Cricle circle : circles) {
            System.out.println(circle);
        }
    }
}
