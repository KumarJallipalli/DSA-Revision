import java.util.Scanner;

/**
 *  Jump Statements
        - `break` → Immediately exits the loop [ without executing the below code ]
        - `continue` → immeidatley skips the current iteration [ without executing the below code ]
        - `return` → Immediately exits the function [ without executing the below code ]
*/

public class JumpStatements {
    public static void main(String[] args) {
        // Q1. Check if the number is prime number or not
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isPrime = true;

        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println("Prime");
        }
        else {
            System.out.println("NOT Prime");
        }


        scan.close();
    }
}
