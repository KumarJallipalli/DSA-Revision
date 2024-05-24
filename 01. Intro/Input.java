/**
 *                                  Lecture - 5
*/


/**
 *  Comments:
 *      - Comments are ignored by compiler → Comments are NOT executed by java
 *      - Comments are used for debugging the code → we can comment out the sections of code to understand it’s execution behavior
 *      - Comments are mainly used for Documentation purpose, so that other developers can undertsand the code written by a developer
*/


/**
 *  Package:
 *      - A Java package is encapsulation of a collection of sub-packages, classes and interfacesof a similar type
 *      - In Java, two packages namely java.lang package and a default package are imported by default in all the classes of Java.
 *              - Hence, we don;t need to import these packages seperately
*/


import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        /**
         *  How to take input from User..?
        */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);

        /**
         * - Inorder to take input from User in java, we need another class called  `Scanner`
         *      - WKT, `System` class is used to print Output onto Console
         *      - Similarly, `Scanner` class is used to take input from user
         * - But It lies in a different package called `util` → Hence we need to import it, inorder to use it
         * - Now we make an Object out of the `Scanner` class   -> Scanner scan = new Scanner(System.in);
         * - This Object will have methods which helps us to take input from user   -> scan.nextInt();
        */
    }
}
