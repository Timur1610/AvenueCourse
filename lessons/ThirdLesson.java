package lessons;

import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) {

//        for (int i = 1; i < 6; i++) {
//            System.out.println(i);
//        }

//        int num1 = 1;
//        while (num1 >= 10){
//            System.out.println(num1);
//            num1++;
//        }
//        System.out.println("Программа закончила работу");

//        int num2 = 1;
//        do {
//            System.out.println(num2);
//            num2++;
//        }while (num2 >= 10);

        //Ввести с консоли два числа, первое - начало, второе - конец. Нужно вывести все числа между этими двумя числами
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число");
//        int num1 = scanner.nextInt();
//        System.out.println("Введите второе число");
//        int num2 = scanner.nextInt();

//        if (num1 > num2){
//            System.out.println("Неправильно");
//        }else {
//            for (int i = num1; i <= num2 ; i++) {
//                System.out.println(i);
//            }
//        }

//        if (num1 > num2){
//            System.out.println("Неправильно");
//        }else {
//            while (num1 <= num2){
//                System.out.println(num1);
//                num1++;
//            }
//        }

//        if (num1 > num2){
//            System.out.println("Неправильно");
//        }else {
//            do {
//                System.out.println(num1);
//                num1++;
//            }while (num1 <= num2);
//        }

//        int nums [] = new int[5];
//        nums[0] = 11;
//        nums[1] = 12;
//        nums[2] = 13;
//        nums[3] = 14;
//        nums[4] = 15;
//        System.out.println(nums[1]);

//        int num1[] = {12, 34, 5, 23, 55};
//
////        for (int i = 0; i < num1.length; i++) {
////            System.out.println(num1[i]);
////        }
//        for (int i:num1) {
//            System.out.println(i); //for each - распечатывает конкретно элемент массива (i)
//        }

        int nums2 [] = {13, 67, -34, 78};
//        for (int i = 0; i < nums2.length; i++) {
//        if (nums2[i] > 0){
//            System.out.println("Положительное число - " + nums2[i]);
//        }else {
//            System.out.println("Отрицательное число - " + nums2[i]);
//        }

        for (int i: nums2) {
            if (i > 0){
                System.out.println("Положительное число - " + i);
            }else {
                System.out.println("Отрицательное число - " + i);
            }
        }

    }
}
