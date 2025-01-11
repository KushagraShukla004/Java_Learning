package Arrays.TwoD;

public class RowColMax {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 10, 3, 8 },
                { 9, 12, 6, 7 },
                { 5, 2, 11, 4 },
        };
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                maxRow = (maxRow > arr[i][j]) ? maxRow : arr[i][j];
            }
            System.out.println("Max of Row " + (i + 1) + ": " + maxRow);
            maxRow = 0;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                maxCol = (maxCol > arr[j][i]) ? maxCol : arr[j][i];
            }
            System.out.println("Max of Col " + (i + 1) + ": " + maxCol);
            maxCol = 0;
        }
    }
}
