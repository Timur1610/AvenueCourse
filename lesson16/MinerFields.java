package lesson16;

import java.util.Scanner;
import java.util.TooManyListenersException;
import java.util.concurrent.ThreadLocalRandom;

public class MinerFields {
    private int[][] fields;
    private int mines = 0;
    private boolean[][] fieldToOpen;
    private int countClosedCellsToWin = 0;

    public MinerFields(int level) {
        System.out.println("Играем!");

        if (level == 1) {
            fields = new int[8][8];
            fieldToOpen = new boolean[8][8];
            mines = 10;
        }
        if (level == 2) {
            fields = new int[16][16];
            fieldToOpen = new boolean[16][16];
            mines = 20;
        }
        if (level == 3) {
            fields = new int[32][32];
            fieldToOpen = new boolean[32][32];
            mines = 30;
        }
    }

    public void addRandomMines() {
        for (int i = 0; i < mines; i++) {
            int row = ThreadLocalRandom.current().nextInt(1, fields.length - 1);
            int col = ThreadLocalRandom.current().nextInt(1, fields[0].length - 1);
            if (fields[row][col] != -1) {
                fields[row][col] = -1;
            } else {
                i--;
            }
        }
    }

    public void printField() {
        System.out.println("Полученное поле для игры: ");
        for (int i = 0; i < fields.length - 1; i++) {
            for (int j = 0; j < fields[0].length - 1; j++) {
                if (fieldToOpen[i][j] == true) {
                    System.out.print(" " + fields[i][j] + " ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public void countAndAddNums() {
        for (int i = 0; i < fields.length - 1; i++) {
            for (int j = 0; j < fields[0].length - 1; j++) {
                if (fields[i][j] == -1) {
                    if (fields[i - 1][j - 1] != -1) {
                        fields[i - 1][j - 1] += 1;
                    }
                    if (fields[i - 1][j] != -1) {
                        fields[i - 1][j] += 1;
                    }
                    if (fields[i - 1][j + 1] != -1) {
                        fields[i - 1][j + 1] += 1;
                    }
                    if (fields[i][j + 1] != -1) {
                        fields[i][j + 1] += 1;
                    }
                    if (fields[i + 1][j + 1] != -1) {
                        fields[i + 1][j + 1] += 1;
                    }
                    if (fields[i + 1][j] != -1) {
                        fields[i + 1][j] += 1;
                    }
                    if (fields[i + 1][j - 1] != -1) {
                        fields[i + 1][j - 1] += 1;
                    }
                    if (fields[i][j - 1] != -1) {
                        fields[i][j - 1] += 1;
                    }

                }
            }
        }
    }

    public boolean step() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        int row = scanner.nextInt();
        System.out.println("Введите столбец");
        int col = scanner.nextInt();

        if (row < 0 || row > fields.length - 1 || col < 0 || col > fields[0].length - 1) {
            System.out.println("Некорректный ввод");
            this.step();
        }
        if (fieldToOpen[row][col] == true) {
            System.out.println("Эта ячейка уже открыта");
            this.step();
        }
        if (fields[row][col] == -1) {
            System.out.println("Вы проиграли!");
            this.printEndGame();
            return false;
        } else {
            fieldToOpen[row][col] = true;
            return true;
        }
    }

    public void printEndGame() {
        System.out.println("Полученное поле для игры: ");
        for (int i = 0; i < fields.length - 1; i++) {
            for (int j = 0; j < fields[i].length - 1; j++) {
                if (fieldToOpen[i][j] == true || fields[i][j] == -1) {
                    System.out.print(fields[i][j] + " ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
