package ss7_abstractclass_interface.thuchanh.trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Comparator;

public class CircleComparator implements Comparator<Cricle> {
    @Override
    public int compare(Cricle c1, Cricle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
    }



