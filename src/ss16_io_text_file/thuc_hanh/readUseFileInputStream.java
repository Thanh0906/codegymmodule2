package ss16_io_text_file.thuc_hanh;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class readUseFileInputStream {
    public static void main(String[] args) throws Exception{
        InputStream inputStream=new FileInputStream("src\\ss16_io_text_file\\thuc_hanh\\Text.txt");

        int i = -1;
        while ((i=inputStream.read())!=-1){
            System.out.println((char)i);
        }
        inputStream.close();

    }
}
