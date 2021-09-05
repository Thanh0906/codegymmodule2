package casestudy.sevices;

import casestudy.models.Booking;
import casestudy.models.Customer;
import casestudy.models.Facility;
import casestudy.models.Villa;
import casestudy.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    static Set<Booking> listBooking = new TreeSet<>(new BookingComparator());
    static Scanner scanner = new Scanner(System.in);
    static List<Customer>customerList = new ArrayList<>();
    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        customerList.add(new Customer(1,"thanh",23,"male",1234564650,
                "ngccthanh@gmail.com","vip","DN"));
        customerList.add(new Customer(2,"huy",24,"male",1234564650,
                "ngccthanh@gmail.com","vip","DN"));
        customerList.add(new Customer(4,"dong",25,"male",1234564650,
                "ngccthanh@gmail.com","vip","DN"));
        facilityIntegerMap.put(new Villa("2","Villa 1",300,"Normal",
        150, 10,"day",
        50, 3, 4,
        60, "Thoang mat"),0);
        facilityIntegerMap.put(new Villa("1","Villa 2",400,"Vip",
                250, 10,"day",
                100, 5, 5,
                100, "Thoang mat"),0);
    }

    @Override
    public void addList() {

        int id =1;
        if (!listBooking.isEmpty()){
            id=listBooking.size();
        }
        Customer customer = choseCustomer();
        Facility facility = choseFacility();
        System.out.println("Nhập ngày bắt đầu");
        String startDate =scanner.nextLine();
        System.out.println("Nhập ngày kết thúc");
        String endDate =scanner.nextLine();
        Booking booking = new Booking(id,startDate,endDate,customer,facility);
        listBooking.add(booking);
        System.out.println("ddax them moi thanh cong");


    }

    @Override
    public void displayList() {
        for (Booking booking : listBooking){
            System.out.println(booking.toString());
        }

    }

    @Override
    public void editList() {

    }
    public static Customer choseCustomer(){
        System.out.println("Danh sach khac hang");
        for (Customer customer :customerList){
            System.out.println(customer.toString());
        }
        System.out.println("nhap id khac hang");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check){
            for (Customer customer :customerList){
                if (id == customer.getId()){
                    check = false;
                    return customer ;
                }
            }
            if (check){
                System.out.println("ban da nhap sai vui long nhap lai");
                id = Integer.parseInt(scanner.nextLine());

            }
        }
        return null;
    }
    public static Facility choseFacility(){
        System.out.println("Danh sach dichj vu");
        for (Map.Entry<Facility,Integer>entry :facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }
        System.out.println("nhap id dich vu");
        boolean check = true;
       String id = scanner.nextLine();
        while (check){
            for (Map.Entry<Facility,Integer>entry :facilityIntegerMap.entrySet()){
                if (id.equals(entry.getKey().getIdFacility())){
                    check = false;
                    return entry.getKey() ;
                }
            }
            if (check){
                System.out.println("ban da nhap sai vui long nhap lai");
              id =scanner.nextLine();

            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
