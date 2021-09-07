package casestudy.models.facility;

public abstract  class Facility {
    private String idFacility;
    private String nameService;//tên dịch vụ
    private double useArea;//diện tích sử dụng
    private double rentalCosts;//chi phí cho thuê
    private int numberPeople;//số người tối da
    private String styleRental;//kiêu thuê bao gồm thuê theo năm, tháng, ngày, giờ.

    public Facility() {
    }

    public Facility(String idFacility, String nameService, double useArea, double rentalCosts, int numberPeople, String styleRental) {
        this.idFacility = idFacility;
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentalCosts = rentalCosts;
        this.numberPeople = numberPeople;
        this.styleRental = styleRental;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getStyleRental() {
        return styleRental;
    }

    public void setStyleRental(String styleRental) {
        this.styleRental = styleRental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idFacility='" + idFacility + '\'' +
                ", nameService='" + nameService + '\'' +
                ", useArea=" + useArea +
                ", rentalCosts=" + rentalCosts +
                ", numberPeople=" + numberPeople +
                ", styleRental='" + styleRental + '\'' +
                '}';
    }
}
