package ss1_01_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("a :");
        double a =scanner.nextDouble();
        System.out.println("b :");
        double b =scanner.nextDouble();
        if (a != 0) {
            double answer = -b / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }

        }
    }
}
