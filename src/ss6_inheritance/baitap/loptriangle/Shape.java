package ss6_inheritance.baitap.loptriangle;

public class Shape {
    protected String color;


    public Shape() {
        color="green";

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


    public String toString(){
        return "hinh nay co mau la "+color+", ";
    }
}
