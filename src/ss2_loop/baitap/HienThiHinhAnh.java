package ss2_loop.baitap;

import java.util.Scanner;

public class HienThiHinhAnh {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông cân");
            System.out.println("3. In hình tam giác cân");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều dài: ");
                    int width = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập chiều rộng: ");
                    int height = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("nhập cạnh của tam giác: ");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Bạn muốn hình tam giác vuông cân có đỉnh ở đâu: " +
                            "1. Ở trên bên trái " +
                            "2. Ở trên bên phải " +
                            "3. Ở dưới bên trái " +
                            "4. Ở dưới bên phải");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1:
                            for (int i = a; i > 0; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = 0; i < a; i++) {
                                for (int j = 0; j < a ; j++) {
                                    if (i < j) {
                                        System.out.print(" ");
                                    } else {
                                        System.out.print("*");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 1; i <= a; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = 0; i < a; i++) {
                                for (int j = a - i; j > 0; j--) {
                                    System.out.print(" ");
                                }
                                for (int z = 1; z <= i + 1; z++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("Lỗi");
                    }
                    break;
                case 3:
                    System.out.print("Nhập chiều cao của tam giác cân: ");
                    int h = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < h; i++) {
                        for (int j = h - i; j > 0; j--) {
                            System.out.print(" ");
                        }
                        for (int g = 1; g <= i * 2 + 1; g++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
