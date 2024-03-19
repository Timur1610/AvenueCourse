package lesson14;

import java.util.*;

public class Tasks {
    public static final String ESC = "esc";
    public static final String STOP = "stop";

    public static void main(String[] args) {
        task3();
    }

    /**
     * Заполнить хранилище данных с клавиатуры,
     * вводить будем до сих пор пока не введем слово esc любого регистра,
     * если размерность коллекции четная, то удалить все нечетные индексы,
     * в противном случае удалить все четные индексы
     * вывести на печать отсортированную коллекцию
     */
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            System.out.println("Введите имя: ");
            String str1 = scanner.next();
            System.out.println(str1);
            if (str1.equalsIgnoreCase(ESC)) {
                break;
            }
            arrayList.add(str1);
        }
        System.out.println(arrayList);
        if (arrayList.size() % 2 == 0) {
            for (int i = arrayList.size() - 1; i >= 0; i -= 2) {
                arrayList.remove(i);
            }
        } else {
            for (int i = arrayList.size() - 1; i >= 0; i -= 2) {
                arrayList.remove(i);
            }
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }


    /**
     * Создать уникальное хранилище, заполнить коллекцию, проверить на уникальность
     */
    public static void task2() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Антон");
        hashSet.add("Альберт");
        hashSet.add("Ольга");
        hashSet.add("Ваня");
        hashSet.add("Слава");
        hashSet.add("Енот");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String str = scanner.next();
        if (hashSet.contains(str)) {
            System.out.println("Имя уже существует");
        } else {
            System.out.println("Такого имени нет");
        }
    }

    /**
     * Создать map, заполнить значениями, пока не будет введено слово "stop",
     * если количество элементов в строке четное,
     * то добавить элемент в список even, иначе в список not even
     * в четном списке отсортировать все элементы по возрастанию
     */

    public static void task3() {
        HashMap<String, String> hashMap = new HashMap<>();
        ArrayList<String> even = new ArrayList<>();
        ArrayList<String> notEven = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите ключ: ");
            String index = scanner.next();
            if (index.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.print("Введите значение: ");
            String value = scanner.next();
            if (value.equalsIgnoreCase(STOP)) {
                break;
            }
            hashMap.put(index, value);
        }
        System.out.println(hashMap);
        for (Map.Entry<String, String> item : hashMap.entrySet()) {
            char[] charStr = item.getValue().toCharArray();
            if (charStr.length % 2 == 0) {
                even.add(item.getValue());
            } else {
                notEven.add(item.getValue());
            }
        }
        Collections.sort(even);
        System.out.println(even);
        System.out.println(notEven);
    }
}




