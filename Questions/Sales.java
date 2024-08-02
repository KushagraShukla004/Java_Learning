package Questions;

import java.util.*;

public class Sales {
    static int[] sales_id;
    static int[] sales_amount;
    static int size;

    static void avg(int[] amount) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += amount[i];
        }
        int avg = sum / size;
        System.out.println("\nSum of the sales: " + sum);
        System.out.println("Average Sales: " + avg);
    }

    static void minmax(int[] amount, int[] sales_id) {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] > amount[maxIndex]) {
                maxIndex = i;
            }
            if (amount[i] < amount[minIndex]) {
                minIndex = i;
            }
        }
        System.out.printf("%n%d had the highest sale with %d rupees.%n", sales_id[maxIndex], amount[maxIndex]);
        System.out.printf("%d had the lowest sale with %d rupees.%n", sales_id[minIndex], amount[minIndex]);
    }

    static void exceed(int[] id, int[] amount, int limit) {
        int count = 0;
        System.out.println("\nThe sales people who have exceeded the limit are: ");
        for (int i = 0; i < size; i++) {
            if (amount[i] > limit) {
                count++;
                System.out.printf("%d with sale %d%n", id[i], amount[i]);
            }
        }
        System.out.print("The total number of people is: " + count);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sales people: ");
        size = scan.nextInt();
        sales_id = new int[size];
        sales_amount = new int[size];

        System.out.println("Enter the sales_id: ");
        for (int i = 0; i < size; i++) {
            sales_id[i] = i + 1;
            System.out.println(sales_id[i]);
        }
        System.out.println("\nEnter the amount of sales for each sales people: ");
        for (int i = 0; i < size; i++) {
            sales_amount[i] = scan.nextInt();
        }

        System.out.println("\nEnter the threshold sales limit: ");
        int limit = scan.nextInt();

        avg(sales_amount);
        minmax(sales_amount, sales_id);
        exceed(sales_id, sales_amount, limit);
        scan.close();
    }
}
