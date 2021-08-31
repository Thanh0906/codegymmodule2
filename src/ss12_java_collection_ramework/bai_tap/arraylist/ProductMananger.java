package ss12_java_collection_ramework.bai_tap.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMananger {
    static ArrayList<Product> listProduct = new ArrayList<>();
    public static void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập Id");
        int id =Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm");
        String name =scanner.nextLine();
        System.out.println("nhập giá tiền");
        double money = Double.parseDouble(scanner.nextLine());
        boolean check = true;
        for (Product product : listProduct) {
            if (product.getId() == id || id == 0) {
                System.out.println("id đã tồn tại hoặc id= 0");
                check = false;
                break;
            }
        }
        if (check){
            listProduct.add(new Product(id,name,money));
        }
    }



    public static void displayProduct(){
        for (Product product : listProduct){
            System.out.println(product.toString());
        }
    }
    public static void editProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id bạn muốn sửa");
        int idedit = Integer.parseInt(scanner.nextLine());
        boolean check =false;
        for (Product product : listProduct) {
            if (product.getId() == idedit) {
                check = true;
                System.out.println("1.Sửa tên sản phẩm");
                System.out.println("2.Sửa giá tiền sản phẩm");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("nhập lại tên mới");
                        String newName = scanner.nextLine();
                        product.setName(newName);
                        break;
                    case 2:
                        System.out.println("nhập lại giá tiền");
                        double newMoney = Double.parseDouble(scanner.nextLine());
                        product.setValue(newMoney);
                        break;
                    default:
                        System.out.println("bạn chỉ được chọn 1 hoặc 2");
                }
                break;

            }
        }
        if (check){
            System.out.println("ID bạn nhập khong có trong danh sách");
        }
    }
    public static void deleteProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập id của sản phẩm cần xóa: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == idDelete) {
                listProduct.remove(i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.print("Id mà bạn đã nhập không có trong danh sách. ");
        }

    }
    public static void searchProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên sản phẩm bạn muốn tìm");
        String nameSearch = scanner.nextLine();
        boolean check = false;
        for (Product product: listProduct){
            if (product.getName().equals(nameSearch)){
                System.out.println(product.toString());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy trong danh sách tên sản phẩm cần tìm ");
        }
    }
    public static void sortAscendant() {
       listProduct.sort(new Diminuer());
       displayProduct();

    }
    public static void sortDiminuer() {
        listProduct.sort(new Ascendant());
        displayProduct();

    }

}
