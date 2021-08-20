package ss3_mangvaphuongthuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class NoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài của mảng 1");
        int size1 = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[size1];
        for (int i= 0;i<array1.length;i++){
            System.out.println("nhập phần tử mảng 1 tại vị trí :" +i);
            array1[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("nhập chiều dài của mảng 2");
        int size2 = Integer.parseInt(scanner.nextLine());
        int[] array2 =new int[size2];
        for (int j =0;j<array2.length;j++){
            System.out.println("nhập phần tử tại vị trí :" +j);
            array2[j]=Integer.parseInt(scanner.nextLine());

        }
        System.out.println("mảng 1 là" + Arrays.toString(array1));
        System.out.println("mảng 2 là" + Arrays.toString(array2));
      int length = array1.length + array2.length;
      int[] array3 = new int[length];
      int temp=0;
      for (int element:array1){
          array3[temp]=element;
          temp++;
      }
      for (int element :array2){
          array3[temp]=element;
          temp++;
      }
    //  for (int i=0;i<array1.length;i++){
      //    array3[i]=array1[i];
     // }
     // for (int j=0;j<array2.length;j++){
     //     array3[array1.length-1]=array2[j];
     // }
      System.out.println("mảng sau khi nối là" +Arrays.toString(array3));
    }

}
