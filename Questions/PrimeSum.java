package Questions;

import java.util.Scanner;

public class PrimeSum {

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int sumPrime(int start, int end) {
        int sum = 0;
        for (int n = start; n <= end; n++) {
            if (isPrime(n)) {
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the start value: ");
        int start = scan.nextInt();
        System.out.print("Enter the end value: ");
        int end = scan.nextInt();

        if (start < 0 || end < 0) {
            System.out.println("Invalid range input");
        } else {
            System.out.println("Sum of prime numbers from " + start + " to " + end + " is: " + sumPrime(start, end));
        }

        scan.close();
    }
}
