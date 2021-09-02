package casestudy.models;

public class Customer extends Person {
//khách hàng
    private String typeCustomer;
    private String addressCustomer;

    public Customer() {
    }

    public Customer( String typeCustomer, String address) {

        this.typeCustomer = typeCustomer;
        this.addressCustomer = address;
    }

    public Customer(int id, String name, int age, String sex, int idCard, String email, String typeCustomer, String address) {
        super(id, name, age, sex, idCard, email);

        this.typeCustomer = typeCustomer;
        this.addressCustomer = address;
    }





    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }
}
