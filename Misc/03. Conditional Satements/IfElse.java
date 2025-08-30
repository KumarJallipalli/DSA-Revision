/**
 *  Conditional Statements
        - `Conditional statements` are used to **control the flow of a program** based on certain conditions.
        - These statements allows the execution of different code blocks depending on whether a specified condition is true or false, providing a fundamental mechanism for **decision-making** in algorithms.
        - Hence, Conditional statements in Programming are also known as decision-making statements
        - Conditional Statements enables us to create more complex & dynamic programs.
*/


public class IfElse {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a < b) {
            System.out.println("If Statement");
        }


        if (b < a) {
            System.out.println("If Condition is true -> If-block is executede");
        } else {
            System.out.println("If Condition is false -> else-block is executede");
        }


        if (a > b) {
            System.out.println("If-block is executed inside the if-else_if");
        }
        else if ( b > c) {
            System.out.println("else-If-block is executed inside the if-else_if");
        }
        else if (a > c) {
            System.out.println("If-block is executed inside the if-else_if");
        }
        else {
            System.out.println("else-block is executed inside the if-else_if");

        }


        // Difference between if, if-else , if-else if
        int age = 22;

        if ( age >= 18) {
            System.out.println("adult");
        }
        if ( age >= 13 && age < 18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("child");
        }
        /**
         *  - In the above code, both the conditions from lines 44 && 47 get's evaluated
        */

        if ( age > 18) {
            System.out.println("adult");
        }
        else if ( age > 13 && age <= 18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("child");
        }
        /**
         *  - In the above, only condition from line 57 is evaluated
        */
    }
}


/**
 *  if & if-else are used to check only one condition.
 *  if-else if are used to check multiple conditions in seuqnece BUT executes only one block of code & then exits from flow of program
 * 
 *  → In the conditional statements, The condition must always return a boolean value
*/