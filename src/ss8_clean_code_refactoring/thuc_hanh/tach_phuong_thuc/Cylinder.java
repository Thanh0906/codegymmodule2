package ss8_clean_code_refactoring.thuc_hanh.tach_phuong_thuc;

import java.util.Scanner;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius, 2, Math.PI);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius, double i, double pi) {
        return i * pi * radius;
    }

    private static double getBaseArea(int radius) {
        return getPerimeter(radius, Math.PI, radius);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập bán kính hình tròn của hình trụ: ");
        int radius = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập chiều cao của hình trụ: ");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println("Thể tích của hình trụ là: " + getVolume(radius, height));
    }
}
