package ss5_accessmodifi_estaticmethod_staticproperty.bai_tap.xaydunglopchighitrongjava;

public class Student {
    private String name ="John" ;
    private String classes = "C02";
    Student(){

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
