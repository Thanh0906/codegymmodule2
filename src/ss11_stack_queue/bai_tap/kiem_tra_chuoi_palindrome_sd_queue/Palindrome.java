package ss11_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_sd_queue;


import java.util.*;

public class Palindrome {
   private String myString;
   private String[] arraySting;

    public Palindrome() {
        this.setMyString();
        this.setArraySting();
    }

    private void setArraySting() {
        this.arraySting = this.myString.split("");
    }

    private void setMyString() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào 1 chuỗi");
        myString = scanner.nextLine();
    }


    public Stack<String> pushStrack(){
        Stack<String> myStack = new Stack<>();
        for (String element : this.arraySting){
            myStack.push(element);
        }
        return myStack;
    }
    public Queue<String> pushQueue (){
        Queue<String> myQueue =new LinkedList<>();
        for (String element :this.arraySting){
            myQueue.add(element);
        }
        return myQueue;
    }
    public boolean check(){
        Stack<String> stack =this.pushStrack();
        Queue<String> queue=this.pushQueue();
        boolean checks =true;
        for (int i =0;i<arraySting.length;i++){
            if (!(stack.pop().equals(queue.poll()))){
                checks =false;
            }
        }return true;
    }
}
