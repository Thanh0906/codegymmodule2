package ss5_accessmodifi_estaticmethod_staticproperty.thuchanh.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.Student.change();
        StaticMethod.Student s1 = new StaticMethod.Student(111, "Hoang");
        StaticMethod.Student s2 = new StaticMethod.Student(222, "Khanh");
        StaticMethod.Student s3 = new StaticMethod.Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
