package lesson13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Anton");
        hashMap.put(2, "Albert");
        hashMap.put(4, "Oleg");
        hashMap.put(3, "Valera");
        hashMap.put(5, "schoolBag");
        System.out.println(hashMap);
        System.out.println(hashMap.get(3));
        Set<Integer> keys = hashMap.keySet();
        System.out.println(keys);
        System.out.println();
        hashMap.replace(5, "Timur");
        System.out.println(hashMap);
        hashMap.remove(4);
        hashMap.remove(5);
        System.out.println(hashMap);
        hashMap.put(4,"Zheny");
        hashMap.put(5,"Alex");
        System.out.println(hashMap);
        for (Map.Entry<Integer, String> temp : hashMap.entrySet()) {
            System.out.println(temp);
        }

    }
}
