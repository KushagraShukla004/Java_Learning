package Questions;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            int pow = digit * digit * digit;
            sum = sum + pow;
            num /= 10;
        }
        if (sum == num) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
        scan.close();

    }
}
