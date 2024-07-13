package Arrays;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter 10 integer numbers:");
            int[] arr = new int[20];
            for (int i = 0; i < 20; i++) {
                arr[i] = scan.nextInt();
            }
            int pos = 0, neg = 0, odd = 0, even = 0, zeroes = 0;
            for (int i = 0; i < 10; i++) {
                if (arr[i] > 0) {
                    pos += 1;
                }
                if (arr[i] % 2 == 0) {
                    even += 1;
                }
                if (arr[i] % 2 != 0) {
                    odd += 1;
                }
                if (arr[i] < 0) {
                    neg += 1;
                }
                if (arr[i] == 0) {
                    zeroes += 1;
                }
            }
            System.out.println("The number of Positive numbers are: " + pos);
            System.out.println("The number of Negitive numbers are: " + neg);
            System.out.println("The number of Odd numbers are: " + odd);
            System.out.println("The number of Even numbers are: " + even);
            System.out.println("The number of Zeroes numbers are: " + zeroes);
        }
    }
}
