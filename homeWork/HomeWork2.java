package homeWork;


public class HomeWork2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for (int i = 0; i < arr.length; i+=2) {
            System.out.println(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }



        String text = "Я буду учиться лучше";
        String[] parts = text.split(" ");

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
        for (int i = parts.length - 1; i >= 0; i--) {
            System.out.println(parts[i]);
        }





    }
}
