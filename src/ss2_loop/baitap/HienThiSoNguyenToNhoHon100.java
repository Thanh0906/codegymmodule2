package ss2_loop.baitap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Bạn muốn hiển thị số nguyên tố nhỏ hơn bao nhiêu? ");
       // int number = Integer.parseInt(scanner.nextLine());
        int N = 2;
        while (N <= 100) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
            }
            N++;
        }
    }
}