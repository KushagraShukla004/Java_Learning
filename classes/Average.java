import java.util.Scanner;

public class Average {
    int num1, num2, num3, r, i;

    Average(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println("sum = " + sum);
        System.out.println("Average of the numbers is: " + avg);
    }

    void complexNum(int r, int i) {
        System.out.println("complex numbers ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the 3nd number: ");
        int num3 = scan.nextInt();
        System.out.println(num1 + " " + num2 + " " + num3);
        new Average(num1, num2, num3);

        scan.close();
    }
}
