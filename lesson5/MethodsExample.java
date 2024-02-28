package lesson5;

import java.util.Scanner;

public class MethodsExample {
    public static void main(String[] args) {
        //printHello();
        //printBye();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение: ");
        String str = scanner.next();
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        System.out.println("Введите количество: ");
        int num1 = scanner.nextInt();
//        printAll(str, num, num1);
        sumOfNumbers(str, 12,num, num1);
    }
    static void printHello(){        // void - Метод, который ничего не возвращает
        System.out.println("Hello"); // () - параметры метода
    }
    static void printBye(){
        System.out.println("Bye");
    }
    static void printSomething(String str, int size){
        System.out.println(str);
        System.out.println(size);
    }
    static void printAll(String str, int num, int num1){
        printHello();
        printBye();
        printSomething(str, num);
    }

    static void sumOfNumbers(String str, int ...nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            result = result + nums[i];
        }
        System.out.println(result);
        System.out.println(str);

    }
}
