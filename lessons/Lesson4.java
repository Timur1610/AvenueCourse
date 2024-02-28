package lessons;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве");
        int count = scanner.nextInt();
        int[] nums = new int[count];

//        System.out.println("Введите первое число");
//        nums [0] = scanner.nextInt();
//        System.out.println("Введите второе число");
//        nums [1] = scanner.nextInt();
//        System.out.println("Введите третье число");
//        nums [3] = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Введите число № " + i);
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


    }
}
