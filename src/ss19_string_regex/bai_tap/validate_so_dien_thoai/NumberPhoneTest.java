package ss19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhoneTest {
   private static NumberPhone numberPhone;

    public static void main(String[] args) {
        numberPhone= new NumberPhone();
        System.out.println("Nhập số điện thoại: ");
        Scanner input = new Scanner(System.in);
        String numberPhone = input.nextLine();
        boolean isvalid = NumberPhoneTest.numberPhone.validateNumberPhone(numberPhone);
        if (isvalid) {
            System.out.println("số điện thoại hợp lê !");
        } else {
            System.out.println("số điện thoại không hợp lệ!");
        }
    }
}
