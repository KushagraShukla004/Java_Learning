package Questions;

import java.util.*;

public class Ascii {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the character: ");
            char c = in.next().charAt(0);
            int value = (int) c;
            System.out.println("ASCII Value : " + value);
        }
    }
}