package ss2_loop.thuchanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("nhập vào số a");
        a = input.nextInt();
        a = Math.abs(a);
        System.out.println("nhập vào số b");
        b = input.nextInt();
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("không có ước chung");
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("ước chung lớn nhất :" + a);
    }
}
