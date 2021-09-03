package casestudy.models;

public class House extends Facility {
    private int numberFloor;//số tầng
    private int bedRoomMaster;//phòng ngủ Master
    private int bedRoomSmall;//phòng ngủ nhỏ
    private int kitchen;//phòng bếp
    public House(){

    }

    public House(int numberFloor, int bedRoomMaster, int bedRoomSmall, int kitchen) {
        this.numberFloor = numberFloor;
        this.bedRoomMaster = bedRoomMaster;
        this.bedRoomSmall = bedRoomSmall;
        this.kitchen = kitchen;
    }

    public House(String nameService, double useArea, double rentalcosts, int numberPeople, int numberFloor, int bedRoomMaster, int bedRoomSmall, int kitchen) {
        super(nameService, useArea, rentalcosts, numberPeople);
        this.numberFloor = numberFloor;//só tầng
        this.bedRoomMaster = bedRoomMaster;
        this.bedRoomSmall = bedRoomSmall;
        this.kitchen = kitchen;
    }



    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
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

    public int getKitchen() {
        return kitchen;
    }

    public void setKitchen(int kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberFloor=" + numberFloor +
                ", bedRoomMaster=" + bedRoomMaster +
                ", bedRoomSmall=" + bedRoomSmall +
                ", kitchen=" + kitchen +
                super.toString()+
                '}';
    }
}
