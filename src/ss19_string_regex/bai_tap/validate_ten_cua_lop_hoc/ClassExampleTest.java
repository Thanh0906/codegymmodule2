package ss19_string_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.Scanner;

public class ClassExampleTest {
    private static ClassExample classExample;

    public static void main(String[] args) {
        classExample = new ClassExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp :");
        String nameClass = scanner.nextLine();
        boolean isvalid = classExample.validateClass(nameClass);
        if (isvalid) {
            System.out.println("Tên lớp  hợp lệ!");
        } else {
            System.out.println("Tên lớp không hợp vệ !");
        }

    }
}
