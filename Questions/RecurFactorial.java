package Questions;

import java.util.Scanner;

public class RecurFactorial {
    static int fact(int N) {
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = ans * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = scan.nextInt();
        scan.close();
        System.out.println("Factorial of " + N + " is: " + fact(N));
    }
}
