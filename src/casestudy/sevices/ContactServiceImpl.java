package casestudy.sevices;

import casestudy.models.Booking;
import casestudy.models.Contract;
import casestudy.models.person.Customer;

import java.util.*;

public class ContactServiceImpl implements IContactService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void addList() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("đang tạo hop dong cho Booking có thông tin " + booking.toString());
            System.out.println("đang tạo hop dong cho khach hang co thông tin " + customer.toString());
            System.out.println("nhập số hợp đồng");
            String numberContract = scanner.nextLine();
            System.out.println("nhập mã booking ");
            String idBooking = scanner.nextLine();
            System.out.println("nhập số tiền trả trước");
            double deposit = Double.parseDouble(scanner.nextLine());
            System.out.println("nhập số chi phí");
            double totalPayment = Double.parseDouble(scanner.nextLine());
            System.out.println("nhập số idcustomer");
            String idCustomer = scanner.nextLine();
            Contract contract = new Contract(numberContract,idBooking,deposit,totalPayment,idCustomer);
            contractList.add(contract);
            System.out.println("đã tạo hợp đồng thành công");
        }
    }

    @Override
    public void displayList() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }

    }

    @Override
    public void editList() {

    }
}
