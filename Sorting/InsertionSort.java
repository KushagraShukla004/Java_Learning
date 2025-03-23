package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int temp = arr[i];
            // left pointer
            int LPT = i - 1;
            while (LPT >= 0 && arr[LPT] > temp) {
                arr[LPT + 1] = arr[LPT];
                LPT -= 1;
            }
            arr[LPT + 1] = temp;
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array in single line (comma-separated): ");
        String[] strArr = scan.nextLine().split(",");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i].trim());
        }
        System.out.println("Parsed arr: " + Arrays.toString(arr));

        scan.close();
        insertionSort(arr);
    }
}
