package Questions;

import java.util.Scanner;

public class OptimizedRecurPalindrome {

    // Recursive function to check if the string is a palindrome
    static boolean isPalindrome(String N, int start, int end) {
        // Base case: if the start index is greater than or equal to the end index, it's
        // a palindrome
        // The base case is true when either there is one or no characters left to
        // compare
        if (start >= end) {
            return true;
        }
        // Check if characters at the current indices are equal
        if (N.charAt(start) != N.charAt(end)) {
            return false;
        }
        // Recursive call to check the next pair of characters
        return isPalindrome(N, start + 1, end - 1);
    }

    static void checkPalindrome(String N) {
        // end length would totalLength-1 since index starts from 0
        if (isPalindrome(N, 0, N.length() - 1)) {
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
        checkPalindrome(N);
    }
}
