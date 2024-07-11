package Patterns;

public class P3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            // inner loop for Decreasing triangle of spaces
            for (int j = i; j <= 3; j++) {
                System.out.print("  ");
            }
            // inner loop for Increasing triangle of stars
            // but last column should not print
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            // inner loop for Increasing triangle of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
