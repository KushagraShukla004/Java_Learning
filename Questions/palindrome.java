package Questions;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = num;
        int rev = 0;

        while (temp != 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }

        if (rev == num) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is not a Palindrome number.");
        }
        scan.close();
    }
}
