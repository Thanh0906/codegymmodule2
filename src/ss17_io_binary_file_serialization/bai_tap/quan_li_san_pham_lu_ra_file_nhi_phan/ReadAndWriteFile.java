package ss17_io_binary_file_serialization.bai_tap.quan_li_san_pham_lu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<Product> readFromFile(String filePath) {
        List<Product> productList = new ArrayList<>();
        File f = new File(filePath);
        if (f.length() > 0) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                productList = (List<Product>) ois.readObject();
                fis.close();
                ois.close();
            } catch (FileNotFoundException ignored) {

            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
            return productList;

        } else {
            return productList;
        }
    }
    public static void writeToFile(String filePath, List<Product> productList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

