/**
 *  Nested Loops
        - `Nested loops` → A loop within another loop
            - Outer loop is used to print the No. of rows/lines required
            - Inner loop is used to print the No. of columns/elements required
*/

import java.util.Scanner;

/**
    - `Nesting` → A piece of code within an another piece of code
*/

public class Patterns {
    public static void main(String[] args) {
        // Q1. Print a half Pramind pattern
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for ( int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // Q2. Print an Inverse half Pramind pattern
        for (int i=1; i<=n; i++) {
            for (int j=1; j<= (n-i+1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        /**
         *  Q3. Print a half pyramind pattern with numbers instead stars
         *          1
         *          1 2
         *          1 2 3
         *          1 2 3 4
        */
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        /**
         *  Q3. Print a half pyramind pattern with continuous characters
         *          A
         *          B C
         *          D E F
         *          G H I J
        */
        char ch = 'A';
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }


        scan.close();
    }
}

/*
 *  - if there are 2 statements  `int i=1;` && `char ch='A';`
 *  - If we do `i++` && `ch++` , what will happen..?
*/