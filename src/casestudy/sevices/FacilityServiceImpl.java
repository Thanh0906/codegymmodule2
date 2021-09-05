package casestudy.sevices;

import casestudy.models.Facility;
import casestudy.models.House;
import casestudy.models.Room;
import casestudy.models.Villa;

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

    public void addNewVilla() {
        System.out.println("Nhập id");
        String idFacility = scanner.nextLine();
        System.out.println("Nhập loại dịch vụ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double useArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập tiêu chuẩn phonngf");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập chi phí cho thuê");
        double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số người");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        String styleRental = scanner.nextLine();
        System.out.println("Nhập diện tích phòng");
        double livingRoomArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số phonhf ngủ lớn");
        int bedRoomMaster = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số phòng ngủ nhỏ");
        int bedRoomSmall = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập diện tích hồ bơi");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập không gian xanh");
        String greenSpace = scanner.nextLine();

        Villa villa = new Villa(idFacility,nameService, useArea, roomStandard, rentalCosts, numberPeople, styleRental, livingRoomArea, bedRoomMaster, bedRoomSmall, poolArea, greenSpace);
        facilityIntegerMap.put(villa, 1);

        System.out.println("đã thêm mới villa thành công");

    }

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
        System.out.println("nhâp số tầng");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        System.out.println("nhâp số phòng ngủ lớn");
        int bedRoomMaster = Integer.parseInt(scanner.nextLine());
        System.out.println("nhâp số phòng ngủ nhỏ");
        int bedRoomSmall = Integer.parseInt(scanner.nextLine());
        System.out.println("nhâp số phòng bếp");
        int kitchen = Integer.parseInt(scanner.nextLine());

        House house = new House(idFacility,nameService, useArea, rentalCosts, numberPeople, numberFloor, bedRoomMaster, bedRoomSmall, kitchen);
        facilityIntegerMap.put(house, 1);

        System.out.println("đã thêm mới villa thành công");

    }

    public void addNewRoom() {
        System.out.println("Nhập loại dịch vụ");
        String idFacility = scanner.nextLine();
        System.out.println("Nhập loại dịch vụ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double useArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí cho thuê");
        double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số người");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số của sổ của phòng");
        int numberWindow = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số giường ngủ");
        int numberBed = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập dịch vụ miễn phí");
        String freeService = scanner.nextLine();
        Room room = new Room(idFacility,nameService, useArea, rentalCosts, numberPeople, numberWindow, numberBed, freeService);

        facilityIntegerMap.put(room, 1);

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
