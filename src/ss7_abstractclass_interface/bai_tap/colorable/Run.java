package ss7_abstractclass_interface.bai_tap.colorable;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("bạn muốn bao nhiêu hình");
//        int size = Integer.parseInt(scanner.nextLine());
//        Shape [] shapes =new Shape[size];
//        for (Shape shape: shapes){
//        if (shape instanceof Cricle){
//                System.out.println("có diện tích là " +((Cricle) shape).getArea());
 //           }
 //           if (shape instanceof Rantange){
//                System.out.println("có diện tích là " +((Rantange) shape).getArea());
//            }if (shape instanceof Colorable) {
 //               ((Colorable) shape).howToColor();
 //           }
 //       }
        Square s1 = new Square(true, 5);
        Square s2 = new Square(10);
        Square s3 = new Square();

        System.out.println(s1.toString());
        s1.howToColor();
        System.out.println(s2.toString());
        s2.howToColor();
        System.out.println(s3.toString());
        s3.howToColor();
    }

}
