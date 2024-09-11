package Questions;

import java.util.Scanner;

public class RecurFibonacci {
    static void fib(int N, int first, int second) {
        int current = 0;
        for (int i = 2; i <= N; i++) {
            current = second + first;
            first = second;
            second = current;
            System.out.print(current + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int N = scan.nextInt();
        scan.close();
        int first = 0, second = 1;
        System.out.println("Fibonacci series of range of " + N + " numbers: ");
        System.out.print(first + " " + second + " ");
        fib(N, first, second);
    }
}
