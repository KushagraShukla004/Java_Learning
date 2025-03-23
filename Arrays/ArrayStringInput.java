package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements (comma-separated): ");
        String input = scanner.nextLine();

        String[] strArray = input.split(",");
        int[] arr = new int[strArray.length];

        // The method Integer.parseInt(String[] strArray or String s) in Java is used to
        // convert a
        // string representation of a number into an integer (int type).
        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i].trim());
        }
        System.out.println("Parsed array: " + Arrays.toString(arr));

        scanner.close();
    }
}
