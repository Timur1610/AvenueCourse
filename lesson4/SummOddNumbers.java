package lesson4;

import java.util.Scanner;

public class SummOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int count = scanner.nextInt();
        int[] nums = new int[count];
        int result = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Введите число ");
            nums[i] = scanner.nextInt();
        }
        for (int i = 1; i < count; i+=2) {
            result = result + nums[i];
            System.out.println(result);
        }
        System.out.println("Конечный результат - " + result );
    }
}
