package ss16_io_text_file.bai_tap.sao_chep_van_ban;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập đường truyền vào của tập tin");
        //src\ss16_io_text_file\bai_tap\sao_chep_van_ban\number.txt
        String inPath = scanner.nextLine();
        System.out.println("nhập đường truyền ra của tập tin");
        //src\ss16_io_text_file\bai_tap\sao_chep_van_ban\result.txt
        String uotPath = scanner.nextLine();
        try {
            File file = new File(inPath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(uotPath,true));
            String line = "";
            while ((line = bufferedReader.readLine())!= null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();

        } catch (IOException e) {
            System.out.println("tệp nguồn không tồn tại hoặc tệp ra không tồn tại");
        }
    }
}
