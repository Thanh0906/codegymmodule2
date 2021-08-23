package ss4_oop.thuc_hanh;

import java.util.Scanner;

public class LopHinhChuNhat {

    public static class Rectangle{

        double width ;
        double height ;
        public Rectangle(){

        }
        public Rectangle(double width,double height){
            this.height=height;
            this.width =width;
        }
        public double getDientich(){
            return this.height*this.width;
        }
        public double getChuvi(){
            return (this.height+this.width)*2;

        }
        public String display(){
            return "Rectangle{" + "Chiều rộng =" + width + ", Chiều cao =" + height + "}";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng:");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều cao:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật của bạn là: \n"+ rectangle.display());
        System.out.println("Chu vi hình chữ nhật là: "+ rectangle.getChuvi());
        System.out.println("Diện tích hình chứ nhật là: "+ rectangle.getDientich());
    }
}
