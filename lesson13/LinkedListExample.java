package lesson13;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("Anton");
//        linkedList.add("Oleg");
//        linkedList.add("Petr");
//        linkedList.add("Samat");
//        linkedList.addLast("Rinat");
//        linkedList.addFirst("Amir");
//        linkedList.add(2, "Timur");
//        System.out.println(linkedList);
//        System.out.println(linkedList.get(2));
//        System.out.println(linkedList.getLast());
//        System.out.println(linkedList.getFirst());
//        System.out.println();
//        for (String s : linkedList) {
//            System.out.println(s);
//        }
////        linkedList.remove();
//        linkedList.removeFirst();
//        linkedList.removeLast();
//
//        System.out.println(linkedList);

        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Rinat"));
        people.add(new Person("Andrey"));
        people.add(new Person("Timur"));
        people.add(new Person("Oleg"));
        people.add(new Person("Sammat"));
        people.add(new Person("Olya"));
        people.add(3, new Person("Sergey"));
        System.out.println(people);
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
