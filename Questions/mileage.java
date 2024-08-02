package Questions;

import java.util.*;

public class mileage {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Capacity of tank: ");
            float tank = in.nextFloat();
            System.out.print("Number of times tank was filled: ");
            int filled = in.nextInt();
            float gallons = (float) tank * filled;
            System.out.print("Enter the miles driven: ");
            int mileage = in.nextInt();
            float calc = (float) mileage / gallons;
            System.out.println("Miles per gallon: " + calc);
        }
    }
}
