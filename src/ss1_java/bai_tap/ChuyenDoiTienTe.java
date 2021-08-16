package ss1_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double VND =23000;
        double USD;
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào số USD:");
        USD = scanner.nextDouble();
        double rate = USD*VND;
        System.out.println("giá trị quy đổi là" +rate);
    }
}
