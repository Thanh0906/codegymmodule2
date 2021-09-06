package casestudy.models;

public class Villa extends Facility {

    private double livingRoomArea;//diện tích phòng khách
    private int bedRoomMaster;//phòng ngủ Master
    private int bedRoomSmall;//phòng ngủ nhỏ
    private double poolArea;//diện tích hồ bơi
    private String greenSpace;//không gian xanh

    public Villa() {
    }

    public Villa(double livingRoomArea, int bedRoomMaster, int bedRoomSmall, double poolArea, String greenSpace) {
        this.livingRoomArea = livingRoomArea;
        this.bedRoomMaster = bedRoomMaster;
        this.bedRoomSmall = bedRoomSmall;
        this.poolArea = poolArea;
        this.greenSpace = greenSpace;
    }

    public Villa(String idFacility, String nameService, double useArea, String roomStandard, double rentalCosts, int numberPeople, String styleRental, double livingRoomArea, int bedRoomMaster, int bedRoomSmall, double poolArea, String greenSpace) {
        super(idFacility, nameService, useArea, roomStandard, rentalCosts, numberPeople, styleRental);
        this.livingRoomArea = livingRoomArea;
        this.bedRoomMaster = bedRoomMaster;
        this.bedRoomSmall = bedRoomSmall;
        this.poolArea = poolArea;
        this.greenSpace = greenSpace;
    }

    public double getLivingRoomArea() {
        return livingRoomArea;
    }

    public void setLivingRoomArea(double livingRoomArea) {
        this.livingRoomArea = livingRoomArea;
    }

    public int getBedRoomMaster() {
        return bedRoomMaster;
    }

    public void setBedRoomMaster(int bedRoomMaster) {
        this.bedRoomMaster = bedRoomMaster;
    }

    public int getBedRoomSmall() {
        return bedRoomSmall;
    }

    public void setBedRoomSmall(int bedRoomSmall) {
        this.bedRoomSmall = bedRoomSmall;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public String getGreenSpace() {
        return greenSpace;
    }

    public void setGreenSpace(String greenSpace) {
        this.greenSpace = greenSpace;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "livingRoomArea=" + livingRoomArea +
                ", bedRoomMaster=" + bedRoomMaster +
                ", bedRoomSmall=" + bedRoomSmall +
                ", poolArea=" + poolArea +
                ", greenSpace='" + greenSpace + '\'' +
                '}';
    }
}
