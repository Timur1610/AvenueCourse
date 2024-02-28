package homeWork.homeWork4;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        if (scanner.hasNextDouble()){
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        method(num1, num2);
        }else {
            System.out.println("Нужно вводить исключительно числа!");
        }
    }

    static void method(double num1, double num2) {
        if (num1 > num2) {
            multiplication(num1, num2);
        } else if (num1 < num2) {
            sum(num1, num2);
        } else {
            System.out.println("Привет!");
        }
    }

    static void multiplication(double num1, double num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    static void sum(double num1, double num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
