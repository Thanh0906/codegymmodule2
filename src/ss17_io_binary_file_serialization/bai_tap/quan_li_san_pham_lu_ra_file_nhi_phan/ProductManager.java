package ss17_io_binary_file_serialization.bai_tap.quan_li_san_pham_lu_ra_file_nhi_phan;


import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    static String filePath = "src\\ss17_io_binary_file_serialization\\bai_tap\\quan_li_san_pham_lu_ra_file_nhi_phan\\product.csv";

    public static void addProduct() {
        List<Product> listProduct = ReadAndWriteFile.readFromFile(filePath);
        boolean check = true;
        System.out.print("Hãy nhập vào Id của sản phẩm: ");
        int idProduct = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getIdProduct() == idProduct) {
                check = false;
                System.out.println("Lỗi do Id này đã tồn tại trong danh sách.");
                break;
            }
        }
        if (check) {
            listProduct.clear();
            System.out.print("Hãy nhập vào tên của sản phẩm: ");
            String name = scanner.nextLine();
            System.out.print("Hãy nhập vào hãng sản xuất của sản phẩm: ");
            String producer = scanner.nextLine();
            System.out.print("Hãy nhập vào giá của sản phẩm (USD): ");
            double priceOfProduct = Double.parseDouble(scanner.nextLine());
            System.out.print("Hãy nhập vào các mô tả khác của sản phẩm: ");
            String other = scanner.nextLine();
            listProduct.add(new Product(idProduct, name, producer, priceOfProduct, other));
            System.out.println("Thêm sản phẩm thành công");
            ReadAndWriteFile.writeToFile(filePath, listProduct,true);
            displayList();
        }
    }

    public static void displayList( ) {
        List<Product> listProduct = ReadAndWriteFile.readFromFile(filePath);
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }

    public static void search() {
        List<Product> list = ReadAndWriteFile.readFromFile(filePath);
        Scanner scanner = new Scanner(System.in);
        int id;
        boolean flag = true;
        boolean check = true;
        while (flag) {
            System.out.println("Nhập mã sản phẩm");
            id = Integer.parseInt(scanner.nextLine());
            flag = false;
            for (Product product : list) {
                if (product.getIdProduct() == id) {
                    System.out.println("Đã tìm thấy sản phẩm !");
                    System.out.println(list.get(id - 1).toString());
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Mã sản phẩm không tồn tại, vui lòng nhập lại mã khác");
                flag = true;
            }
        }
    }
    // public static void editProduct() {
    //        List<Product> listProduct = ReadAndWriteFile.readFromFile(filePath);
    //        System.out.print("Hãy nhập Id của sản phẩm mà bạn cần sửa: ");
    //        boolean check = false;
    //        int idEdit = Integer.parseInt(scanner.nextLine());
    //        for (int i = 0; i < listProduct.size(); i++) {
    //            if (listProduct.get(i).getIdProduct() == idEdit) {
    //                check = true;
    //                System.out.println("Bạn cần sửa gì?");
    //                System.out.println("1. Sửa tên của sản phẩm");
    //                System.out.println("2. Sửa hãng sản xuất của sản phẩm");
    //                System.out.println("3. Sửa giá của sản phẩm");
    //                System.out.println("4. Sửa các mô tả khác của sản phẩm");
    //                System.out.println("0. Quay lại menu chính");
    //                System.out.print("Bạn hãy chọn từ 0 đến 4: ");
    //                int choice = Integer.parseInt(scanner.nextLine());
    //                switch (choice) {
    //                    case 1:
    //                        System.out.print("Hãy nhập vào tên mới: ");
    //                        String newName = scanner.nextLine();
    //                        listProduct.get(i).setName(newName);
    //                        ReadAndWriteFile.writeToFile(filePath, listProduct);
    //                        break;
    //                    case 2:
    //                        System.out.print("Hãy nhập vào hãng sản xuất mới: ");
    //                        String newProducer = scanner.nextLine();
    //                        listProduct.get(i).setProducer(newProducer);
    //                        ReadAndWriteFile.writeToFile(filePath, listProduct);
    //                        break;
    //                    case 3:
    //                        System.out.print("Hãy nhập vào giá mới: ");
    //                        double newPrice = Double.parseDouble(scanner.nextLine());
    //                        listProduct.get(i).setPrice(newPrice);
    //                        ReadAndWriteFile.writeToFile(filePath, listProduct);
    //                        break;
    //                    case 4:
    //                        System.out.print("Hãy nhập vào các mô tả mới: ");
    //                        String newOther = scanner.nextLine();
    //                        listProduct.get(i).setOther(newOther);
    //                        ReadAndWriteFile.writeToFile(filePath, listProduct);
    //                        break;
    //                    case 0:
    //                        break;
    //                    default:
    //                        System.out.println("Lỗi do nhập sai.");
    //                }
    //                break;
    //            }
    //        }
    //        if (!check) {
    //            System.out.println("Id mà bạn nhập không tồn tại trong danh sách.");
    //        }
    //
    //        displayList();
    //    }

}

