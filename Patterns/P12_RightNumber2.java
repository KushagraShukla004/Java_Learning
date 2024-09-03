package Patterns;

import java.util.Scanner;

/*
Level-2
 1
 22
 333
 4444
 55555
 */
public class P12_RightNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int N = scan.nextInt();
        scan.close();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
