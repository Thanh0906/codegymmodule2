package casestudy.sevices;

import casestudy.models.Booking;
import casestudy.models.person.Customer;
import casestudy.models.facility.Facility;
import casestudy.models.facility.Villa;
import casestudy.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    static Set<Booking> listBooking = new TreeSet<>(new BookingComparator());
    static Scanner scanner = new Scanner(System.in);
    static List<Customer>customerList = new ArrayList<>();
    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();


    //static {
    //        customerList.add(new Customer(1,"Thanh",26,"Male",134567897,
    //                "acb@gmail.com","vip","Đà nẵng"));
    //        customerList.add(new Customer(2,"xuyên",24,"FeMale",16489747,
    //                "acb@gmail.com","normal","Đà nẵng"));
    //        facilityIntegerMap.put(new Villa("1","villa 1",500,"Vip",2000000,10,
    //                "Week",100,4,4,100,"Thoáng mát"),0);
    //        facilityIntegerMap.put(new Villa("2","villa 2",350,"Normal",1000000,7,
    //                "Week",70,3,3,50,"Thoáng mát"),0);
    //    }

    public Set<Booking> sendBooking(){
        return listBooking;
    }
    @Override
    public void addList() {
        Customer customer = choseCustomer();//tạo đối tượng để hứng choseCustormer
        Facility facility = choseFacility();
        System.out.println("Nhập idBokking");
        String idBooking = scanner.nextLine();
        System.out.println("Nhập ngày bắt đầu");
        String startDate =scanner.nextLine();
        System.out.println("Nhập ngày kết thúc");
        String endDate =scanner.nextLine();
     //   Booking booking = new Booking(idBooking,startDate,endDate,customer,facility);
   //     listBooking.add(booking);
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
        while (true){
            for (Customer customer :customerList){
                if (id == customer.getId()){
                    return customer ;
                }
            }
            if (check){
                System.out.println("ban da nhap sai vui long nhap lai");
                id = Integer.parseInt(scanner.nextLine());

            }
        }
    }
    public static Facility choseFacility(){
        System.out.println("Danh sach dichj vu");
        for (Map.Entry<Facility,Integer>entry :facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }
        System.out.println("nhap id dich vu");
         boolean check = true;
        String id = scanner.nextLine();
        while (true){
            for (Map.Entry<Facility,Integer>entry :facilityIntegerMap.entrySet()){
                if (id.equals(entry.getKey().getIdFacility())){
                    check = false;
                    return entry.getKey();
                }
            }
            if (check){
                System.out.println("ban da nhap sai vui long nhap lai");
              id =scanner.nextLine();

            }
        }
    }

}
