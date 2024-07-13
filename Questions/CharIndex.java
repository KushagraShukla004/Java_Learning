package Questions;

import java.util.Scanner;

public class CharIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = scan.nextLine();
        System.out.println("Enter the alphabet you want to find: ");
        String ch = scan.nextLine();
        int occur = s1.indexOf(ch);
        System.out.print("The first occurrence of letter " + ch + " is: " + occur);
        scan.close();
    }
}
