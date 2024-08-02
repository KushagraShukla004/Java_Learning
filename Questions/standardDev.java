package Questions;

import java.util.Scanner;

public class standardDev {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] data = new int[size];
        System.out.println("Enter the data: ");
        for (int i = 0; i < size; i++) {
            data[i] = scan.nextInt();
        }
        scan.close();
    }
}