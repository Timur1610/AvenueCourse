package homeWork.homeWork4;

public class ChessBoard {
    public static void main(String[] args) {
        int[][] arr = new int[4][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 == 0) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" O ");
                }
            }
            System.out.println(" ");
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 != 0) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" O ");
                }
            }
            System.out.println(" ");
        }
    }
}
