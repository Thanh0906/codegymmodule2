package ss5_accessmodifiestaticmethodstaticproperty.baitapthem;

public class Student {
    private String name;
    private int age;
 //   private String adree;
    public Student(String name, int age){

    }

    public Student(String name, int age, String adree) {
        this.name = name;
        this.age = age;
     //   this.adree = adree;
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

  //  public String getAdree() {
   //     return adree;
  //  }

  //  public void setAdree(String adree) {
   //     this.adree = adree;
   // }
    public String toString(){
        return "Học sinh tên là :"+name +
                age + " tuổi"+ "địa chỉ là : ";
        //+adree;
    }
}
