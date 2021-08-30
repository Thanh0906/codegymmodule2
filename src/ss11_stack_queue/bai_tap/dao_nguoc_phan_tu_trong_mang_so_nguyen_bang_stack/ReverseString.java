package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_bang_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void stackStrings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập 1 câu: ");
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            str.append(stack.pop());

        }
        System.out.println(str.toString());
    }
}
