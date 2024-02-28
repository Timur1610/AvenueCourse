package lesson6;

public class Rhomb {
    public static void main(String[] args) {
        int num = 1; // пометил свой центр
        for (int i = -num; i <= num; i++) {
            for (int j = -num; j <= num; j++) {
                int num1 = Math.abs(i) + Math.abs(j);
                if (num1 == num){
                    System.out.print("x");
                } else if (num1 > num && (i + j) % 2 != 0 || Math.abs(i) == num || Math.abs(j) == num) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("x");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
