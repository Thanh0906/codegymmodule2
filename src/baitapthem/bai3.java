package baitapthem;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        float a, b, c;
        System.out.println("nhập vào 3 số");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a + b > c || b + c > a || a + c > b)
            System.out.println("đây là 3 cạnh cảu 1 tam giác");
        else {
            System.out.println("đây không phải là 3 ccanhj của 1 tam giác");
        }
    }
}
