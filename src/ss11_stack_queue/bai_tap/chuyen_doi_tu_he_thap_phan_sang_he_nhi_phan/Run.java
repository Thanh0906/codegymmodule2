package ss11_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        System.out.println("nhập vào dãy số");
        int inputNum = Integer.parseInt(scanner.nextLine());
        System.out.print("hệ nhị phân của dãy số là");
        decimalToBinary.convertBinary(inputNum);


    }
}
