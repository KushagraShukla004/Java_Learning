package Patterns;

/*
Pattern(P)8: Floyd's Triangle

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

public class P8_FloydTriangle {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // print num and increase it by 1 everytime (num++;)
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
