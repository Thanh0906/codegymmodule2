package ss11_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_sd_queue;

public class Run {
    public static void main(String[] args) {

          Palindrome palindromeCheck = new Palindrome();

            if (palindromeCheck.check()) {
                System.out.print("đây là dãy palindrome");
            } else {
                System.out.print("đây không phải dãy palindrome");
            }
    }
}
