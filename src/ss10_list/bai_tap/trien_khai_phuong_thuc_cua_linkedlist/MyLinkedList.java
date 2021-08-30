package ss10_list.bai_tap.trien_khai_phuong_thuc_cua_linkedlist;


public class MyLinkedList<i, E> {
    public class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    private Node head;
    private int numNodes;
    public MyLinkedList(Object data){
        head = new Node(data);
    }
    public MyLinkedList(){

    }
    public <E> void add(int index, E element){
        Node temp =head;
        Node holder;
        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public <E> void addFirst(E element){
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }
    public <E> void addLast (E element) {
        Node temp = head;
        for (int i = 0; i < numNodes && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        temp.next.next = null;
        numNodes++;
    }
    public <E> E remove(int index){
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            for (int i = 0; i < numNodes && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
        }
        numNodes--;
        return (E) data;
    }
    public int size () {
        return numNodes;
    }
    public boolean remove (Object element) {
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }
    public <E> boolean contains(E element){
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        if (temp.data.equals(element)) {
            return true;
        }
        return false;
    }
    public <E> int indexOf(E element){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((E) temp.getData() == element) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    public <E> E get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public E getFirst () {
        return (E) head.data;
    }
    public E getLast () {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public void clear () {
        head = null;
        numNodes = 0;
    }
    public void printList () {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
