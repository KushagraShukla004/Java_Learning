package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUI {
    public static void displayMenu() {
        System.out.println("\n1. Add");
        System.out.println("2. Remove");
        System.out.println("3. display");
        System.out.println("4. Exit\n");
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter the number to add: ");
                int num = sc.nextInt();
                arr.add(num);
                System.out.println("Added.");
            } else if (choice == 2) {
                System.out.print("Enter the number to remove: ");
                int rem = sc.nextInt();
                if (arr.contains(rem)) {
                    // Integer.valueOf(rem) removes the value and not the element in that index
                    arr.remove(Integer.valueOf(rem));
                    System.out.println("Removed");
                } else {
                    System.out.println("Value was not found.");
                }

            } else if (choice == 3) {
                System.out.println("Array: " + arr);
            } else if (choice == 4) {
                System.out.println("Exitted.");
                break;
            }
        }
        sc.close();
    }
}
