package homeWork.homeWork4;

public class Rhombus {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j == 0 && i == 0) {
                    System.out.print("   ");
                } else if (j == 1 && i == 0) {
                    System.out.print("   ");
                } else if (j == 0 && i == 1) {
                    System.out.print("   ");
                } else if (j == 0 && i == 3) {
                    System.out.print("   ");
                } else if (j == 0 && i == 4) {
                    System.out.print("   ");
                } else if (j == 1 && i == 4) {
                    System.out.print("   ");
                } else if (j == 1 && i == 4) {
                    System.out.print("   ");
                } else if (j == 3 && i == 0) {
                    System.out.print("   ");
                } else if (j == 4 && i == 0) {
                    System.out.print("   ");
                } else if (j == 4 && i == 1) {
                    System.out.print("   ");
                } else if (j == 4 && i == 3) {
                    System.out.print("   ");
                } else if (j == 3 && i == 4) {
                    System.out.print("   ");
                } else if (j == 4 && i == 4) {
                    System.out.print("   ");
                } else {
                    System.out.print(" x ");
                }
            }
            System.out.println("   ");
        }
    }

}
