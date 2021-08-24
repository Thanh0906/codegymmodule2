package ss7_abstractclass_interface.thuchanh.trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
