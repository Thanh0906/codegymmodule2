package ss7_abstractclass_interface.bai_tap.colorable;


public class Run {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Cricle(3, "red", false);
        shapes[1] = new Rantange(3, 3);
        shapes[2] = new Square(3);
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            } else if (shape instanceof Rantange) {
                System.out.println("hình chữ nhât Có diện tích là: " + ((Rantange) shape).getArea());
            } else {
                System.out.println("hình tròn Có diện tích là: " + ((Cricle) shape).getArea());
            }
        }

    }
}
