package ss11_stack_queue.bai_tap.to_chuc_du_lieu_hop_li_demerging_sd_queue;

import ss11_stack_queue.bai_tap.trien_khai_quêu_sd_lien_ket_vong.Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class DemergingUseQueue{
    private static final String MALE ="male";
    private static final String FEMALE ="female";

    public static void main(String[] args) {
        Queue<Person> queueMale = new Queue<Person>();
        Queue<Person> queueFemale = new Queue<Person>();
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("thanh","male",24));
        listPerson.add(new Person("huy","male",21));
        listPerson.add(new Person("xuyen","female",23));
        listPerson.add(new Person("y","female",22));
        Collections.sort(listPerson);
        System.out.println("danh sách sắp xếp theo tuổi" + listPerson);

    }

}
