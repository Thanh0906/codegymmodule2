package ss10_list.bai_tap.trien_khai_phuong_thuc_cua_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size =0;
    private static final int DEFAULT_CAPACIT = 10;
    private Object elements[];
    public MyList(){
        elements = new  Object[DEFAULT_CAPACIT];
    }
    public MyList(int capacity){
        elements = new Object[capacity];

    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public <E> void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        if (index > size) {
            elements[size++] = e;
        } else {
            elements[size++] = elements[size];
            for (int i = size + 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
        }
    }
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }
    public int size(){
        return size;
    }
    public boolean contain(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) return true;
        }
        return false;
    }
    public String indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) return ("the index of " +e + " is: " +i );
        }
        return ("not found");
    }
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
    public void clear() {
        while (size != 0) {
            remove(size);
        }
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println("element " + i + ": " + elements[i]);
        }
    }

}
