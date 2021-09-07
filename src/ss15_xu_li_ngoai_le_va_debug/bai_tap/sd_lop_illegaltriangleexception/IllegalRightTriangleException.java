package ss15_xu_li_ngoai_le_va_debug.bai_tap.sd_lop_illegaltriangleexception;

public class IllegalRightTriangleException extends  Exception {


    public IllegalRightTriangleException (String message) {
        super(message);
    }


    @Override
    public String getMessage() {
        return "Lỗi nhập sai giá trị của cạnh tam giác: " + super.getMessage();
    }
}
