package jame_mo_rong_ngay_13_9;

import java.util.Scanner;

public class MainName {
    private static Name name;
    public static void main(String[] args) {
        name= new Name();
        System.out.println("Nhập họ và tên: ");
        Scanner input = new Scanner(System.in);
        String iunputname= input.nextLine();
        boolean isvalid = MainName.name.validateName(iunputname);
        if (isvalid) {
            System.out.println("hợp lê !");
        } else {
            System.out.println(" không hợp lệ!");
        }
    }
}
