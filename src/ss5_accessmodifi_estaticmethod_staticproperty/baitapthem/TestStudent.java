package ss5_accessmodifi_estaticmethod_staticproperty.baitapthem;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    SetStudent.add();
                    break;
                case 2:
                    SetStudent.display();
                    break;
                case 3:
                    SetStudent.search();
                    break;
                case 4:
                    SetStudent.delete();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
