package ss1_java.bai_tap;

import java.util.Scanner;

public class DemSo {
    public static String hangdonvi(int number) {
        String str = "";
        switch (number) {
            case 0:
                str = "không";
                break;
            case 1:
                str = "một";
                break;
            case 2:
                str = "hai";
                break;
            case 3:
                str = "ba";
                break;
            case 4:
                str = "bốn";
                break;
            case 5:
                str = "năm";
                break;
            case 6:
                str = "sáu";
                break;
            case 7:
                str = "bảy";
                break;
            case 8:
                str = "tám";
                break;
            case 9:
                str = "chín";
                break;
        }
        return str;
    }
    public static String hangchuc(int number) {
        int num = number / 10;
        int num1 = number % 10;
       String str = " ";
        switch (num) {
            case 1:
                switch (num1) {
                    case 0:
                        str = "mười";
                        break;
                    case 1:
                        str = "mười một ";
                        break;
                    case 2:
                        str = "mười hai";
                        break;
                    case 3:
                        str = "mười ba";
                        break;
                    case 4:
                        str = "mười bốn";
                        break;
                    case 5:
                        str = "mười lăm";
                        break;
                    case 6:
                        str = "mười sáu";
                        break;
                    case 7:
                        str = "mười bảy";
                        break;
                    case 8:
                        str = "mười tám";
                        break;
                    case 9:
                        str = "mười chín";
                        break;
                }
                break;
            case 2:
                str = "hai mươi" + hangdonvi(num1);
                break;
            case 3:
                str = "ba mươi" + " " + hangdonvi(num1);
                break;
            case 4:
                str = "bốn mươi" + " " + hangdonvi(num1);
                break;
            case 5:
                str = "năm mươi" + " " + hangdonvi(num1);
                break;
            case 6:
                str = "sáu mươi" + " " + hangdonvi(num1);
                break;
            case 7:
                str = "bảy mươi" + " " + hangdonvi(num1);
                break;
            case 8:
                str = "tám mươi" + " " + hangdonvi(num1);
                break;
            case 9:
                str = "chín mươi" + " " + hangdonvi(num1);
                break;
        }
        return str;
    }
    public static String hangtram(int number) {
        int num = number / 100;
        int num1 = number % 100;
        String str="";
        if (num1 == 0 && num > 0) {
            str = hangdonvi(num) + " trăm ";
        }
        else if (num1 >= 0 && num1 <= 9 && num > 0) {
            str = hangdonvi(num) + " trăm không " + hangdonvi(num1);
        } else {
            str = hangdonvi(num) + " trăm  " + hangchuc(num1);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số 1 số ");
        int so = scanner.nextInt();
        if (so < 0) {
            System.out.println("hãy nhập lại 1 số");
        } else if (so <= 9) {
            System.out.println(hangdonvi(so));
        } else if (so <= 99) {
            System.out.println(hangchuc(so));
        } else if (so <= 999) {
            System.out.println(hangtram(so));
        }else {
            System.out.println("chương trình chưa thể đếm được số lớn hơn 1000");
        }
    }

}
