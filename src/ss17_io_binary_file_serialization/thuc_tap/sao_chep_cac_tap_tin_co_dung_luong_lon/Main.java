package ss17_io_binary_file_serialization.thuc_tap.sao_chep_cac_tap_tin_co_dung_luong_lon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class   Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nhập đường truyền vào:");
        String sourcePath = in.nextLine();
        //src\ss17_io_binary_file_serialization\thuc_tap\sao_chep_cac_tap_tin_co_dung_luong_lon\copy.txt
        System.out.println("nhập đường ra:");
        String destPath = in.nextLine();
        //src\ss17_io_binary_file_serialization\thuc_tap\sao_chep_cac_tap_tin_co_dung_luong_lon\text.txt

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7Files(sourceFile, destFile);

            System.out.println("Copy completed");
        } catch (IOException ioe) {
            System.out.println("Can't copy that file");
            System.out.println(ioe.getMessage());
        }
    }
}
