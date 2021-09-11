package ss17_io_binary_file_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void copyFileBinary (String sourcePath, String targetPath) {
        try {
            File file = new File(sourcePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            InputStream inputStream = new FileInputStream(file);
            OutputStream outputStream    = new FileOutputStream(targetPath);
            int readEverByte;
            while ((readEverByte = inputStream.read()) != -1) {
                outputStream.write(readEverByte);
            }
            inputStream.close();
            outputStream.close();
        } catch (Exception e) {
            System.err.println("Tệp nguồn không tồn tại hoặc tập tin đích đã tồn tại. ");
        }
    }
}
