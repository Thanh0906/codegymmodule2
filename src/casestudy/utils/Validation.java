package casestudy.utils;

import java.time.LocalDate;
import java.util.Scanner;

public class Validation {
    static Scanner scanner = new Scanner(System.in);

    //nhập ngày
    public static String inputDay() {
        String checkDay = "";
        boolean check = true;
        while (check) {
            checkDay = scanner.nextLine();
            if (!checkDay.matches("[0-9]{2}/[0-9]{2}/(19[0-9][0-9]|20[0-9][0-9])")) {
                System.out.println("No matches.Re-Enter");

            } else {
                check = false;
            }
        }
        return checkDay;
    }

    //giới tính
    public static String inputGender() {
        String gender = "";
        boolean check = true;
        while (check) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    gender = "Male";
                } else if (choice == 2) {
                    gender = "Female";
                }
                check =false;
            } catch (Exception e) {
                System.out.println("No matches.Re-Enter: ");
            }
        }
        return gender;
    }

    //định dạng email
    public static String inputEmail() {
        String checkEmail = "";
        boolean check = true;
        while (check) {

            checkEmail = scanner.nextLine();
            if (!checkEmail.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)")) {
                System.out.println("No matches.Re-Enter ");


            } else {
                check = false;
            }
        }
        return checkEmail;
    }

    public static String inputNameService() {
        boolean boole = true;
        String name = "";
        while (boole) {
            name = scanner.nextLine();
            if (name.matches("^[A-Z][A-z]*")) {
                boole = false;
            } else {
                System.out.println("No matches.Re-Enter  ");
            }
        }
        return name;
    }

    //diện tích sử dụng
    public static Double inputUseArea() {
        boolean boole = true;
        double useArea = 0;
        while (boole) {
            try {
                useArea = Double.parseDouble(scanner.nextLine());
                if (useArea > 30) {
                    boole = false;
                } else {
                    System.out.println("The useArea must be more than 30.Re-Enter");

                }
            } catch (Exception e) {
                System.out.println("No matches.Re-Enter ");

            }

        }
        return useArea;
    }

    //kiểu dữ liệu doble đều dùng
    public static Double inputDouble() {

        boolean boole = true;
        double money = 0;
        while (boole) {
            try {
                money = Double.parseDouble(scanner.nextLine());
                if (money >= 0) {
                    boole = false;
                } else {
                    System.out.println("No matches.Re-Enter ");

                }
            } catch (Exception e) {
                System.out.println("No matches.Re-Enter ");

            }

        }
        return money;
    }

    //số người
    public static Integer inputNumberPeople() {
        int numberPeople = 0;
        boolean boole = true;
        while (boole) {
            try {
                numberPeople = Integer.parseInt(scanner.nextLine());
                if (numberPeople > 0 && numberPeople < 20) {
                    boole = false;
                } else {
                    System.out.println("Not found  ");
                }

            } catch (Exception e) {
                System.out.println("No matches.Re-Enter ");

            }
        }
        return numberPeople;
    }

    public static String inputIdService(String string) {
        boolean boole = true;
        String idService = "";
        while (boole) {
            idService = scanner.nextLine();
            if (idService.matches("^SV" + string + "-[0-9]{4}$")) {
                boole = false;
            } else {
                System.out.println("No matches.Re-Enter ");

            }
        }
        return idService;
    }

    //số tầng
    public static int inputNumberFloors() {
        boolean boole = true;
        int numberFloors = 0;
        while (boole) {
            try {
                numberFloors = Integer.parseInt(scanner.nextLine());
                if (numberFloors >= 0) {
                    boole = false;
                } else {
                    System.out.println("No matches.Re-Enter ");
                   ;
                }
            } catch (Exception e) {
                System.out.println("No matches .Re-Enter ");

            }

        }
        return numberFloors;

    }

    //định dạng nam sinnh
    public static String inputBirthday() {
        String birthday = "";
        boolean boole = true;
        while (boole) {
            birthday = inputDay();
            String[] strings = birthday.split("/");
            LocalDate localDate = LocalDate.now();
            int yearnow = localDate.getYear();
            int age = yearnow - Integer.parseInt(strings[2]);
            if (age < 18) {
                System.out.println("nho hon 18.  Re-enter");

            } else if (age > 100) {
                System.out.println("hơn 100.  Re-enter");

            } else {
                boole = false;
            }
        }
        return birthday;
    }

    public static Integer inputNumber() {
        int number = 0;
        boolean boole = true;
        while (boole) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                boole = false;
            } catch (Exception e) {
                System.out.println("Not number");
            }

        }
        return number;
    }

}

