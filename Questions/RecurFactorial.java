package Questions;

import java.util.Scanner;

public class RecurFactorial {
    static int fact(int N) {
        if (N == 0) {
            return 1;
        }
        return N * fact(N - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = scan.nextInt();
        scan.close();
        System.out.println("Factorial of " + N + " is: " + fact(N));
    }
}
