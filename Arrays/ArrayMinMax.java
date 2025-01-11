package Arrays;

import java.util.Arrays;

public class ArrayMinMax {

    public static void usingLoop(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        System.out.println("using Loop: " + Arrays.toString(arr));
        // [3,2,1,5,4] because the function(shortcut) where we have created shallow copy
        // is initialized AFTER this function hence, the shallow copy isn't made right
        // now.
        // but if we change order and initialize shortcut(arr) first then shallow copy
        // is made first hence, changes to original arr have been made. So, ans =
        // [1,2,3,4,5]
        for (int i = 0; i < arr.length; i++) {
            min = (arr[i] < min) ? arr[i] : min;
            max = (arr[i] > max) ? arr[i] : max;
        }
        System.out.print("Min: " + min);
        System.out.print(" Max: " + max);
    }

    public static void shortcut(int[] arr) {
        int[] arr1 = arr;
        // Shallow copy: The changes in arr1 will reflect in arr as well hence, arr will
        // be sorted as well.
        Arrays.sort(arr1);
        System.out.println("\nusing sort: " + Arrays.toString(arr)); // [1,2,3,4,5] eventhough arr={3,2,1,5,4}
        System.out.print("Min: " + arr1[0]);
        System.out.println(" Max: " + arr1[(arr.length) - 1]);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 4 };

        usingLoop(arr);
        shortcut(arr);
    }
}
