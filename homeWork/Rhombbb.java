package homeWork;

public class Rhombbb {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        char x = 'x';
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + x + " ");
                
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == 0 && j == 0) {
                    if (arr[i][j] == x) {
                        System.out.print(" ");
                    }
                    if (arr[i][j + 1] == x) {
                        System.out.print(" ");
                    }
                    if (arr[i + 1][j] == x) {
                        System.out.print(" ");
                    }
                }
                int lastI = arr.length - 1;
                if (i == lastI && j == 0) {
                    if (arr[i][j] == x) {
                        System.out.print(" ");
                    }
                    if (arr[i - 1][j] == x) {
                        System.out.print(" ");
                    }
                    if (arr[i][j + 1] == x) {
                        System.out.print(" ");
                    }
                }
                int lastJ = arr[i].length - 1;
                if (i == 0 && j == lastJ) {
                    if (arr[i][j] == x) {
                        System.out.print(" ");
                    }
                    if (arr[i][j - 1] == x) {
                        System.out.print(" ");
                    }
                    if (arr[i + 1][j] == x) {
                        System.out.print(" ");
                    }
                }
                if (i == lastI && j == lastJ) {
                    if (arr[i][j] == x) {
                        System.out.print(" ");
                    }
                    if (arr[i - 1][j] == x) {
                        System.out.print(" ");
                    }
                    if (arr[i][j - 1] == x) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
