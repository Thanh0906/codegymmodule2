package ss5_accessmodifi_estaticmethod_staticproperty.baitapthem;

import java.util.Scanner;

public class SetStudent {
    static Scanner scanner = new Scanner(System.in);
    public static Student[] studentList = new Student[100];

    static {
        studentList[0] = new Student("Thanh", 23,"null");
        studentList[1] = new Student("Huy", 23, "Hà Huy Tập");
    }


    public static void add() {

        System.out.println("nhập tên của sinh viên :");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số nhà " );
        String house =scanner.nextLine();
        System.out.println("nhập tên đường " );
        String stress =scanner.nextLine();
        System.out.println("nhập tên phuong " );
        String ward =scanner.nextLine();
        System.out.println("nhập tên quan " );
        String district =scanner.nextLine();
        System.out.println("nhập tên thành phó " );
        String province =scanner.nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                Address address=new Address(house,stress,ward,district,province);
                studentList[i] = new Student(name,age,address);
                break;
            }else {
                continue;
            }

        }
    }

    public static void display() {
        for (int i = 0; i < studentList.length - 1; i++) {
            if (studentList[i] != null) {
                System.out.println(studentList[i].toString());
            }
        }
    }

    public static void search() {
        System.out.print("Hãy nhập tên của sinh viên cần tìm: ");
        String searchNameStudent = scanner.nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].getName().equals(searchNameStudent)) {
                System.out.println("Sinh viên cần tìm là: ");
                System.out.println(studentList[i].toString());
                break;
            }
        }
    }
    public static void delete () {
        System.out.print("Hãy nhập tên của sinh viên mà bạn muốn xóa: ");
        String nameStudentToDelete = scanner.nextLine();
        for (int i = 0; i < 100; i++) {
            if (studentList[i].getName().equals(nameStudentToDelete)) {
                for (int j = i; j < 99; j++) {
                    studentList[j] = studentList[j + 1];
                }
                break;
            }
        }
    }
}

