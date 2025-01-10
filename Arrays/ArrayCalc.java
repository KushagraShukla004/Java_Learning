package Arrays;

import java.util.Scanner;

public class ArrayCalc {

    public static int findSum(int range, int[] arr) {
        int sum = 0;
        // for(int i=0;i<range;i++){
        // sum+=arr[i];
        // }
        // OR
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static int findProduct(int[] arr) {
        int prod = 1;
        for (int element : arr) {
            prod *= element;
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        int[] arr = new int[range];
        System.out.println("The elements are: ");
        for (int i = 0; i < range; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum= " + findSum(range, arr));
        System.out.println("Product= " + findProduct(arr));
        double avg = findSum(range, arr) / (double) range;
        System.out.println("Average= " + avg);
        sc.close();

        /*
         * REMEMBER:
         * double avg = (double) findSum(range, arr) / range;
         * AND
         * double avg = (double) (findSum(range, arr) / range) ;
         * ARE DIFFERENT!!!!
         * -----------------------------------------------------------------------------
         * Explanation:
         * 
         * In JAVA, if we typecast both integer values as double/float like:
         * (double) (findSum(range, arr) / range),
         * JAVA will perform INTEGER DIVISION(.i.e ignore the decimal point and only
         * take integer number(n)),
         * BUT SINCE we are type casting the integer number(n) in double/float, then
         * the result will be (n.0),
         * eg:- float n = (float)(27/10); Ans= 2.0 ; not 2.7 or 3 (round off)
         * BUT when we are first converting any operand (i.e. numerator/denominator)
         * in double, like:
         * (double) findSum(range, arr) / range; OR
         * findSum(range, arr) / (double) range;
         * then JAVA will perform double division.
         * 
         */
    }
}
