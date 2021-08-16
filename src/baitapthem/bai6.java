package baitapthem;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("nhập vào số nguyên dương");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++)
            if (i % 2 == 0)
                sum += i;
            System.out.println(sum);
    }
}
