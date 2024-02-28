package lesson5;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число");
        double num2 = scanner.nextDouble();
        double result = 0;

        System.out.println("Выберите необходимую операцию: ");
        System.out.println("1.Сложение");
        System.out.println("2.Вычитание");
        System.out.println("3.Умножение");
        System.out.println("4.Деление");
        int action = scanner.nextInt();
        if (action < 1 || action > 4) {
            System.out.println("Неверный выбор операции");
        } else {
            switch (action) {
                case 1:
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println(result);
                    break;
            }
        }
    }
}
