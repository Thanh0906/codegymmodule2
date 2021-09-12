package ss17_io_binary_file_serialization.bai_tap.quan_li_san_pham_lu_ra_file_nhi_phan;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 4) {
            System.out.println("Chọn menu: ");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");
            System.out.println("mời bạn chon số : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductManager.addProduct();
                    break;
                case 2:
                    ProductManager.displayList();
                    break;
                case 3:
                    ProductManager.search();
                    break;
                default:
                    System.out.println("bạn nhập sai.mời nhập lại");
            }

        }

    }
}
