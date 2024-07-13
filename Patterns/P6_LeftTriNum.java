package Patterns;

/*
Pattern(P)6: Number Triangle

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/

public class P6_LeftTriNum {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // since the no. of cols = no. of row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
