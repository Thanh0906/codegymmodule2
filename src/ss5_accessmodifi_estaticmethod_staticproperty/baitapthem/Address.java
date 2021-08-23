package ss5_accessmodifi_estaticmethod_staticproperty.baitapthem;

public class Address {
    private String house;
    private String stress;
    private String city;
    public Address(){

    }

    public Address(String house, String stress, String city) {
        this.house = house;
        this.stress = stress;
        city = city;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getStress() {
        return stress;
    }

    public void setStress(String stress) {
        this.stress = stress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        city = city;
    }
    public String toString(){
        return "Số nhà"+house+ "Số đường"+stress+ "Thành phố" +city;
    }
}
