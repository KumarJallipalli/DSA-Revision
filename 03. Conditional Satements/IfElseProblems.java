import java.util.Scanner;

public class IfElseProblems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Q1. Largets of 2 numbers
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b) {
            System.out.println("Larger of " + a + " & " + b + " is: " + a);
        }
        else {
            System.out.println("Larger of " + a + " & " + b + " is: " + b);
        }


        // Q2. Print if a number is even or odd
        if (a % 2 == 0) {
            System.out.println(a + " is EVEN");
        }
        else {
            System.out.println(a + " is ODD");
        }


        // Q3. Income Tax Calculator
        int income = 515000;
        float tax;

        if (income < 500000) {
            tax = 0;
            System.out.println("Tax Amount = " + tax);
        }
        else if (income < 1000000) {
            tax = income * 0.2f;
            System.out.println("Tax Amount = " + tax);
        }
        else {
            tax = income * 0.3f;
            System.out.println("Tax Amount = " + tax);
        }


        // Q4. Print the largest of three
        int x = 10, y = 20, z = 30;

        if (x >= y && x >= z) {
            System.out.println(x + " is the Largest of " + x + ", " + y +", " + z);
        }
        // As we have already checked ( y >= x ) above
        else if (y >= z) {
            System.out.println(y + " is the Largest of " + x + ", " + y +", " + z);
        }
        else {
            System.out.println(z + " is the Largest of " + x + ", " + y +", " + z);
        }

        scan.close();
    }
}
