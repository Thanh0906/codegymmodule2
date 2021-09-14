package jame_mo_rong_ngay_13_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {
    public Name(){}
    //"^([A-Z]+[a-z\\s]*){2,}$"
    //"^([A-Z]{1}+[A-Z_a-z]\\*){1,1}+(\\s+([A-Z]+[A-Z_a-z]\\*)\\s)?+([A-Z]+[A-Z_a-z]\\*){1,1}+$";
    private static final String NAME_REGEX ="^([A-Z]+[a-z\\s]*){2,}$";
    public boolean validateName(String regex) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
