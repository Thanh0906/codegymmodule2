package casestudy.sevices;

import casestudy.models.Booking;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements IBookingService {
    private static Set<Booking> listBooking = new TreeSet<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addList() {
        System.out.println("Nhập idBoking");
        String idBooking =scanner.nextLine();
        System.out.println("Nhập ngày bắt đầu");
        String startDate =scanner.nextLine();
        System.out.println("Nhập ngày kết thúc");
        String endDate =scanner.nextLine();
        System.out.println("Nhập mã khách hàng");
        String idCustomer =scanner.nextLine();
        System.out.println("Nhập tên dịch vụ");
        String nameServices =scanner.nextLine();
        System.out.println("Nhập loại dịch vụ");
        String servicesType =scanner.nextLine();

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
}
