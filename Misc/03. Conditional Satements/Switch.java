import java.util.Scanner;

/**
    Switch Statements:
    -----------------
    - `switch` statement executes one statement from multiple conditions based on the switch expression/variable & case values
    - It is similar to an **if-else-if** ladder statement.
    - *Java switch expression must be of byte, short, int, long(with its Wrapper type too), enums and string.*
    - Rules for switch cases
        - Duplicate cases are NOT allowed
        - The value for a case must be of the same data type as the variable/expression in the switch.
        - The value for a case must be constant or literal. **Variables are not allowed.**
        - The `break` statement is optional. If omitted, execution will continue on into the next case.
        - The default statement is optional and can appear anywhere inside the switch block. it will get executed if no case matches.
*/

public class Switch {
    public static void main(String[] args) {
        int num = 8;

        // Syntax od switch
        switch (num) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Bhajji");
                break;
            default:
                System.out.println("Biscuits");
                break;
            case 3:
                System.out.println("Vada");
                break;  
        }


        // Building a Calculator using Switch Statements
        Scanner scan = new Scanner (System.in);

        int a = scan.nextInt();
        char ch = scan.next().charAt(0);
        int b = scan.nextInt();

        switch (ch) {
            case '+':
                System.out.println(a+b);
                break;
            case ('-'):
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case ('/'):
                System.out.println(a/b);
                break;
            case ('%'):
                System.out.println(a%b);
                break;
            default:
                System.out.println("Please select one of the Operators from: [+, -, *, /, %]");
        }

        scan.close();
    }
}
