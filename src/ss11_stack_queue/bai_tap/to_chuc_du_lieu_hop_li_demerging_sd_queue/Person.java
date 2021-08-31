package ss11_stack_queue.bai_tap.to_chuc_du_lieu_hop_li_demerging_sd_queue;

public class Person implements Comparable<Person> {
    private String name;
    private String gender;
    private int age;

    public Person() {
    }

    public Person (String name, String gender, int dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.age = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
       if (this.getAge()>o.getAge()){
           return 1;
       }else {
           return -1;
       }
    }
}
