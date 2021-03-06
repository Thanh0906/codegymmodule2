package ss19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    public NumberPhone() {
    }

    private static final String PHONENUMBER_REGEX = "^[\\(]+\\d{2,}+[\\)\\-\\(]+\\d{10}+[\\)]$";
    //
    public boolean validateNumberPhone(String regex) {
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
