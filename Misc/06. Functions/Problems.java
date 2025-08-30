/*
 *                              Lecture - 4
*/

public class Problems {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println(Product(a, b));
        System.out.println(Factorial(10));
        System.out.println(BinomialCoefficient(5, 2));

    }

    // Q1. Product of a & b
    static int  Product (int a, int b) {
        int product = a * b;
        return product;
    }


    // Q2. factorial of a number n
    public static int Factorial (int n) {
        int f = 1;

        for (int i=1; i<=n; i++) {
            f = f * i;
        }

        return f;
    }


    // Q3. Binomial Coefficient --> ncr
    public static int BinomialCoefficient (int n, int r) {
        // Binomiacl Coef = ncr == (n!)/(r! * (n-r)!)
        int numerator = Factorial(n);
        int denominator = Factorial(r) * Factorial(n-r);
    
        return (int)(numerator/denominator);
    }
}
