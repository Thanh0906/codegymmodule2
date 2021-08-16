package baitapthem;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int n;
        System.out.println("nhap vào số nguyên");
        Scanner scanner= new Scanner(System.in);
        n=scanner.nextInt();
        if (n>0)
            System.out.println("đây là số nguyên dương");
        else if (n<0)
            System.out.println("đây là số nguyên âm");
        else {
            System.out.println("đây là số 0");
        }
    }
}
