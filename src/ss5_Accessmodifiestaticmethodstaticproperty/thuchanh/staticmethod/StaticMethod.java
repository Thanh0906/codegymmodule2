package ss5_accessmodifiestaticmethodstaticproperty.thuchanh.staticmethod;

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
}
