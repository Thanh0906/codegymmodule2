package bai1_tap_them.bai_tap;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        float a, b, c;
        System.out.println("nhập vào 3 số");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a)
            System.out.println("đây là 3 cạnh của tam giác vuông");
        else {
            System.out.println("đây khong pahri 3 cạnh cảu tam giác vuông");
        }

    }
}
