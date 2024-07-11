package Patterns;

/*
Pattern(P)3: Left Triangle
[TIP:Focus on empty(_) spaces rather than stars ]
[ (_) JUST FOR POINTING THE SPACE]
___*
__**
_***
****

 */

public class P4_LeftTriangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // inner loop to print spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
