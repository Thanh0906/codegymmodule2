package jame_mo_rong.ngay_6_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Thêm");
            System.out.println("2. Hiển thị");
            System.out.println("0. Exit");
            System.out.print("Hãy chọn từ menu: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    StudentManager.add();
                    break;
                case 2:
                    StudentManager.display();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lỗi Hãy nhập lại.");
            }
        } while (true);
    }
}

