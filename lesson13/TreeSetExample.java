package lesson13;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Andro");
        treeSet.add("Vera");
        treeSet.add("Rox");
        treeSet.add("Max");
        treeSet.add("Sara");
        treeSet.remove("Max");
        for (String s : treeSet) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        SortedSet<String> sortedSet = treeSet.subSet("Andro", "Sara");
        System.out.println(sortedSet);
        System.out.println(treeSet.higher("Max"));
        System.out.println();

        NavigableSet<String> navigableSet = treeSet.descendingSet();
        System.out.println(navigableSet);
        System.out.println();

        SortedSet<String> sortedSet1 = treeSet.headSet("Sara");
        System.out.println(sortedSet1);
        SortedSet<String> sortedSet2 = treeSet.tailSet("Sara");
        System.out.println(sortedSet2);
    }
}
