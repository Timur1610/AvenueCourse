package lesson4;

import java.util.Scanner;

public class SumNambersFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последнее число: ");
        int count = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= count; i++) {
            result = result + i;
            System.out.println(result);
        }
        System.out.println("Конечный результат - " + result);
    }
}
