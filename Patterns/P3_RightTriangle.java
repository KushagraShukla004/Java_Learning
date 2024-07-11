package Patterns;

/*
Pattern(P)3: Right Triangle

*
**
***
****  

*/

public class P3_RightTriangle {
    public static void main(String[] args) {
        // if u want to invert the pattern just reverse/invert the outer(row) loop
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
