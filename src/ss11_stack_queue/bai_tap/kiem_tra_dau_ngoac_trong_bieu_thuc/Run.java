package ss11_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_bieu_thuc;

public class Run {
    public static void main(String[] args) {
        Bracketcheck bracketcheck = new Bracketcheck();
      if (bracketcheck.check()){
          System.out.println("well");
      }
      else {
          System.out.println("???");
      }
    }
}
