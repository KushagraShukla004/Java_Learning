package Patterns;

/*
Pattern(P)2: Hollow Rectangle
       
 *****   r=0,c=0 | r=0,c=1 | r=0,c=2 | r=0,c=3 | r=0,c=4
 *   *   r=1,c=0 |                             | r=1,c=4
 *   *   r=2,c=0 |                             | r=2,c=4
 *****   r=3,c=0 | r=3,c=1 | r=3,c=2 | r=3,c=3 | r=3,c=4
 
 */
public class P2 {
    public static void main(String[] args) {
        int r = 4;
        int c = 5;
        // outer loop
        for (int i = 1; i <= r; i++) {
            // inner loop
            for (int j = 1; j <= c; j++) {
                // basically take the starting and ending value of row and col
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
