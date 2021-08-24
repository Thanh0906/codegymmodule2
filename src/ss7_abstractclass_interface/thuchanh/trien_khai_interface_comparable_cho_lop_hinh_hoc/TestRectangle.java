package ss7_abstractclass_interface.thuchanh.trien_khai_interface_comparable_cho_lop_hinh_hoc;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5, 8);
        System.out.println(rectangle);

        rectangle = new Rectangle(3, 7, "orange", true);
        System.out.println(rectangle);
    }
}
