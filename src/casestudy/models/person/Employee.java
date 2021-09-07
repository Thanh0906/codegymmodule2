package casestudy.models.person;

import casestudy.models.person.Person;

public class Employee extends Person {
    //nhân viên
    private String level;//trihf độ Trung cấp, Cao đẳng, Đại học và sau đại học
    private String position;//vị trí Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
    private int salary;//luong

    public Employee() {
    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String fullName, int age, String gender, String idCardNumber, String phoneNumber, String email, String level, String position, int salary) {
        super(id, fullName, age, gender, idCardNumber, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
