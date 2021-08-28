package ss10_list.bai_tap.trien_khai_phuong_thuc_cua_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList listInteger = new MyList();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);
        //   listInteger.add(9);
        System.out.println("list :");
        listInteger.display();
        System.out.print("");

        //   listInteger.add(1, 7);
        //    System.out.println("sau khi them vao: ");
        //    listInteger.display();
        listInteger.remove(1);
        System.out.println("sau khi xoa");
        listInteger.display();
        System.out.println("Have 5: " + listInteger.contain(5)); // kiểm tra có giá trị hay không

    }
}
