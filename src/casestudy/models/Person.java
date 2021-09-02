package casestudy.models;

public abstract class Person {
    private int id;
    private String name;
    private int age;
    private String sex;
    private int idCard;
    private String email;

    public Person() {

    }

    public Person(int id, String name, int age, String sex, int idCard, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.idCard = idCard;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSex(String inputNewSex) {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
