package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        // int swapCount = 0;
        boolean isSwap;
        for (int i = 0; i < arr.length - 1; i++) {
            isSwap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            // so we know that if even one swap has been performed then the value of isSwap
            // will be true then that means array is not sorted yet.
            // as soon as isSwap remains false after the end of iteration, code knows that
            // array is sorted so, no iteration required. Hence, we break the whole loop.
            if (isSwap == false) {
                break;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements (comma-separated): ");
        String input = scanner.nextLine();

        String[] strArray = input.split(",");
        int[] arr = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i].trim());
        }
        System.out.println("Parsed array: " + Arrays.toString(arr));
        scanner.close();

        bubbleSort(arr);
    }
}
