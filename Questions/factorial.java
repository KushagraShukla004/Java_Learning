package Questions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter the number: ");
        int i = scan.nextInt();
        while (i > 0) {
            fact = fact * i;
            i--;
        }
        System.out.println(fact);
        scan.close();
    }
}
