package ss12_java_collection_ramework.bai_tap.arraylist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm theo giá");
            System.out.println("6. Hiển thị sản phẩm");
            System.out.println("0. Exit");
            System.out.println("Hãy chọn từ menu: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductMananger.addProduct();
                    break;
                case 2:
                   ProductMananger.deleteProduct();
                    break;
                case 3:
                    ProductMananger.editProduct();
                    break;
                case 4:
                    ProductMananger.searchProduct();
                    break;
                case 5:
                    System.out.println("1. Sắp xếp theo giá tăng dần");
                    System.out.println("2. Sắp xếp theo giá giảm dần");
                    System.out.println("Hãy chọn 1 hoặc 2: ");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1:
                           ProductMananger.sortAscendant();
                            break;
                        case 2:
                           ProductMananger.sortDiminuer();
                            break;
                    }
                    break;
                case 6:
                    ProductMananger.displayProduct();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
