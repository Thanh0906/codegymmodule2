package ss8_clean_code_refactoring.thuc_hanh.tach_phuong_thuc;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập bán kính hình tròn của hình trụ: ");
        int radius = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập chiều cao của hình trụ: ");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println("Thể tích của hình trụ là: " +Cylinder.getVolume(radius,height));
    }


}
