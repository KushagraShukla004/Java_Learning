package Patterns;

/*
 A
 AB
 ABC
 ABCD
 ABCDE
 */

import java.util.Scanner;

public class P13_RightAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int N = scan.nextInt();
        scan.close();
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                // ASCII value of A to Z is: 65 to 90
                // type casting to convert int into char
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }
}
