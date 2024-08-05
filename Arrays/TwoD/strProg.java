package Arrays.TwoD;

import java.util.Scanner;

public class strProg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char c = scan.next().charAt(0);
        Boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                System.out.println("Character " + c + " found.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Character " + c + " not found.");
        }
        scan.close();
    }
}
