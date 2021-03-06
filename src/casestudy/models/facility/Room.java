package casestudy.models.facility;

public class Room extends Facility {

    private String freeService;//dịch vụ miễn phí



    public Room(String idService, String nameService, double useArea, double rentalCosts, int numberPeople, String styleRental, String freeService) {
        super(idService, nameService, useArea, rentalCosts, numberPeople, styleRental);
        this.freeService = freeService;
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
                "freeService='" + freeService + '\'' +
                '}';
    }
}
