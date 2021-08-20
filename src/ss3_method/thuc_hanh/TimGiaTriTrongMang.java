package ss3_mangvaphuongthuc.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] Students = {"tuan","tu","thanh","phuoc","sang","tan","thien"};
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap ten hoc sinh:");
        String input_name =scanner.nextLine();
        boolean isExist = false;

        for (int i = 0; i < Students.length; i++) {
            if (Students[i].equals(input_name)) {
                System.out.println(input_name +" có trong danh sách và ở vị trí " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy " + input_name + " trong danh sách.");
        }


    }
}
