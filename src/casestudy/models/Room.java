package casestudy.models;

public class Room extends Facility{
    private int numberWindow;//số cửa sổ
    private int numberBed;//số giường
    private String freeService;//dịch vụ miễn phí
    public Room(){

    }

    public Room(int numberWindow, int numberBed, String freeService) {
        this.numberWindow = numberWindow;
        this.numberBed = numberBed;
        this.freeService = freeService;
    }

    public Room(String nameService, double useArea, double rentalcosts, int numberPeople, int numberWindow, int numberBed, String freeService) {
        super(nameService, useArea, rentalcosts, numberPeople);
        this.numberWindow = numberWindow;
        this.numberBed = numberBed;
        this.freeService = freeService;
    }

    public int getNumberWindow() {
        return numberWindow;
    }

    public void setNumberWindow(int numberWindow) {
        this.numberWindow = numberWindow;
    }

    public int getNumberBed() {
        return numberBed;
    }

    public void setNumberBed(int numberBed) {
        this.numberBed = numberBed;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberWindow=" + numberWindow +
                ", numberBed=" + numberBed +
                ", freeService='" + freeService + super.toString() +
                '}';
    }
}
