package casestudy.sevices;

import casestudy.models.Facility;
import casestudy.models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements IFacilityService {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
   //     Set<Facility> mySet = facilityIntegerMap.keySet();
     //   for (Facility facility : mySet) {
     //       System.out.println(facility + ",số sử dụng là :" + facilityIntegerMap.get(facility));
     //   }
        for (Map.Entry<Facility,Integer> element :facilityIntegerMap.entrySet()){
            System.out.println("Service" +element.getKey() + " số lần đã thuê" +element.getValue());
        }

    }


    @Override
    public void addNewVilla() {
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
        Villa villa = new Villa(nameService, useArea, roomStandard, rentalCosts, numberPeople, styleRental, livingRoomArea, bedRoomMaster, bedRoomSmall, poolArea, greenSpace);
        facilityIntegerMap.put(villa, 0);

        System.out.println("đã thêm mới villa thành công");

    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}
