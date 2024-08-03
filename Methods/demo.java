package Methods;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = in.nextInt();
        demo a = new demo();
        a.Add(num1, num2);// arguments num1,num2 when calling
        in.close();
    }

    void Add(int num1, int num2)// parameter num1,num2 when initiallizing
    {
        int sum = 0;
        sum = num1 + num2;
        System.out.println(sum);
    }
}
