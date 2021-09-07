package casestudy.models.facility;

public class Villa extends Facility {

    private String roomStandard;//tiêu chuẩn phòng
    private  double poolArea;//diện tích hồ bơi
    private int numberFloors;//số tầng

    public Villa(String roomStandard, double poolArea, int numberFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String idFacility, String nameService, double useArea, double rentalCosts, int numberPeople,
                 String styleRental, String roomStandard, double poolArea, int numberFloors) {
        super(idFacility, nameService, useArea, rentalCosts, numberPeople, styleRental);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
