package lesson15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//Посчитать произведение диагоналей для полученной матрицы
//В случае если произведения основной диагонали и побочной равны, то сохранить все элементы внутри ArrayList,
//иначе заполнить таблицу HashSet (будут сохранены только уникальные числа)
public class Matrix {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int matrixSize = scanner.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                int rnum = (int) (Math.random() * 10);
                matrix[i][j] = rnum;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        int productMain = 1;
        int productSecondary = 1;

        for (int i = 0; i < matrixSize; i++) {
            productMain *= matrix[i][i];
            productSecondary *= matrix[i][matrix[i].length - 1 -i];
        }
        System.out.println("Произведение основной диагонали = " + productMain);
        System.out.println("Произведение побочной диагонали = " + productSecondary);
        if (productMain == productSecondary){
            for (int i = 0; i < matrixSize; i++) {
                arrayList.add(matrix[i][i]);
            }
            for (int i = 0; i < matrixSize; i++) {
                arrayList.add(matrix[i][matrix[i].length - 1 -i]);
            }
        }
        else {
            for (int i = 0; i < matrixSize; i++) {
                hashSet.add(matrix[i][i]);
            }
            for (int i = 0; i < matrixSize; i++) {
              hashSet.add(matrix[i][matrix[i].length - 1 -i]);
            }
        }
        System.out.println("Это arrayList" + arrayList);
        System.out.println("Это hashSet" + hashSet);
    }
}
