package ss5_accessmodifi_estaticmethod_staticproperty.baitapthem;

public class Address {
    private String houseNumber;
    private String stress;
    private String ward;
    private String district;
    private String province;
    public Address(){

    }

    public Address(String houseNumber, String stress, String ward, String district, String province) {
        this.houseNumber = houseNumber;
        this.stress = stress;
        this.ward = ward;
        this.district = district;
        this.province = province;
    }

    public Address(String house, String stress, String ward, System district, String province) {
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStress() {
        return stress;
    }

    public void setStress(String stress) {
        this.stress = stress;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        city = city;
    }
    public String toString(){
        return "Số nhà"+houseNumber+ "Số đường"+stress+ "phuong"+ward+"quan"+district+"Thành phố" +province;
    }
}
