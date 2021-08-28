package bai1_tap_them;

import java.util.Scanner;

public class gamedoanso {
    public static void main(String[] args) {
        final int Maxnumber=100;
        final int Minnumber=1;
        int range =(Maxnumber-Minnumber) +1;
        int random = (int) (Math.random()*range)+Minnumber;
        Scanner scanner = new Scanner(System.in);
        int yournumber=0;
        while (random!=yournumber){
            System.out.println("số của bạn từ 1-100");
            yournumber =scanner.nextInt();
            if (yournumber>random){
                System.out.println("số bạn chọn đã lớn hơn số bí mật");
            } else if (yournumber<random){
                System.out.println("số bạn chọn nhỏ hơn số bí mật");
            }else {
                System.out.println("chúc mừng bạn đã chọn đúng");
            }
        }
    }
}
