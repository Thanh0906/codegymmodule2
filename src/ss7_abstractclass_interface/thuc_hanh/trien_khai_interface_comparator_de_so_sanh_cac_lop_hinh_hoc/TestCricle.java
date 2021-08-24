package ss7_abstractclass_interface.thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;

public class TestCricle {
    public static void main(String[] args) {
       Cricle circle = new Cricle();
        System.out.println(circle);

        circle = new Cricle(3.5);
        System.out.println(circle);

        circle = new Cricle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
