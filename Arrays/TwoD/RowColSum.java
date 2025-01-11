package Arrays.TwoD;

public class RowColSum {
    public static void main(String[] args) {
        int[][] num = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        int rowSum = 0;
        int colSum = 0;
        for (int i = 0; i < 3; i++) {// row
            for (int j = 0; j < 4; j++) {// col
                rowSum += num[i][j];
                // rowSum= 0 + num[0][0]= 0+1=1
                // rowSum= 1 + num[0][1]= 1+2=3
                // rowSum= 3 + num[0][2]= 3+3=6
                // rowSum= 6 + num[0][3]= 6+4=10
                // j=4; j<4 (so False ,loop exit)
            }
            System.out.println("Sum of Row " + (i + 1) + ": " + rowSum);
            // rowSum = 0 because for next row we have to start from 0 instead of row 1's
            // sum i.e. 10
            rowSum = 0;
        }
        for (int i = 0; i < 4; i++) {// col
            for (int j = 0; j < 3; j++) {// row
                colSum += num[j][i];
                // colSum= 0+num[0][0]= 0+1=1
                // colSum= 1+num[1][0]= 1+5=6
                // colSum= 6+num[2][0]= 6+9=15
                // j=4,j<3 (so, False, loop exit)
            }
            System.out.println("Sum of Column " + (i + 1) + ": " + colSum);
            colSum = 0;
        }
    }
}
