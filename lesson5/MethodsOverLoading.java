package lesson5;

public class MethodsOverLoading {
    public static void main(String[] args) {
        int num = sumOfNumbers(12, 53);
        System.out.println(num);
        double result = sumOfNumbers(12, 34, 67) + num;
        System.out.println(result);
        sumOfNumbers(12,45,23.6);


    }

    static int sumOfNumbers(int num1, int num2) {
        int result = 0;
        result = num1 + num2;
//        System.out.println(result);
        return result;
    }

    static int sumOfNumbers(int num1, int num2, int num3) {
        int result = 0;
        result = num1 + num2 + num3;
//        System.out.println(result);
        return result;
    }

    static void sumOfNumbers(int num1, int num2, double num3) {
        double result = num1 + num2 + num3;
        System.out.println(result);
    }

    static void sumOfNumbers(double num1, String str, int num3) {
        double result = num1 + num3;
        System.out.println(str + " " + result);
    }
}
