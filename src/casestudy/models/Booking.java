package casestudy.models;

public class Booking {
    private String idBooking; // Mã booking
    private String startDate; // Ngày bắt đầu
    private String endDate; // Ngày kết thúc
    private String idCustomer; // Mã khách hàng
    private String nameServices; // Tên dịch vụ
    private String servicesType; // Loại dịch vụ
    public Booking(){}

    public Booking(String idBooking, String startDate, String endDate, String idCustomer, String nameServices, String servicesType) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.nameServices = nameServices;
        this.servicesType = servicesType;
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

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getServicesType() {
        return servicesType;
    }

    public void setServicesType(String servicesType) {
        this.servicesType = servicesType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", servicesType='" + servicesType + '\'' +
                '}';
    }
}
