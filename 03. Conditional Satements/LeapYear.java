import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        /*
         *  Q. Program to find if given year is Leap Year
         *  
         *  Leap year happens in years divisible by four, but every 100 years, there is not a leap year. 
         *  However, every 400 years, you do have a leap year. 
         *  This happened in the year 2000. And the next time it will happen most of us won't be around  
         *  2100, 2200, 2300, 2500 will not be a leap year.
         * 
         *  Hints:
         *      - A century year should be divisible by 4 and 100 both.
         *      - A non-century year should be divisible only by 4.
         */
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (year % 4 == 0) {
            if (year%100 == 0) {
                if (year%400 == 0) {
                    System.out.println("Leap Year");
                }
                else {
                    System.out.println("Not a Leap Year");
                }
            }
            else {
                System.out.println("Leap Year");
            }
        }
        else {
            System.out.println("NOT a Leap Year");
        }


        // Optimised version of the above code
        if ( year % 4 == 0 ){
            if ((year % 100 == 0) && !(year % 400 == 0)) {
                System.out.println("NOT a Leap Year");
            }
            else {
                System.out.println("Leap Year");
            }
        }
        else {
            System.out.println("NOT a Leap Year");
        }


        // Optimised version of above code
        if ( (year % 4 == 0) && !((year % 100 == 0) && !(year % 400 == 0)) ) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("NOT a Leap Year");
        }

        /**
         *  Condition From GFG --> (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
         *  This is same as above code written by me, but simplified the !(part)
        */


        scan.close();
    }
}
