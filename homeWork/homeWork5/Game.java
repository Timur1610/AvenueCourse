package homeWork.homeWork5;

import java.util.Random;
import java.util.Scanner;

/**
 * Написать программу, в который вы будете угадывать число.
 * На вход приходит диапазон из чисел и количество жизней.
 * Вам нужно угадать, какое число было загадано(оно у вас генерируется внутри программы случайным образом).
 * Если ваше число находится рядом от загаданного (+-2) то выведет соответствующее сообщение,
 * в противном случае выводит иное сообщение.
 * <p>
 * Например, загаданное число 12, вы ввели число 10 или 14, вам выведется сообщение,
 * что вы находитесь рядом. Если вы введете 7, выведет сообщение что вы не рядом.
 * Игра закончится, когда количество жизней будет = 0.
 * Вы будете играть, пока не напечатаете в консоли esc
 * (неважно каким регистром, он должен воспринять как ESC, Esc, esC ...)
 */
public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Диапазон: 0 - 11");
        System.out.println("Жизнь: 3");

        int life = 3;
        int rand = random.nextInt(11);

        System.out.print('\n' + "Попробуйте угадать рандомное число - ");

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if (num < 0 || num > 11) {
                System.out.printf("""
                        Вы ввели недопустимое число в диапазоне от 0 до 8, попробуйте еще раз
                        """);
                num = scanner.nextInt();
            }

            while (life > 0) {
                if (num == rand) {
                    System.out.println("Вы выиграли!");
                    rand = random.nextInt(11);
                    System.out.print('\n' + "Попробуйте угадать следующее рандомное число - ");
                    num = scanner.nextInt();
                    if (num < 0 || num > 11) {
                        System.out.printf("""
                                Вы ввели недопустимое число в диапазоне от 0 до 8, попробуйте еще раз
                                """);
                        num = scanner.nextInt();
                    }

                } else if (num - rand == 2 || num - rand == -2 || num - rand == 1 || num - rand == -1) {
                    System.out.println("Вы были рядом");
                    System.out.print("Попытайся угадать еще раз - ");
                    num = scanner.nextInt();
                    if (num < 0 || num > 11) {
                        System.out.printf("""
                                Вы ввели недопустимое число в диапазоне от 0 до 8, попробуйте еще раз
                                """);
                        num = scanner.nextInt();
                    }

                } else {
                    System.out.println("Вы проиграли" + '\n');
                    life--;
                    if (life > 0) {
                        System.out.println("Жизнь: " + life);
                        rand = random.nextInt(11);
                        System.out.print('\n' + "Попробуйте угадать следующее рандомное число - ");
                        num = scanner.nextInt();

                        if (num < 0 || num > 11) {
                            System.out.printf("""
                                    Вы ввели недопустимое число в диапазоне от 0 до 8, попробуйте еще раз
                                    """);
                            num = scanner.nextInt();
                        }

                    }
                }
                if (life == 0) {
                    System.out.printf("""
                            Ваши жизни закончились! Введите "esc" если хотите выйти из игры или "start" для новой игры
                            """);
                    String text = scanner.next();
                    if (text.equalsIgnoreCase("esc")) {
                        System.out.println("Вы вышли из игры");
                        return;
                    } else if (text.equalsIgnoreCase("start")) {
                        life = 3;
                        rand = random.nextInt(11);
                        System.out.print("Попробуйте угадать рандомное число - ");
                        num = scanner.nextInt();
                    } else {
                        System.out.println("Что-то пошло не так, попробуйте еще раз");
                        text = scanner.next();
                        if (text.equalsIgnoreCase("esc")) {
                            System.out.println("Вы вышли из игры");
                            return;
                        } else if (text.equalsIgnoreCase("start")) {
                            life = 3;
                            rand = random.nextInt(11);
                            System.out.print("Попробуйте угадать рандомное число - ");
                            num = scanner.nextInt();
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Нужно вводить числа в указанном диапазоне");
        }
    }
}
