package homeWork.homeWork5;

public class Array {
    public static void main(String[] args) {
        int[] num = {699,-2, 8, 9, 3, 1 , -1, -88};
        int max = num[0];
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max){
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];

            }
        }
        System.out.println(max + " - максимальное число");
        System.out.println(min + " - минимальное число");

    }
}
