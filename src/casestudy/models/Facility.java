package casestudy.models;

public abstract  class Facility {
    private String nameService;//tên dịch vụ
    private double useArea;//diện tích
    private double rentalcosts;//chi phí cho thuê
    private double numberPeople;//số người

    public Facility(){

    }

    public Facility(String nameService, double useArea, double rentalcosts, double numberPeople) {
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentalcosts = rentalcosts;
        this.numberPeople = numberPeople;

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

    public double getRentalcosts() {
        return rentalcosts;
    }

    public void setRentalcosts(double rentalcosts) {
        this.rentalcosts = rentalcosts;
    }

    public double getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(double numberPeople) {
        this.numberPeople = numberPeople;
    }


}
