package casestudy.sevices;

import casestudy.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static List<Employee> employeeList = new ArrayList<casestudy.models.Employee>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addList() {
        System.out.println("nhập id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên :");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giới tính :");
        String sex = scanner.nextLine();
        System.out.println("nhập chứng minh nhân dân :");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập Email :");
        String email = scanner.nextLine();
        System.out.println("nhập chức vụ :");
        String level = scanner.nextLine();
        System.out.println("nhập vị trí :");
        String position = scanner.nextLine();
        System.out.println("nhập lương :");
        int salary = Integer.parseInt(scanner.nextLine());
        casestudy.models.Employee employee = new casestudy.models.Employee(id, name, age, sex, idCard, email, level, position, salary);
        employeeList.add(employee);


    }

    @Override
    public void displayList() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }

    }

    @Override
    public void editList() {
        System.out.println("nhập id mà bạn muốn sửa");
        int idOfEdit = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < employeeList.size(); i++) {
        if (employeeList.get(i).getId() == idOfEdit) {
        check = true;
        System.out.println("bạn muốn sửa thông tin gì");
        System.out.println("1. Bạn muốn sửa tên");
        System.out.println("2. Ban muốn sửa tuổi");
        System.out.println("3. Bạn muốn sửa giới tính");
        System.out.println("4. Bạn muốn sửa Cmnd");
        System.out.println("5. Bạn muốn sửa email");
        System.out.println("6. Bạn muốn sửa chức vụ");
        System.out.println("7. Bạn muốn sửa vị trí");
        System.out.println("8. Bạn muốn sửa lương   ");
        System.out.println("0. Return main menu");
        System.out.print("Nhập từ 0 đến 8 : ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
        case 1:
        System.out.print("Nhập lại tên: ");
        String inputNewName = scanner.nextLine();
        employeeList.get(i).setName(inputNewName);
        break;
        case 2:
        System.out.print("Nhập lại tuổi");
        int inputNewAge = Integer.parseInt(scanner.nextLine());
        employeeList.get(i).setAge(inputNewAge);
        break;
            case 3:
                System.out.print("Nhập lại giới tính: ");
                String inputNewSex = scanner.nextLine();
                employeeList.get(i).setSex(inputNewSex);
                break;
            case 4:
                System.out.print("Nhập lại số CMND ");
                int inputNewId = Integer.parseInt(scanner.nextLine());
                employeeList.get(i).setIdCard(inputNewId);
                break;
            case 5:
                System.out.print("Nhập lại email ");
                String inputNewEmail = scanner.nextLine();
                employeeList.get(i).setEmail(inputNewEmail);
                break;
            case 6:
                System.out.print("Nhập chức vụ ");
                String inputNewLevel = scanner.nextLine();
                employeeList.get(i).setLevel(inputNewLevel);
                break;
            case 7:
                System.out.print("Nhập lại vị trí: ");
                String inputNewPosition = scanner.nextLine();
                employeeList.get(i).setPosition(inputNewPosition);
                break;
            case 8:
                System.out.print("Nhập lại lương mới ");
                int inputNewSalary = Integer.parseInt(scanner.nextLine());
                employeeList.get(i).setSalary(inputNewSalary);

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
