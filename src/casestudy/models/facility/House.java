package casestudy.models.facility;

public class House extends Facility {
    private  String roomStandard;//tiêu chuẩn phòng
    private int numberFloors;//số tầng
    public House (){}


    public House(String idService, String nameService, double useArea, double rentalCosts, int numberPeople, String styleRental, String roomStandard, int numberFloors) {
        super(idService, nameService, useArea, rentalCosts, numberPeople, styleRental);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
