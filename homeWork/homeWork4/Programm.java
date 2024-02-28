package homeWork.homeWork4;

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру интересующего действия: " + '\n');
        System.out.println("1. Посчитать площадь прямоугольника");
        System.out.println("2. Посчитать площадь круга");
        System.out.println("3. Посчитать площадь треугольника");
        System.out.println("4. Закончить выполнять программу" + '\n');
        if (scanner.hasNextInt()) {
            int action = scanner.nextInt();
            if (action <= 0 || action > 4) {
                System.out.println("Нет такой цифры");
            }
            switch (action) {
                case 1 -> {
                    System.out.print("Введите длинну прямоугольника: ");
                    if (scanner.hasNextDouble()) {
                        double length = scanner.nextDouble();
                        System.out.print("Введите ширину прямоугольника: ");
                        double width = scanner.nextDouble();
                        System.out.println(length * width + " - площадь прямоугольника");
                    } else {
                        System.out.println("Что-то пошло не так...");
                    }
                }
                case 2 -> {
                    System.out.print("Введите радиус круга: ");
                    if (scanner.hasNextDouble()) {
                        double radius = scanner.nextDouble();
                        System.out.println(3.14 * (radius * radius) + " - площадь круга");
                    } else {
                        System.out.println("Что-то пошло не так...");
                    }
                }
                case 3 -> {
                    System.out.print("Введите размер первой стороны треугольника - ");
                    if (scanner.hasNextDouble()) {
                        double a = scanner.nextDouble();
                        System.out.print("Введите размер второй стороны треугольника - ");
                        double b = scanner.nextDouble();
                        System.out.print("Введите размер третьей стороны треугольника - ");
                        double c = scanner.nextDouble();
                        if (a + b <= c || a + c <= b || b + c <= a)
                            System.out.println("Треугольника не существует");
                        else {
                            System.out.println((a * b * c) / 2 + " - площадь треугольника");
                        }
                    } else {
                        System.out.println("Что-то пошло не так...");
                    }
                }
                case 4 -> {
                    System.out.println("Вы вышли из программы");
                }
            }
        } else {
            System.out.println("Что-то пошло не так...");
        }

    }
}
