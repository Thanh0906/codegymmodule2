package ss19_string_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    public ClassExample() {
    }

    private static final String CLASS_REGEX = "^[A-Z]+[0-9]{4,}+[G-M]$";

    public boolean validateClass(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
