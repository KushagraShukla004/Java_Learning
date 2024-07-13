package Arrays;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 integer numbers:");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("\nThe elements in array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        scan.close();
    }
}
