package ss3_mangvaphuongthuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class NhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập size của mnagr");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i =0;i<array.length;i++){
            System.out.println("nhập phần tử vào mảng tại vị trí"+i);
            array[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng vừa tạo là :" + Arrays.toString(array));
        int min = array[0];
        int index = 0;
        for (int j = 1; j<array.length;j++){
            if (array[j]<min){
                min=array[j];
                index = j;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là :" + min + " có vị trí là : " + index);
    }
}
