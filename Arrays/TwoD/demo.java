package Arrays.TwoD;

public class demo {
    public static void main(String[] args) {
        int num[][] = new int[3][4];
        // Storing random numbers in the array

        for (int i = 0; i < 3; i++) {// rows
            for (int j = 0; j < 4; j++) {// columns
                // by default Math.random() stores double(point) value so used type conversion
                num[i][j] = (int) (Math.random() * 12);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
