package casestudy.sevices.impl;

import casestudy.models.facility.Facility;
import casestudy.models.facility.House;
import casestudy.models.facility.Room;
import casestudy.models.facility.Villa;
import casestudy.sevices.IFacilityService;
import casestudy.utils.ReadAndWrite;
import casestudy.utils.Validation;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    //hiển thị danh sách facility, thêm mới facility, hiển thị danh sách facility cần bảo trì.
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
   // Map<Facility, Integer> listFacilityMaintenance = new LinkedHashMap();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addList() {
        try {
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

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void displayList() {
        List<House> houses = ReadAndWrite.getListHoFromCSV("src\\casestudy\\data\\facility\\house.csv");
        List<Room> rooms = ReadAndWrite.getListRoFromCSV("src\\casestudy\\data\\facility\\room.csv");
        List<Villa> villas = ReadAndWrite.getListVilFromCSV("src\\casestudy\\data\\facility\\villa.csv");
        System.out.println("List Houses: ");
        for (int i = 0; i < houses.size(); i++) {
            System.out.println(i + 1 + ". " + houses.get(i));
        }
        System.out.println("List Rooms: ");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(i + 1 + ". " + rooms.get(i));
        }
        System.out.println("List Villas: ");
        for (int i = 0; i < villas.size(); i++) {
            System.out.println(i + 1 + ". " + villas.get(i));
        }

    }

    @Override
    public void editList() {

    }

    public void addNewVilla() {
        try {
            System.out.println("Enter idService");
            String idService = Validation.inputIdService("Vl");
            System.out.println("Enter nameService");
            String nameService = Validation.inputNameService();
            System.out.println("Enter useArea");
            double useArea = Validation.inputUseArea();
            System.out.println("Enter rentalCosts");
            double rentalCosts = Validation.inputDouble();
            System.out.println("Enter numberPeople");
            int numberPeople = Validation.inputNumberPeople();
            System.out.println("Enter styleRental");
            String styleRental = scanner.nextLine();
            System.out.println("Enter roomStandard");
            String roomStandard = scanner.nextLine();
            System.out.println("Enter poolArea");
            double poolArea = Validation.inputUseArea();
            System.out.println("Enter numberFloors");
            int numberFloors =Validation.inputNumberFloors();
            Villa villa = new Villa(idService,nameService,useArea,rentalCosts,numberPeople,
                    styleRental,roomStandard,poolArea,numberFloors);
            List<Villa> villaList = new ArrayList<>();
            villaList.add(villa);
            ReadAndWrite.writeListVilCSV( villaList ,"src\\casestudy\\data\\facility\\villa.csv",true);
            facilityIntegerMap.put(villa,0);
            ReadAndWrite.writeListFacCSV(facilityIntegerMap,"src\\casestudy\\data\\facility\\facilityMaintenance.csv",true);
            System.out.println("New more success");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void addNewHouse() {
        try {
            System.out.println("Enter idService");
            String idService = Validation.inputIdService("HO");
            System.out.println("Enter nameService");
            String nameService = Validation.inputNameService();
            System.out.println("Enter useArea");
            double useArea = Validation.inputUseArea();
            System.out.println("Enter rentalCosts");
            double rentalCosts = Validation.inputDouble();
            System.out.println("Enter numberPeople");
            int numberPeople = Validation.inputNumberPeople();
            System.out.println("Enter styleRental");
            String styleRental = scanner.nextLine();
            System.out.println("Enter roomStandard");
            String roomStandard = scanner.nextLine();
            System.out.println("Enter numberFloors");
            int numberFloors =Validation.inputNumberFloors();
            House house = new House(idService,nameService,useArea,rentalCosts,numberPeople,styleRental,roomStandard,numberFloors);
            List<House> houses = new ArrayList<>();
            houses.add(house);
            ReadAndWrite.writeListHoCSV(houses,"src\\data\\House.csv",true);
            facilityIntegerMap.put(house, 0);
            ReadAndWrite.writeListFacCSV(facilityIntegerMap,"src\\data\\FacilityMaintenance.csv",true);
            System.out.println("New more success");
            } catch (Exception e) {
            e.printStackTrace();
        }

        }



    public void addNewRoom() {
        try {
            System.out.println("Enter idService");
            String idService =Validation.inputIdService("RO");
            System.out.println("Enter nameService");
            String nameService = Validation.inputNameService();
            System.out.println("Enter useArea");
            double useArea = Validation.inputUseArea();
            System.out.println("Enter rentalCosts");
            double rentalCosts = Validation.inputDouble();
            System.out.println("Enter numberPeople");
            int numberPeople = Validation.inputNumberPeople();
            System.out.println("Enter styleRental");
            String styleRental = scanner.nextLine();
            System.out.println("Enter FreeService");
            String freeService = scanner.nextLine();
            Room room = new Room(idService,nameService,useArea,rentalCosts,numberPeople,styleRental,freeService);
            facilityIntegerMap.put(room, 0);
            List<Room> rooms = new ArrayList<>();
            rooms.add(room);
            ReadAndWrite.writeListRoCSV(rooms,"src\\casestudy\\data\\facility\\room.csv",true);
            ReadAndWrite.writeListFacCSV(facilityIntegerMap,"src\\casestudy\\data\\facility\\facilityMaintenance.csv",true);
            System.out.println("New more success");
            } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public void displayListForMaintenance() {
        List<String> listFacility = ReadAndWrite.readCSV("src\\casestudy\\data\\facility\\facilityMaintenance.csv");

        for (int i = 0; i < listFacility.size(); i++) {
            String[] string = listFacility.get(i).split(",");
            if(Integer.parseInt(string[2]) >= 5){
                System.out.println(i + 1 + ". " + listFacility.get(i));
            }

        }
    }

}
