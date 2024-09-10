package Questions;

import java.util.Scanner;

public class Recursion {
    static int recurSum(int N) {
        if (N > 0) {
            return N + recurSum(N - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int N = scan.nextInt();
        scan.close();
        System.out.println("Sum of all N numbers is : " + recurSum(N));
    }
}
