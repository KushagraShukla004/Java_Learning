package Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] array = { 20, 42, 10, 32, 90, 60 };
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
