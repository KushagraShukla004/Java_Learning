package Questions;

import java.util.Arrays;
//Using Sieve of Eratosthenes 

// LeetCode 204. Count Primes
public class PrimeRangeOptimized {
    public static void printPrimes(int n) {
        // Step 1: Create a boolean array for marking primes
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Initially, assume all numbers are prime
        isPrime[0] = false; // 0 is not prime
        isPrime[1] = false; // 1 is not prime

        // MOST IMPORTANT STEP: this is where the main logic is👇

        // Step 2: Mark multiples of each number starting from 2
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Mark all multiples of p as non-prime

                // i=p*p because we want multiples of p
                // example: p=2, then multiple of 2 are p*2 (i.e. p only), so
                // i=p*p = 2*2 = 4 ;
                // then for next multiple we can just add p to the i
                // therefore, i += p (i = i+p)
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Step 3: Print all prime numbers
        System.out.print("Prime numbers up to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 50; // Change this value to test with a different range
        printPrimes(n);
    }
}
