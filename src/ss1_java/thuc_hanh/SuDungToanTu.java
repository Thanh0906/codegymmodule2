package ss1_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào chiều cao");
        width = scanner.nextFloat();
        System.out.println("nhập vào chiều rộng");
        height =scanner.nextFloat();
        float area = width*height;
        System.out.println("diện tích là" +area);
    }
}
