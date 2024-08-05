package Arrays.TwoD;

import java.util.Scanner;

public class jagged {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jagged[][] = new int[5][];
        jagged[0] = new int[5];
        jagged[1] = new int[3];
        jagged[2] = new int[4];
        jagged[3] = new int[6];
        jagged[4] = new int[3];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = scan.nextInt();
            }
        }
        System.out.println("Entered jagged array is: ");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
