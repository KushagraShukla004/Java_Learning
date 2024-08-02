package Patterns;

/*
Pattern 10 : Butterfly Pattern

    *      *   1(*) 6spaces 1(*)
    **    **   2(*) 4spaces 2(*)
    ***  ***   3(*) 2spaces 3(*)
    ********   4(*) 0spaces 4(*)
    ********   4(*) 0spaces 4(*)(inverting the above pattern)
    ***  ***   3(*) 2spaces 3(*)
    **    **   2(*) 4spaces 2(*)
    *      *   1(*) 6spaces 1(*)
 

 */

public class P10_ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;
        // First Half (Upper Half)
        for (int i = 1; i <= n; i++) {
            // left triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                // not using print(ln) because then in every loop it will print the * in next
                // line.
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right Triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n; i >= 1; i--) {
            // left triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right Triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
