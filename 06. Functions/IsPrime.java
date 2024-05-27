/*
 *                                      Lecture - 6
*/

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrimeOptimised(49));
        primesInRange(100);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeOptimised (int n) {
        if (n == 2)
            return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Print All Primes between in a Range
    public static void primesInRange (int n) {
        for (int i=2; i<=n; i++) {
            if (isPrimeOptimised(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
