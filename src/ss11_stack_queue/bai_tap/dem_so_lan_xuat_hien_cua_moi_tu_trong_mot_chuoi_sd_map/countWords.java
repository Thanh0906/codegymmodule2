package ss11_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_sd_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countWords {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 câu: ");
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        map.put(array[0], 0);
        for (String string :array) {
            string =string.toLowerCase();
            int count = 1;
            for (String string1 : map.keySet()) {
                if (string1.equals(string)) {
                    count = map.get(string1) +1;
                }
            }
            map.put(string, count);
        }
        System.out.println(map);
    }

}

