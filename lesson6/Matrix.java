package lesson6;

public class Matrix {
    public static void main(String[] args) {
        createMatrix(3,4);
    }
    public static void createMatrix(int x, int y){
        int[][] arr = new int[x][y];
        int start = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = start;
                start++;
            }
        }
        printMatrix(arr);
    }

    public static void printMatrix(int[][] arr) {
        for (int[]massieve:arr) {
            for (int temp: massieve) {
                System.out.print(temp + "; " );
            }
            System.out.println();
        }
    }
}

