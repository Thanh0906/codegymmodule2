package ss17_io_binary_file_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.util.Scanner;


public class Main {
    private static void copyFileUsingStream(File source, File target) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(target);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } catch (Exception e){
            System.err.println("Tệp nguồn không tồn tại hoặc tập tin đích đã tồn tại. ");
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập đường truyền vào");//src\ss17_io_binary_file_serialization\bai_tap\copy_file_nhi_phan\source.txt
        String  source = scanner.nextLine();
        System.out.println("nhập đường ra");//src\ss17_io_binary_file_serialization\bai_tap\copy_file_nhi_phan\target.txt
        String target = scanner.nextLine();
        File sourceFile = new File(source);
        File targetFile = new File(target);
        try{
            copyFileUsingStream(sourceFile,targetFile);
            System.out.println("copy thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
