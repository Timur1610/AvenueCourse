package lesson4;

public class MultiArray {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{12,13,34,54},{23,24,45,46}};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }
    }
}
