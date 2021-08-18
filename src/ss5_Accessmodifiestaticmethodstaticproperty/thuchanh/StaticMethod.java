package ss5_Accessmodifiestaticmethodstaticproperty.thuchanh;

public class StaticMethod {
    public static class Student{
        private int rollno;
        private String name;
        private static String college = "kkkk";
        Student(int r,String n){
            rollno = r;
            name = n;
        }
        static void change(){
            college = "bum";
        }
        void display(){
            System.out.println(rollno + " " + name + " " + college);
        }
    }

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
