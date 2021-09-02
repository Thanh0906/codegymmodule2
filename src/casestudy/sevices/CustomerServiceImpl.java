package casestudy.sevices;

import casestudy.models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static Scanner scanner = new Scanner(System.in);
    List<Customer> customerList  = new LinkedList<>();
    @Override
    public void display() {
        for (Customer customer :customerList){
            System.out.println(customer.toString());
        }

    }

    @Override
    public void addNew() {
        System.out.println("nhập id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên :");
        String name = scanner.nextLine();
        System.out.println("nhập id :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giới tính :");
        String sex = scanner.nextLine();
        System.out.println("nhập chứng minh nhân dân :");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập Email :");
        String email = scanner.nextLine();
        System.out.println("nhập Loại khách hàng:");
        String typeCustomer = scanner.nextLine();
        System.out.println("nhập vị trí :");
        String addressCustomer = scanner.nextLine();

       Customer customer = new Customer(id, name, age, sex, idCard, email,typeCustomer,addressCustomer);
       customerList.add(customer);
       System.out.println("dã thêm mới thành công");

    }

    @Override
    public void edit() {
        System.out.println("nhập id mà bạn muốn sửa");
        int idOfEdit = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == idOfEdit) {
                check = true;
                System.out.println("bạn muốn sửa thông tin gì");
                System.out.println("1. Bạn muốn sửa tên");
                System.out.println("2. Ban muốn sửa tuổi");
                System.out.println("3. Bạn muốn sửa giới tính");
                System.out.println("4. Bạn muốn sửa Cmnd");
                System.out.println("5. Bạn muốn sửa email");
                System.out.println("6. Bạn muốn sửa loai khách hàng");
                System.out.println("7. Bạn muốn sửa địa chỉ khách hàng");
                System.out.println("0. Return main menu");
                System.out.print("Nhập từ 0 đến 7 : ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Nhập lại tên: ");
                        String inputNewName = scanner.nextLine();
                        customerList.get(i).setName(inputNewName);
                        break;
                    case 2:
                        System.out.print("Nhập lại tuổi");
                        int inputNewAge = Integer.parseInt(scanner.nextLine());
                        customerList.get(i).setAge(inputNewAge);
                        break;
                    case 3:
                        System.out.print("Nhập lại giới tính: ");
                        String inputNewSex = scanner.nextLine();
                        customerList.get(i).setSex(inputNewSex);
                        break;
                    case 4:
                        System.out.print("Nhập lại số CMND ");
                        int inputNewId = Integer.parseInt(scanner.nextLine());
                       customerList.get(i).setIdCard(inputNewId);
                        break;
                    case 5:
                        System.out.print("Nhập lại email ");
                        String inputNewEmail = scanner.nextLine();
                        customerList.get(i).setEmail(inputNewEmail);
                        break;
                    case 6:
                        System.out.print("Nhập lại loại khách hàng ");
                        String inputNewTypeCustomer = scanner.nextLine();
                        customerList.get(i).setTypeCustomer(inputNewTypeCustomer);
                        break;
                    case 7:
                        System.out.print("Nhập lại địa chỉ khách hàng: ");
                        String inputNewAddressCustomer = scanner.nextLine();
                        customerList.get(i).setAddressCustomer(inputNewAddressCustomer);
                        break;

                    case 0:
                        break;
                    default:
                        System.out.println("bạn đã nhập sai.Hãy nhập lại");
                }
            }

        }
        if (!check){
            System.out.println("ID đã tồn tại.vui lòng nhập lại");
        }

    }


}
