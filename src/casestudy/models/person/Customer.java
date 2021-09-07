package casestudy.models.person;

public class Customer extends Person implements Comparable<Customer>{
//khách hàng
    private String idCustomer; // Mã khách hàng
    private String customerType; // Loại khách hàng: diamond, platinium, gold, silver, member
    private String addressCustomer; // Địa chỉ của khách hàng

    public Customer(String idCustomer, String customerType, String addressCustomer) {
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.addressCustomer = addressCustomer;
    }

    public Customer(int id, String fullName, int age, String gender, String idCardNumber,
                    String phoneNumber, String email, String idCustomer, String customerType,
                    String addressCustomer) {
        super(id, fullName, age, gender, idCardNumber, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.addressCustomer = addressCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
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
                "idCustomer='" + idCustomer + '\'' +
                ", customerType='" + customerType + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.getIdCustomer().compareTo(o.getIdCustomer());
    }
}
