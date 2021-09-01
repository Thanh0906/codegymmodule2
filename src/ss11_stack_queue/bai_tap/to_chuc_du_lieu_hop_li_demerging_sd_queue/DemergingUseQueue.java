package ss11_stack_queue.bai_tap.to_chuc_du_lieu_hop_li_demerging_sd_queue;




import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingUseQueue {
    private static final String MALE = "male";
    private static final String FEMALE = "female";



    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();

        personList.add(new Person("Thanh", "male", LocalDate.of(1999, 6, 12)));
        personList.add(new Person("Huỳnh", "female", LocalDate.of(2000, 7, 11)));
        personList.add(new Person("Ngọc", "female", LocalDate.of(2001, 8, 14)));
        personList.add(new Person("Xuyến", "male", LocalDate.of(2002, 9, 13)));

        Queue<Person> male = new LinkedList<>();
        Queue<Person> female = new LinkedList<>();
        Collections.sort(personList);
        for (Person person : personList) {
            switch (person.getGender()) {
                case MALE:
                    male.add(person);
                    break;
                case FEMALE:
                    female.add(person);
                    break;
            }
        }
        ArrayList<Person> newPerson = new ArrayList<>();
        while (!female.isEmpty()) {
            newPerson.add(female.poll());
        }
        while (!male.isEmpty()) {
            newPerson.add(male.poll());
        }
        System.out.println("trước sắp xếp");
        System.out.println();
        for (Person person : personList) {
            System.out.println(person.toString());
        }

        System.out.println("sau khi sắp xếp ");
        System.out.println();
        for (Person person : newPerson) {
            System.out.println(person.toString());
        }
    }


}


