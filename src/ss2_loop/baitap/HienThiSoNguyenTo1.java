package ss2_loop.baitap;

import java.util.Scanner;

public class HienThiSoNguyenTo1 {
    public static void main(String[] args) {
        //Scanner scanner =new Scanner(System.in);
        //System.out.println("Bạn muốn hiển thị bao nhiêu số nguyên tố");
       // int number = Integer.parseInt(scanner.nextLine());
        int cuont = 0;
        int N =2;
        while (cuont<20){
            int i=2;
            boolean  check= true;
            while (i<=Math.sqrt(N)){
                if (N%i==0){
                    check = false;
                    break;
                }i++;
            }
            if (check){
                System.out.println(N);
                cuont++;
            }
            N++;
        }

    }
}
