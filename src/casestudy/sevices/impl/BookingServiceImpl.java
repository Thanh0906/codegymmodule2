package casestudy.sevices.impl;

import casestudy.models.Booking;
import casestudy.models.Contract;
import casestudy.models.facility.Room;
import casestudy.models.facility.Villa;
import casestudy.models.person.Customer;
import casestudy.models.facility.Facility;
import casestudy.sevices.IBookingService;
import casestudy.utils.BookingComparator;
import casestudy.utils.ReadAndWrite;
import casestudy.utils.Validation;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> listBooking = new TreeSet<>(new BookingComparator());
    static Queue<Booking> queueBooking = new LinkedList<>();

//chưa xong
    @Override
    public void addList() {
        System.out.println("Enter idBokking");
        String idBooking = scanner.nextLine();
        System.out.println("Enter stardate(dd/mm/yyyy)");
        String startDate = Validation.inputDay();
        System.out.println("Enter enddate(dd/mm/yyyy)");
        String endDate = Validation.inputDay();
        System.out.println("Enter idCustomer");
        String idCustomer = scanner.nextLine();
        System.out.println("Enter nameService");
        String nameService = Validation.inputNameService();
        System.out.println("Enter idService");
        String idService = scanner.nextLine();
        Booking booking = new Booking(idBooking,startDate,endDate,idCustomer,nameService,idService);
        listBooking =ReadAndWrite.getListBookingFromCSV("src\\casestudy\\data\\listBooking.csv");
        listBooking.add(booking);
        ReadAndWrite.writeListBookingCSV(listBooking,"src\\casestudy\\data\\listBooking.csv",false);
        System.out.println("Thêm thành công");
    }

    @Override
    public void displayList() {
        listBooking = ReadAndWrite.getListBookingFromCSV("src\\casestudy\\data\\listBooking.csv");
        System.out.println("List booking: ");
        for (Booking booking : listBooking) {
            System.out.println(booking.toString());
        }

    }

    @Override
    public void editList() {

    }


}
