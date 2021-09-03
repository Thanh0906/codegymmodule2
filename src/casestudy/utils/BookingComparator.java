package casestudy.utils;

import casestudy.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;

public class BookingComparator  implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate starDate1 = LocalDate.parse(o1.getStartDate(),formatter);
        LocalDate starDate2 = LocalDate.parse(o2.getStartDate(),formatter);
        LocalDate endDate1 = LocalDate.parse(o2.getEndDate(),formatter);
        LocalDate endDate2 = LocalDate.parse(o2.getEndDate(),formatter);
        if (starDate1.compareTo(starDate2)<0){

        }
        return 0;
    }
}
