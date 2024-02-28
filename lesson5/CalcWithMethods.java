package lesson5;

import java.util.Scanner;

public class CalcWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число");
        double num2 = scanner.nextDouble();

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
                    sumOfNumbers(num1, num2);
                    break;
                case 2:
                    minusOfNumbers(num1, num2);
                    break;
                case 3:
                    multOfNumbers(num1,num2);
                    break;
                case 4:
                    divOfNumbers(num1,num2);
                    break;
            }
        }
    }
    static void sumOfNumbers(double num1, double num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
    static void minusOfNumbers(double num1, double num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    }
    static void multOfNumbers(double num1, double num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    }
    static void divOfNumbers(double num1, double num2){
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    }
}
