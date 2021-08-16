package baitapthem;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n;
        System.out.println("nhập vào số ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("đây là số một");
                break;
            case 2:
                System.out.println("đây là số hai");
                break;
            case 3:
                System.out.println("đây là số ba");
                break;
            case 4:
                System.out.println("đây là số bốn");
                break;
            case 5:
                System.out.println("đây là số năm");
                break;
            case 6:
                System.out.println("đây là số sáu");
                break;
            case 7:
                System.out.println("đây là số bảy");
                break;
            case 8:
                System.out.println("đây là số tám");
                break;
            case 9:
                System.out.println("đây là số chín");
                break;
            default:
                System.out.println("chương trình chỉ nhận từ 1 đên 9");
                break;
        }
    }
}
