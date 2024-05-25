import java.util.Scanner;

/**
 *  For Loop
 *      - It will contain all the 3 things in a single line
        - `for ( initialization; condition; inc/dec ) { Code }`
            - It 1st executes the initialization statement
            - mext checks the condition, if true → executes the code block
            - then executes the inc/dec statement & then checks the condition again
            - finally, if condition is false → exits the loop
        - It is not mandatory to put all the 3 things inside the parenthesis of for
*/

public class For {
    public static void main(String[] args) {
        // Q1. Print the SUARW pattern of size 4
        for (int i=0; i<4; i++) {
            System.out.println("* * * *");
        }


        // Q2. Print reverse of a number n
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int reverseNum = 0;

        // Since we don't know No. of iterations, we will use while loop
        if (n < 0) {
            n = n * (-1);
        }

        while (n > 0) {
            int lastDigit = n % 10;
            reverseNum = reverseNum*10 + lastDigit;
            n = n/10; 
        }
        System.out.println(reverseNum);


        scan.close();
    }
}
