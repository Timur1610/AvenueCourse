package homeWork.homeWork6.task3;

import java.util.Scanner;

public class Bulb implements Light {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void burn(boolean isBurn) {
        if (isBurn) {
            System.out.println("Введите цвет света лампочки");
            if (scanner.hasNext()) {
                String color = scanner.next();
                System.out.printf("Лампочка горит цветом - %s. Выключить лампу?\n", color);
                System.out.println("Введите слово \"да\" или \"нет\"");
                if (scanner.hasNext()) {
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("да")) {
                        System.out.println("Вы выключили лампу");
                    } else if (answer.equalsIgnoreCase("нет")) {
                        System.out.println("Лампа горит дальше");
                    } else {
                        System.out.println("Вы ввели что - то не то");
                    }
                } else {
                    System.out.println("Вы ввели что - то не то");
                }
            } else {
                System.out.println("Вы ввели что-то не то");
            }
        } else {
            System.out.println("Лампа не горит, включить?");
            System.out.println("Введите слово \"да\" или \"нет\"");
            if (scanner.hasNext()) {
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("да")) {
                    System.out.println("Введите цвет света лампочки");
                    String color = scanner.next();
                    System.out.printf("Вы включили лампу, теперь она горит цветом - %s\n", color);
                } else if (answer.equalsIgnoreCase("нет")) {
                    System.out.println("Лампа не горит");
                } else {
                    System.out.println("Вы ввели что - то не то");
                }
            } else {
                System.out.println("Вы ввели что - то не то");
            }
        }
    }
}
