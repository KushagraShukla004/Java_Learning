package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class uniqueEl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (!arr.contains(num)) { // ! means NOT so, not contains
                arr.add(num);
            }
        }
        System.out.println("Original array: " + arr);
        Collections.sort(arr);
        System.out.println("Sorted Array: " + arr);
        sc.close();
    }
}
