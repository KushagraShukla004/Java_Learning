package Arrays;

import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the elements of array of 5: ");
            int[] num = new int[5];
            for (int i = 0; i < 5; i++) {
                num[i] = in.nextInt();
                System.out.print(num);
            }
        }
    }
}
