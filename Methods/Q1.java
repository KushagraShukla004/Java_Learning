package Methods;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = in.nextInt();
        Q1 a = new Q1();
        a.OddEven(num1);
        in.close();
    }

    void OddEven(int num1) {
        if (num1 % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

}
