package ss5_accessmodifiestaticmethodstaticproperty.baitapthem;

import java.util.Arrays;
import java.util.Scanner;

public class SetStudent{

    public static Student[] studentList = new Student[100];
    static {
        studentList[0]=new Student("Thanh",23);
        studentList[1]= new Student("Huy",23);
    }

    static Scanner scanner = new Scanner(System.in);

    public static void add() {
        System.out.println("nhập tên của sinh viên :");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi :");
        int age = scanner.nextInt();
        Student student = new Student(name,age);
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }

        }
    }

    public static void display() {
        for (int i = 0; i < studentList.length - 1; i++) {
            System.out.println(i + 1 + "." + studentList[i].toString());
        }

    }

}

