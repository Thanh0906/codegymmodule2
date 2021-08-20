package ss3_mangvaphuongthuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập chiều dài mảng");
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Hãy nhập phần tử có index là " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa tạo là: " + Arrays.toString(array));
        System.out.println("nhập phân từ mà bạn muốn xóa");
        int X = Integer.parseInt(scanner.nextLine());
        boolean check = true;
         int n = 0;
        for (int j = 0; j < array.length; j++) {
            if (X == array[j]) {
                n = j;
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Phần tử cần xóa không có trong mảng này!!!");
        } else {
            for (int i = n; i < array.length - 1; i++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = 0;
            System.out.print("Mảng mới sau khi xóa là: " + Arrays.toString(array));
        }
    }
}
