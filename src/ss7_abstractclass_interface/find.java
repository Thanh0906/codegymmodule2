package ss7_abstractclass_interface;

import java.util.Arrays;
import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        String chuoi;
        int soLan=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào một chuỗi");
        chuoi=scanner.nextLine();
        char mangKiTu[]=chuoi.toCharArray();
        for ( int i =0;i<mangKiTu.length;i++){
            for (int j = i+1;j<mangKiTu.length-1;j++){
                if (mangKiTu[i] == mangKiTu[j]){
                    soLan++;
                }
            }
        }
        System.out.println(Arrays.toString(mangKiTu));
        System.out.println(soLan);

    }
}
