package Patterns;

/*
Pattern(P)1: Simple Rectangle

 ***** 
 *****
 *****
 *****
 
 */

public class P1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) { // Run the loop row=4 times
            for (int j = 0; j < 5; j++) { // Print col=5 * characters in each row
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing the row
        }
    }
}