package ss2_loop.thuchanh;

import java.util.Scanner;

public class checkinteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào số");
        int number = scanner.nextInt();
        if (number < 2)
            System.out.println("đây không phải là số nguyên tố");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " đay là    số nguyên tố");
            else
                System.out.println(number + " đây không phải là số nguyên tố");
        }
    }
}