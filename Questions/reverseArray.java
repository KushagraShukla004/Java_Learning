package Questions;

import java.util.Scanner;

public class reverseArray {

    static void display(int size, int[] number) {
        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");
        }
    }

    static void reverse(int size, int[] number) {
        for (int i = 0; i < size; i++) {
            System.out.print(number[size - i - 1] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] number = new int[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            number[i] = scan.nextInt();
        }
        scan.close();
        System.out.println("\nThe array is: ");
        display(size, number);
        System.out.println("\nThe reverse of the array is: ");
        reverse(size, number);
    }
}
