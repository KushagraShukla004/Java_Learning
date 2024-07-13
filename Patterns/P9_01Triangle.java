package Patterns;

/*
Pattern(P)9: 0 1 Triangle
            r,c(i,j)
1           (1,1)
0 1         (2,1)=3 ,(2,2)
1 0 1       (3,1),(3,2)=5 ,(3,3)
0 1 0 1     (4,1)=5 ,(4,2),(4,3)=7 ,(4,4)
1 0 1 0 1   (5,1),(5,2)=7 ,(5,3),(5,4)=9 ,(5,5)

we can see if the sum of r,c(i,j) is odd then it will have a 0 
or
if the sum of r,c(i,j) is even then it will have a 1
*/

public class P9_01Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {// even
                    System.out.print("1 ");
                } else {// odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
