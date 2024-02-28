package homeWork.homeWork5;

import java.util.Scanner;

public class Rhomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диагональ ромба");
        int diagonal = scanner.nextInt();
        int vertical = diagonal;
        int center = diagonal / 2;

        for (int i = 0; i < diagonal; i++) {
            for (int j = 0; j < vertical; j++) {
                if (i <= center) {
                    if (j >= center - i && j <= center + i) // Верхняя половина ромба
                        System.out.print("X");
                    else
                        System.out.print(" ");
                } else {
                    if (j >= center + i - diagonal + 1 && j <= center - i + diagonal - 1) // Нижняя половина ромба
                        System.out.print("X");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
