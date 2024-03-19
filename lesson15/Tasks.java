package lesson15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(task3(task1()));
    }

    /**
     * Необходимо создать массив из 10 элементов,
     * ячейки массива должны быть заполнены случайными целыми числами от 0 до 100
     */
    public static ArrayList<Integer> task1(){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            int rNum = (int) (Math.random() * 100); // 100 - конечное значение диапазона
            randomNumbers[i]=rNum;
        }
        for (int num : randomNumbers) {
            //System.out.println(num);
            if (num > 50){
                arrayList1.add(num);
            } else if (num < 50) {
                arrayList2.add(num);
            }
        }

        //System.out.println(arrayList1);
        //System.out.println(arrayList2);
        if (arrayList1.size() > arrayList2.size()){
            return arrayList1;
        }else {
            return arrayList2;
        }

    }


    //Взять элементы под четными числами возвести в квадрат и добавить их обратно в список
    public static ArrayList<Integer> task2(ArrayList<Integer> arrayList){

        int num;
        Collections.sort(arrayList);
        System.out.println(arrayList);
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i-=2) {
            num = (int) Math.pow(arrayList.get(i), 2);
            arrayList.set(i, num);
        }
        System.out.println(arrayList);
        return arrayList;

    }

    //Заполнить мапу значениями из полученного списка ArrayList
    //Получить доступ ко всем нечетным ключам и вычислить квадратный корень из значения,
    // который находится под указанным ключом
    //Взять полученные результаты, добавить внутрь нового ArrayList и вернуть в качестве результата работы программы
    //Вывести полученный список внутри метода main
    public static ArrayList<Integer> task3(ArrayList<Integer>arrayList){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            if (i % 2 == 0){
                hashMap.put(i, arrayList.get(i));
            }else {
                hashMap.put(i, (int) Math.sqrt(arrayList.get(i)));
            }
        }
        System.out.println("Результат " + hashMap);
        arrayList.removeAll(arrayList);
        for (Map.Entry<Integer, Integer> item: hashMap.entrySet()) {
            arrayList.add(item.getValue());
        }
//        System.out.println(arrayList);
        return arrayList;
    }

}
