package Arrays.TwoD;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[2][2];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Entered array is: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
