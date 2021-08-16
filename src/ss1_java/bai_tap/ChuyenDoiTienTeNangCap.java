package ss1_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTeNangCap {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("MeNu:");
            System.out.println("1. Chuyển đổi USD->VND");
            System.out.println("2. Chuyển đôi VND->USD");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    int rate = 23000;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhập vào số VND bạn cần chuyển: ");
                    double VND = Double.parseDouble(sc.nextLine());
                    System.out.println("Số USD bạn nhận được là : " + VND/rate);
                    break;
                case 2:
                    int rate1 = 23000;
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Nhập vào số USD bạn cần chuyển: ");
                    double USD = Double.parseDouble(sc1.nextLine());
                    System.out.println("Số VNĐ bạn nhận được là : " + USD * rate1);
                    break;
                default:
                    System.out.println("Bạn nhập sai rồi !");
            }
        }
    }
}
