package ss5_accessmodifi_estaticmethod_staticproperty.baitapthem;

public class Student {
    private String name;
    private int age;
    private String address;
    public Student(String name, int age){

    }

    public Student(String name, int age, String adree) {
        this.name = name;
        this.age = age;

    }

    public Student(String name, int age, Address address1) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Học sinh tên là :"+name +
                age + " tuổi"+ "địa chỉ là : " +address;
    }


}
