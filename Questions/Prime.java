package Questions;

public class Prime {
    public static String isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "not a Prime Number.";
            }
        }
        return "a Prime Number.";
    }

    public static void main(String[] args) {
        int n = 31;
        System.out.print(n + " is " + isPrime(n));
    }
}
