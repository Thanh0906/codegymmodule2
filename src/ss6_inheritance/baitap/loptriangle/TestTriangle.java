package ss6_inheritance.baitap.loptriangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập cạnh thứ 1 của tam giác: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Hãy nhập cạnh thứ 2 của tam giác: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Hãy nhập cạnh thứ 3 của tam giác: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            System.out.print("Hãy nhập màu sắc của tam giác: ");
            String color = scanner.nextLine();
            Triangle triangle = new Triangle(color, side1, side2, side3);
            System.out.println(triangle.toString());
        } else {
            System.out.println("Đây không phải là 3 cạnh của 1 tam giác");
        }
    }
}
