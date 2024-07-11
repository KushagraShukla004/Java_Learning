package BasicStuff;

public class Q5 {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 5; i > 1; i--) {
            fact = i * fact;
        }
        System.out.println(fact);
    }
}
