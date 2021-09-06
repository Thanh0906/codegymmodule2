package casestudy.models;

public class Booking {
    private String idBooking; // Mã booking
    private String startDate; // Ngày bắt đầu
    private String endDate; // Ngày kết thúc
    private Customer customer; // Mã khách hàng
    private Facility facility;
    public Booking(int id, String startDate, String endDate, Customer customer, Facility facility){}

    public Booking(String idBooking, String startDate, String endDate, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customer='" + customer + '\'' +
                ", facility='" + facility + '\'' +
                '}';
    }
}
