package Questions;

import java.util.*;

public class FactorsOptimized {
    static void Factors(int N) {
        // List is a java collection used to define an ordered collection(sequence)
        List<Integer> factors = new ArrayList<>();
        // we are checking uptil square root of N but since using java library (sqrt)
        // takes up some time so instead we are simply squaring i .
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                factors.add(i); // first half of factors
                if (i != N / i) {
                    factors.add(N / i); // second half of factors
                }
            }
        }
        System.out.println("The Factors of " + N + " are: " + factors);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = scan.nextInt();
        scan.close();
        Factors(N);
    }
}
