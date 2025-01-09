package Questions;

public class PrimeRange {
    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int range = 100;
        for (int x = 2; x <= range; x++) {
            if (isPrime(x)) {
                System.out.print(x + " ");
            }
        }
    }
}