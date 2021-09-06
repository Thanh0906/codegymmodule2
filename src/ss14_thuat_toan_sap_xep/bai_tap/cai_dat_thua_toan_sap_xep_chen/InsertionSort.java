package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thua_toan_sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertSort(int[] list) {
        int index;
        int temp;
        for (int i = 1; i < list.length; i++) {
            index = list[i];
            temp = i - 1;
            while (temp >= 0 && list[temp] > index) {
                list[temp + 1] = list[temp];
                temp = temp - 1;
            }
            list[temp + 1] = index;
        }
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //        System.out.println("nhập vào chiều dài của mảng");
        //        int sezi = Integer.parseInt(scanner.nextLine());
        //        int[] list = new int[sezi];
        //        System.out.println("Hãy nhập " + sezi + " vị trí: ");
        //        for (int i = 0; i < sezi; i++) {
        //            list[i] = Integer.parseInt(scanner.nextLine());
        //        }
           int[] list = {6,5,10,-6,8,9,-3,9,12,15};
        System.out.println("mảng trước khi sắp xếp là :");
        System.out.println(Arrays.toString(list));
        insertSort(list);
        System.out.println("Mảng sau khi sắp xếp là :");
        System.out.println(Arrays.toString(list));

    }
}
