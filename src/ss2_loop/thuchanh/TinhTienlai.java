package ss2_loop.thuchanh;

import java.util.Scanner;

public class TinhTienlai {
    public static void main(String[] args) {
        double money;
        int month;
        double interset;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền ");
        money =input.nextDouble();
        System.out.println("nhập số tháng");
        month = input.nextInt();
        System.out.println("nhập lại suất");
        interset = input.nextDouble();
        double total_interset =0;
        for (int i = 0;i < month; i++){
            total_interset +=money*(interset/100)/12*month;
        }
        System.out.println("tiền bạn nhận được là"+total_interset);
    }
}
