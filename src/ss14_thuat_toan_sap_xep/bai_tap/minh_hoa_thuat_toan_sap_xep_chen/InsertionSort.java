package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập kích thước của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        System.out.println("Hãy nhập "+size +" vị trí: " );
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng mà bạn đã nhập là: " + Arrays.toString(array));
        insertionSortByStep(array);

    }
    public static void insertionSortByStep (int[] array) {
        int index;
        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            index = i;
            while (index > 0 && temp < array[index - 1]) {
                array[index] = array[index - 1];
                index--;
            }
            array[index] = temp;
            System.out.print("Mảng sau khi chèn lần '" + i + "': ");
            System.out.println(Arrays.toString(array));
        }
    }
}
