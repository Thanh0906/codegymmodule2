package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_bang_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInteger {
    public static void reverseInteger() {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackInt = new Stack<>();
        System.out.print("Hãy nhập size của mảng: ");
        int sizeArray = Integer.parseInt(scanner.nextLine());
        int[] arrayInteger = new int[sizeArray];
        for (int i = 0; i < arrayInteger.length; i++) {
            System.out.print("Hãy nhập phần tử có index = " + i + " : ");
            arrayInteger[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < arrayInteger.length; i++) {
            stackInt.push(arrayInteger[i]);
        }
        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = stackInt.pop();
        }
        System.out.println( Arrays.toString(arrayInteger));

    }

}
