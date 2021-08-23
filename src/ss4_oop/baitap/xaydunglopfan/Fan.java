package ss4_oop.baitap.xaydunglopfan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public static int getSLOW() {
        return SLOW;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void setOn(boolean on) {
        this.on = on;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String toString() {
        if (on) {
            return "fan is on" + "\nSpeed: " + speed + "\nColor: " + color + "\nRadius: " + radius;
        } else {
            return "fan is off" + "\nColor: " + color + "\nRadius: " + radius;
        }
    }
}
