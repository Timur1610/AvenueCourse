package lesson6;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12,56,34,6,94,765,645};

        boolean isSorted = false;
        int buf;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]){
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
