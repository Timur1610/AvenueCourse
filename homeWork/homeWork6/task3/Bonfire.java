package homeWork.homeWork6.task3;

import java.util.Scanner;

public class Bonfire implements Light {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void burn(boolean isBurn) {
        if (isBurn) {
            System.out.println("Костер горит, потушить?");
            System.out.println("Введите слово \"да\" или \"нет\"");
            if (scanner.hasNext()) {
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("да")) {
                    System.out.println("Костер потушен");
                } else if (answer.equalsIgnoreCase("нет")) {
                    System.out.println("Костер горит дальше");
                } else {
                    System.out.println("Вы ввели что - то не то");
                }
            } else {
                System.out.println("Вы ввели что - то не то");
            }
        } else {
            System.out.println("Костер не горит, зажечь?");
            System.out.println("Введите слово \"да\" или \"нет\"");
            if (scanner.hasNext()) {
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("да")) {
                    System.out.println("Костер зажгли");
                } else if (answer.equalsIgnoreCase("нет")) {
                    System.out.println("Костер не горит");
                } else {
                    System.out.println("Вы ввели что - то не то");
                }
            } else {
                System.out.println("Вы ввели что - то не то");
            }
        }
    }
}

