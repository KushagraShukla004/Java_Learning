package Patterns;

/*
Level-1
 1
 12
 123
 1234
 12345
 */

import java.util.*;

public class P11_RightNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int N = scan.nextInt();
        scan.close();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
