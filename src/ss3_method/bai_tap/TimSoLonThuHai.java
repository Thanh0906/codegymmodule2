package ss3_method.bai_tap;


import java.util.Scanner;

public class TimSoLonThuHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chiều dài của mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập phần tử của mảng tại vị trí " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int max = array[array.length - 2];
        System.out.println("Phần tử lớn thứ 2 trong mảng là: " + max);
    }

}
