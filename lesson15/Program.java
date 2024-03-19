package lesson15;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double num1 = 12.4;
        System.out.println(Math.abs(num1));//меняет знак у числа
        System.out.println(Math.ceil(num1)); // округляет число в наибольшую сторону
        System.out.println(Math.floor(num1)); // округляет в наименьшую сторону
        System.out.println(Math.round(num1));

        int num2 = 12;
        int num3 = 45;
        System.out.println(Math.max(num2, num3)); // возвращает максимальное число из двух предоставленных
        System.out.println(Math.min(num2, num3)); // возвращает минимальное число из двух предоставленных

        System.out.println(Math.pow(2, 3)); // возводит число в степень, последнее число в скобках - степень

        double num4 = Math.random();
        System.out.println(num4); // возвращает число от 0 до 1
        System.out.println(Math.round(num4)); // округляет до ближайшего целого числа - либо в большую сторону, либо в меньшую

        System.out.println(Math.sqrt(3)); // возвращает ответ из квадратного корня

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        int radius = scanner.nextInt();
        //double s = 3.14 * radius * radius;
        int s = (int) (Math.PI* Math.pow(radius, 2));
        System.out.println(s);


    }
}
