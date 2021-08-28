package ss10_list.bai_tap.trien_khai_phuong_thuc_cua_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList mylinkedList =new MyLinkedList(10);

        mylinkedList.addFirst(1);
        mylinkedList.addFirst(2);
        mylinkedList.addFirst(3);
        mylinkedList.addFirst(5);

        mylinkedList.add(4,4);
        mylinkedList.addLast(14);

        mylinkedList.remove(0);
        mylinkedList.printList();


    }
}
