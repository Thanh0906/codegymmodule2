package ss16_io_text_file.thuc_hanh.tinh_tong_cac_so_trong_file_text;

import java.util.Scanner;

public class ReadFileText {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);

    }

}
