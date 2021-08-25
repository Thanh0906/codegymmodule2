package ss7_abstractclass_interface.bai_tap.resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Cricle(3);
        shapes[1] = new Ractange(3, 4);
        shapes[2] = new Square(4);
        System.out.println("trước khi thay đổi");
        for (Shape shape : shapes) {
            if (shape instanceof Cricle)
                System.out.println("Diện tích hình tròn trước khi thay đổi kích thước là: "+((Cricle) shape).getArea());
            if (shape instanceof Ractange)
                System.out.println("Diện tích hình chữ nhật trước khi thay đổi kích thước là: "+((Ractange) shape).getArea());
            if (shape instanceof Square)
                System.out.println("Diện tích hình vuông trước khi thay đổi kích thước là: "+((Square) shape).getArea());
        }
        for (Shape shape : shapes) {
            if (shape instanceof Cricle) {
                ((Cricle) shape).resize(Math.random()*100);
            }
            if (shape instanceof Ractange) {
                ((Ractange) shape).resize(Math.random() * 100);
            }
            if (shape instanceof Square) {
                ((Square) shape).resize(Math.random() * 100);
            }
        }
        System.out.println("Sau khi thay đổi kích thước: ");
        for (Shape shape : shapes) {

            if (shape instanceof Cricle) {
                System.out.println("Diện tích hình tròn sau khi thay đổi kích thước là: " + ((Cricle) shape).getArea());
            }
            if (shape instanceof Ractange) {
                System.out.println("Diện tích hình chữ nhật sau khi thay đổi kích thước là: " + ((Ractange) shape).getArea());
            }
            if (shape instanceof Square) {
                System.out.println("Diện tích hình vuông sau khi thay đổi kích thước là: " + ((Square) shape).getArea());
            }
        }
    }
}
