package Questions;

import java.util.Scanner;

public class Trace {
    static int size;
    static int[][] arr = new int[size][size];

    static void display(int size) {
        System.out.println("Entered array is: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void CalcTrace() {
        System.out.println("Trace of the array is: ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        size = scan.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        display(size);
        scan.close();
        CalcTrace();
    }
}