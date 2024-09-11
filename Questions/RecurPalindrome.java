package Questions;

import java.util.Scanner;

//not optimized
public class RecurPalindrome {
    static String reverse(String N) {
        String rev = "";
        for (int i = 0; i < N.length(); i++) {
            rev = N.charAt(i) + rev;
        }
        return rev;
    }

    static void palindrome(String N) {
        if (N.equals(reverse(N))) {
            System.out.println(N + " is a Palindrome");
        } else {
            System.out.println(N + " is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String N = scan.nextLine();
        scan.close();
        palindrome(N);
    }
}
