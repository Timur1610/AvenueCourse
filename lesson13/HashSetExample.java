package lesson13;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Andro");
        hashSet.add("Vera");
        hashSet.add("Rox");
        hashSet.add("Max");
        hashSet.add("Sara");
        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println();
        boolean isAdded = hashSet.add("Max1");
        System.out.println(isAdded);
        System.out.println(hashSet.size());
        hashSet.remove("Rox");
        System.out.println(hashSet);

    }
}
