package ss11_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_bieu_thuc;


import java.util.Scanner;
import java.util.Stack;

public class Bracketcheck {
    private String myString;
    private String[] arrayString;

    public Bracketcheck() {
        this.setMyString();
        this.setArrayString();
    }

    private void setArrayString() {
        this.arrayString = this.myString.split("");
    }

    private void setMyString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào biểu thức chưa dấu ngoặc");
        myString = scanner.nextLine();
    }

    public boolean check() {
        String[] strings = this.arrayString;
        Stack<String> stack = new Stack<>();
        StringBuilder left = new StringBuilder();
        for (String element : strings) {
            if (element.equals("(")) {
                stack.push(element);
            } else if (element.equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    left.append(element);
                }
            }
        }
        return false;
    }

}
