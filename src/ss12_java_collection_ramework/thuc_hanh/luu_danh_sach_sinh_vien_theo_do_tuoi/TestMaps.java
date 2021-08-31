package ss12_java_collection_ramework.thuc_hanh.luu_danh_sach_sinh_vien_theo_do_tuoi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class TestMaps {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Thanh", 30);
        hashMap.put("Huy", 31);
        hashMap.put("Đông", 29);
        hashMap.put("Anh", 29);
        hashMap.put("Hòa", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Thiện", 30);
        linkedHashMap.put("Sang", 31);
        linkedHashMap.put("Tân", 29);
        linkedHashMap.put("Phước", 29);
        System.out.println("\nThe age for " + "Tân is " + linkedHashMap.get("Tân"));
    }
}
