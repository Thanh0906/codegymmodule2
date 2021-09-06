package jame_mo_rong.ngay_6_9;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentManager {
    private static Map<Student, Integer> studentList = new TreeMap<>();

    static Scanner scanner =new Scanner(System.in);
    static {
        studentList.put(new Student("Phước", 31, "Quảng Nam"), 1);
        studentList.put(new Student("Thanh", 26, "Quảng Ngãi"), 0);
        studentList.put(new Student("hoàng", 22, "Quảng Nam"), 2);
        studentList.put(new Student("Công", 27, "Đà Nẵng"), 3);

    }
    public static void add () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Hãy nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập địa chỉ: ");
        String address = scanner.nextLine();
        Set<Student> studentSet = studentList.keySet();
        boolean check = false;
        for (Student student : studentSet) {
            if (name.equals(student.getName())) {
                check = true;
                studentList.put(student, (studentList.get(student) + 1));
            }
        }
        if (!check) {
            studentList.put(new Student(name, age, address), 1);
        }
    }
    public static void display () {
        Set<Student> studentSet = studentList.keySet();
        for (Student student : studentSet) {
            System.out.println(student.toString());
        }
    }

}
