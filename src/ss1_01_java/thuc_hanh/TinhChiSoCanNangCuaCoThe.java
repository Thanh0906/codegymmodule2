package ss1_01_java.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("nhập vào số kg của bạn :");
        weight =scanner.nextDouble();
        System.out.println("nhập vào chiều cao của bạn:");
        height =scanner.nextDouble();
        bmi=weight/Math.pow(height,2);
        if (bmi < 18)
            System.out.println("Underweight");
        else if (bmi < 25.0)
            System.out.println( "Normal");
        else if (bmi < 30.0)
            System.out.println( "Overweight");
        else
            System.out.println("Obese");
    }
}
