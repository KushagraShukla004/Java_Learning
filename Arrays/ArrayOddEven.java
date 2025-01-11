package Arrays;

import java.util.Arrays;

//WAP that places the odd elements of an array before the even elements

//IN: arr={1,2,4,5,7,9,-2,3};
//OUT: [1,5,7,9,3,-2,4,2]
public class ArrayOddEven {
    public static int[] newArray(int size, int[] arr) {
        int[] temp = new int[size];
        int j = 0;
        int k = size - 1;

        // First loop to iterate through arr to find odd,even
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) { // odd
                temp[k--] = arr[i];
            }
            // even
            else {
                temp[j++] = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 9, -2, 3 };
        int size = arr.length;

        System.out.println(Arrays.toString(newArray(size, arr)));
    }
}
