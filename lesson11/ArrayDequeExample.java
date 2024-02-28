package lesson11;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Timur");
        arrayDeque.add("Marat");
        arrayDeque.add("Albert");
        arrayDeque.add("Vladimir");
        arrayDeque.add("Petya");
        System.out.println(arrayDeque);
        arrayDeque.addFirst("Elephant");
        System.out.println(arrayDeque);
        arrayDeque.addLast("Mouse");
        System.out.println(arrayDeque);
        arrayDeque.add("Marat");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque);
        System.out.println();

        while (arrayDeque.peek() != null){
            System.out.println(arrayDeque.pop());
            System.out.println(arrayDeque);
        }
    }
}
