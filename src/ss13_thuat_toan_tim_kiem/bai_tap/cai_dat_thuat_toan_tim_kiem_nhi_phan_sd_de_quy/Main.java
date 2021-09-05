package ss13_thuat_toan_tim_kiem.bai_tap.cai_dat_thuat_toan_tim_kiem_nhi_phan_sd_de_quy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập kích thước của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array= new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử ở vị trí index: " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng sau khi tạo: " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
        System.out.println("Hãy nhập số cần tìm: ");
        int numberToSearch = Integer.parseInt(scanner.nextLine());
        int result = binarySearch(array, 0, array.length - 1, numberToSearch);
        if (result == -1) {
            System.out.print("Không tìm thấy " + numberToSearch + " ở trong mảng.");
        } else {
            System.out.print("Số " + numberToSearch + " ở vị trí index : " + result);
        }
    }
    public static int binarySearch (int[] array, int left, int right, int value) {
        if (left < 0 || right > array.length) {
            return -1;
        }
        if (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                return binarySearch(array, middle +1,right, value);
            } else {
                binarySearch(array, left, middle + 1, value);
            }
        }
        return -1;
    }

}
