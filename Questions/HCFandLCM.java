package Questions;

import java.util.*;

public class HCFandLCM {

    static int HCF(int n1, int n2) {
        // BRUTE FORCE
        // int num1 = n1;
        // int num2 = n2;

        // while (num2 != 0) {
        // int temp = num2;
        // num2 = num1 % num2;
        // num1 = temp;
        // }
        // return num1;

        // Better Approach since we know the HCF is always smaller than the smallest of
        // the two numbers
        for (int i = Math.min(n1, n2); i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    static int LCM(int n1, int n2, int hcf) {
        return (n1 * n2 / hcf);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number(n1): ");
        int n1 = scan.nextInt();
        System.out.print("Enter number(n2): ");
        int n2 = scan.nextInt();
        scan.close();
        int hcf = HCF(n1, n2);
        System.out.print("HCF of " + n1 + " " + n2 + " is: " + hcf);
        System.out.print("\nLCM of " + n1 + " " + n2 + " is: " + LCM(n1, n2, hcf));
    }
}
