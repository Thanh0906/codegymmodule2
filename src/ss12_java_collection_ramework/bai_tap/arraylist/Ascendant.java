package ss12_java_collection_ramework.bai_tap.arraylist;

import java.util.Comparator;

public class Ascendant implements Comparator<Product> {
    public int compare(Product o1,Product o2){
      if (o1.getValue()>o2.getValue()){
          return -1;
      }else {
          return 1;
      }
    }
}
