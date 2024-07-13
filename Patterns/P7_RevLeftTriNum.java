package Patterns;

/*
Pattern(P)7: Rev Number Triangle

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/

public class P7_RevLeftTriNum {
    public static void main(String[] args) {
        int n = 5;
        // Method-1:
        System.out.println("Method-1: ");
        // for reverse we just reverse the outer loop (i=5;i>=1;i--)
        for (int i = n; i >= 1; i--) {
            // since the no. of cols = no. of row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Method-2:
        System.out.println("\nMethod-2:");
        for (int i = 1; i <= n; i++) {
            // since the no. of cols = total(n) - no. of row(i) + 1.
            // Eg(5-1+1= 5, so col=5 in row-1)
            // Eg(5-2+1= 4, so col=4 in row-2)
            // Eg(5-3+1= 3, so col=3 in row-3)
            // Eg(5-4+1= 2, so col=2 in row-4)
            // Eg(5-5+1= 1, so col=1 in row-5)
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
