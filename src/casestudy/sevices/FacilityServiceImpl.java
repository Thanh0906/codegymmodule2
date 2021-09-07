package casestudy.sevices;

import casestudy.models.facility.Facility;
import casestudy.models.facility.House;
import casestudy.models.facility.Room;
import casestudy.models.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements IFacilityService {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Map<Facility, Integer> listFacilityForMaintenance = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addList() {
        System.out.println("What do you want?");
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Back to menu");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                break;
            default:
                System.out.println("Error!!!");
        }
    }

    @Override
    public void displayList() {

        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service" + element.getKey() + " số lần đã thuê" + element.getValue());
        }

    }

    @Override
    public void editList() {

    }
    //String idFacility, String nameService, double useArea, double rentalCosts, int numberPeople,
    //    String styleRental, String roomStandard, double poolArea, int numberFloors
    public void addNewVilla() {
        System.out.println("Enter idFacility");
        String idFacility =scanner.nextLine();
        System.out.println("Nhập loại dịch vụ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double useArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí cho thuê");
        double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số người");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        String styleRental = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phonngf");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập ddienj tich shoof bơi");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("nhâp số tầng");
        int numberFloors =Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(idFacility,nameService,useArea,rentalCosts,numberPeople,styleRental,roomStandard,poolArea,numberFloors);
        facilityIntegerMap.put(villa, 1);

        System.out.println("đã thêm mới villa thành công");

    }
//String idFacility, String nameService, double useArea, double rentalCosts, int numberPeople,
//                 String styleRental, String roomStandard, int numberFloors
    public void addNewHouse() {
        System.out.println("Nhập lid");
        String idFacility = scanner.nextLine();
        System.out.println("Nhập loại dịch vụ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double useArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí cho thuê");
        double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số người");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap kiểu thuê");
        String styleRental =scanner.nextLine();
        System.out.println("nhap tiêu chuẩn phòng");
        String roomStandard =scanner.nextLine();
        System.out.println("nhâp số tầng");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        House house = new House(idFacility,nameService,useArea,rentalCosts,numberPeople,styleRental,roomStandard,numberFloor);
        facilityIntegerMap.put(house, 1);
        System.out.println("đã thêm mới villa thành công");

    }

    public void addNewRoom() {
        System.out.println("Nhập loại dịch vụ");
        String idFacility = scanner.nextLine();
        System.out.println("Nhập nameService");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double useArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí cho thuê");
        double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số người");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap kiểu thuê");
        String styleRental =scanner.nextLine();
        System.out.println("Nhập dịch vụ miễn phí");
        String freeService = scanner.nextLine();
        //String idFacility, String nameService, double useArea, double rentalCosts, int numberPeople,
        //                String styleRental, String freeService
        Room room = new Room(idFacility,nameService,useArea,rentalCosts,numberPeople,styleRental,freeService);

        facilityIntegerMap.put(room, 0);

        System.out.println("đã thêm mới room thành công");
    }

    public void displayListForMaintenance() {
        Set<Facility> mySet = facilityIntegerMap.keySet();
        for (Facility facility : mySet) {
            if (facilityIntegerMap.get(facility) > 5) {
                listFacilityForMaintenance.put(facility, facilityIntegerMap.get(facility));
                facilityIntegerMap.remove(facility);
            }
        }
        Set<Facility> mySetForMaintenance = listFacilityForMaintenance.keySet();
        for (Facility facilityForMaintenance : mySetForMaintenance) {
            System.out.println(facilityForMaintenance + ", number of uses = " + listFacilityForMaintenance.get(facilityForMaintenance));
        }
    }

}
