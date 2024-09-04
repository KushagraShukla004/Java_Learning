package Questions;

import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = scan.nextInt();
        scan.close();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count += 1;
            }
        }
        System.out.println("Number of Factors: " + count);
        if (count == 2) {
            System.out.println(N + " is a Prime Number.");
        } else {
            System.out.println(N + " is not a Prime Number.");
        }
    }
}