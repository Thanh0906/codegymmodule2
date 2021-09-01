package bai1_tap_them.bai_tap;

import java.util.Scanner;

public class finmax {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào chiều dài của mảng");
        int input =Integer.parseInt(scanner.nextLine());
         int array[] = new int[input];
         for (int i = 0;i<array.length;i++){
             System.out.println("nhập vào phần tử của mảng ở vị tri" +i);
             array[i]=Integer.parseInt(scanner.nextLine());
         }
         int max= array[0];
         for (int i = 0;i<array.length;i++){
             if (max<array[i]){
                 max=array[i];
             }

         }
         System.out.println(max);
    }


}
