package casestudy.models;

public abstract  class Facility {
    private String idFacility;
    private String nameService;//tên dịch vụ
    private double useArea;//diện tích
    private String roomStandard;//tiêu chuẩn phòng
    private double rentalCosts;//chi phí cho thuê
    private int numberPeople;//số người
    private String styleRental;//kiêu thuê

    public Facility(){

    }

    public Facility(String idFacility, String nameService, double useArea, String roomStandard, double rentalCosts, int numberPeople, String styleRental) {
        this.idFacility = idFacility;
        this.nameService = nameService;
        this.useArea = useArea;
        this.roomStandard = roomStandard;
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

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
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
                "idFacility=" + idFacility +
                ", nameService='" + nameService + '\'' +
                ", useArea=" + useArea +
                ", roomStandard='" + roomStandard + '\'' +
                ", rentalCosts=" + rentalCosts +
                ", numberPeople=" + numberPeople +
                ", styleRental='" + styleRental + '\'' +
                '}';
    }
}
