/**
 *  LOOPS:
 *      - loops are used to iterate over a piece/block of code multiple times based on specified condition
 *      - i.e., execute a piece of code multiple times without actual repetition of the code
 *      - - Loops control the flow of program using 3 things
                - initialization → initialize the loop by setting an initial value
                - condition → controls the execution of the piece/block of code
                - increment/decrement → used to increment/decrement the initial value to finally break the condition
*/


/**
 *  What is DRY run..?
        - DRY run → A practice exercise (or) rehearsal of a program before the real one
        - `DRY run` is a process of executing a code snippet manually on a paper without actually executing it in a computer.
        - It is used to
            - understand the flow of program
            - identify/find the bugs in the program/code
*/


/**
 *  - All types of loops executes a piece of code multiple times based on a boolean condition, 
 *  - BUT they only differ in syntax
*/

import java.util.Scanner;

/**
 *  While Loops:
 *      - while loop is like repeated if statements
        - Whille loop will generally have
            - initialization → before the while block
            - condition → during the definition of while block
            - increment/decrement → inside the while block
*/

public class While {
    public static void main(String[] args) {
        // Q1. Print numbers from 1 to 10
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }

        System.out.println();

        // Q2. Print numbers from 1 to 10
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // Q3. Sum of first n natural numbers
        i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);


        scan.close();
    }
}
