package ss7_abstractclass_interface.thuchanh.trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Comparator;

public abstract class RectangleComparator implements Comparator<CircleComparator> {
    public int compare (Rectangle r1, Rectangle r2) {
        if (r1.getPerimeter() > r2.getPerimeter()) {
            return 1;
        } else if (r1.getPerimeter() < r2.getPerimeter()) {
            return -1;
        } else {
            return 0;
        }
    }

}
