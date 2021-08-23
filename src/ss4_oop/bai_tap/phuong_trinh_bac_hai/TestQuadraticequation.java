package ss4_oop.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class TestQuadraticequation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số c");
        double c = Double.parseDouble(scanner.nextLine());
        Quadraticequation quadraticequation = new Quadraticequation(a, b, c);
        quadraticequation.getRoot();

    }
}
