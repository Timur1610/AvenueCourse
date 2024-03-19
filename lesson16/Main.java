package lesson16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите уровень сложности: ");
        System.out.println("1. Лёгкий");
        System.out.println("2. Средний");
        System.out.println("3. Тяжелый");

        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        if (level >= 1 && level <= 3) {
            MinerFields minerFields = new MinerFields(level);
            minerFields.addRandomMines();
            minerFields.countAndAddNums();
            minerFields.printField();
            while (minerFields.step()){
                minerFields.printField();
            }


        } else {
            System.out.println("Вы ввели некорректную операцию");
        }
    }
}
