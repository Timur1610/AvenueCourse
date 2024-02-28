package lesson11;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Timur");
        arrayList.add("Marat");
        arrayList.add("Albert");
        arrayList.add("Vladimir");
        arrayList.add("Petya");
        arrayList.add(3,"Chponk");
        System.out.println(arrayList.get(3));
//        System.out.println(arrayList);

//        if (arrayList.contains("Vladimir")){
//            System.out.println("Это дневник Владимира");
//        }else {
//            System.out.println("Такого нет в классе");
//        }
//        System.out.println(arrayList);
////        arrayList.remove("Vladimir");
////        arrayList.remove(3);
//        arrayList.removeAll(arrayList);
//
        System.out.println(arrayList.size());

        System.out.println(arrayList.lastIndexOf("Marat"));


//        for (Object o : arrayList) {
//            System.out.println(o);
//        }

//        Object age = 12;
//        age = "nbv";
//        System.out.println(age);

//        Account<Integer> account = new Account<>(12, 900000000);
//        System.out.println(account.getId());
//
//        Account<String> account1 = new Account<>("qwe12", 435653);
//        System.out.println(account1.getId());
//
//        Account<String> account2 = new Account<>("34gr4", 535324);
//        int accountId = (int) account2.getId();
//        System.out.println(accountId);
    }
}
