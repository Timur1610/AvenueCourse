package homeWork.homeWork5;
import java.util.Scanner;

public class HappyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTriple = 0;
        int secondTriple = 0;
        int[] nums = new int[6];

        System.out.println("Введите числа");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            if (!(nums[i] < 7 && nums[i] > -1)) {
                System.out.println("Некорректно");
                return;
            }
        }

        for (int i = 0; i < 3; i++) {
            firstTriple = firstTriple + nums[i];
        }
        for (int i = 3; i < 6; i++) {
            secondTriple = secondTriple + nums[i];
        }

        if (firstTriple == secondTriple) {
            System.out.println("Счастливый билет!");
        } else {
            System.out.println("Билет не счастливый!");
        }
    }
}
