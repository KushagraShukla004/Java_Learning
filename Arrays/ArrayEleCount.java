package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEleCount {
    public static void countTarget(int size, int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        if (count == 1) {
            System.out.print(target + " occurs " + count + " time");
        } else {
            System.out.print(target + " occurs " + count + " times");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // iterate through each element and store its count
        System.out.print("Enter the number you need to check the count for: ");
        int target = sc.nextInt();
        countTarget(size, arr, target);
        sc.close();
        // we can use Collections.frequency(target, arr) but it only works for
        // ArrayList;
    }
}
