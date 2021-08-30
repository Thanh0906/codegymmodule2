package ss11_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public void  convertBinary(int number){
        Stack<Integer> stack =new Stack<Integer>();
        while (number!=0){
            int num =number%2;
            stack.push(num);
            number/=2;
        }
        while (!(stack.isEmpty())){
            System.out.print(stack.pop());
        }

    }


}
