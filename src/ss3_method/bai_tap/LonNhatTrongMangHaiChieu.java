package ss3_mangvaphuongthuc.bai_tap;

import java.util.Scanner;

public class LonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số hàng của mảng : ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập số cột của mảng : ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Hãy nhập phần tử ở vị trí: " + i + "và " + j);

                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Ma trận vừa tạo là: ");
     for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
         //   System.out.println();
        }
        int max = matrix[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.print("Số lớn nhất trong ma trận là " + max + " ở vị trí " + x + ", " + y);
    }
}
