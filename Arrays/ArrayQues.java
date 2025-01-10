package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQues {
    public static void printArray(int range, int[] arr) {
        System.out.print("By For Loop: ");
        for (int i = 0; i < range; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArrayForEach(int[] arr) {
        System.out.print("\nBy For-Each Loop: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void printArraytoString(int[] arr) {
        System.out.print("\nBy Arrays.toString() method: ");
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to enter? (max:20): ");
        int range = sc.nextInt();
        int[] arr = new int[range];
        System.out.println("Enter the number you want to add to the array: ");
        for (int i = 0; i < range; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(range, arr);
        printArrayForEach(arr);
        printArraytoString(arr);
        sc.close();
    }
}
