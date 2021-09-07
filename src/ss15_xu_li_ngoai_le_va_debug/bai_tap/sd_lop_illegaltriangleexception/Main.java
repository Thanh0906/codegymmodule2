package ss15_xu_li_ngoai_le_va_debug.bai_tap.sd_lop_illegaltriangleexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập canh a");
        int a =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập canh b");
        int b =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập canh c");
        int c=Integer.parseInt(scanner.nextLine());
        try {
            new Triangle(a,b,c);
            System.out.println("đây là 3 cạnh của 1 tam giác");
        }
        catch (IllegalRightTriangleException e){
            System.out.println(e.getMessage());

        }

    }
}
