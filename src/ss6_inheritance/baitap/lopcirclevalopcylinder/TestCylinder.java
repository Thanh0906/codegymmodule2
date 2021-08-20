package ss6_inheritance.baitap.lopcirclevalopcylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder();
        cylinder1.setColor("tím");
        cylinder1.setHeight(15);
        cylinder1.setRadius(6);
        System.out.println(cylinder1);
    }
}
