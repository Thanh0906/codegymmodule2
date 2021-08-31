package giai_thuat;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static int[] findMax(int[][] array) {
        int[] maxArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int max = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            maxArray[i] = max;

        }
        return maxArray;

    }
    public static void main(String[] args) {
        int m;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        m = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột");
        n = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[m][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.toString(findMax(array)));
    }
}
