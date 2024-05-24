/**
 *                              Lecture - 6
 */

import java.util.Scanner;

public class BasicProblems {
    public static void main(String[] args) {
        // Q1. Sum of a & b
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = (a + b);
        System.out.println(sum);

        // Q2. Product of a & b
        int product = (a * b);
        System.out.println(product);

        // Q3. Area of Circle
        float rad = scan.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);

        /**
         *  NOTE:
         *      → whenever we use float, use suffix f for each value → 3.14f
         *      → Whenever we use long, use suffix L for each value → 5264L
        */
    }
}
