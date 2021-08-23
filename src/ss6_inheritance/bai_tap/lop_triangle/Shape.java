package ss6_inheritance.bai_tap.lop_triangle;

public class Shape {
    private String color;

    public Shape() {
        color = "green";

    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        return "hinh nay co mau la " + color + ", ";
    }
}
