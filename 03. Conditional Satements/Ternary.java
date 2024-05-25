/**
    ## Ternary Operator `?`

        - `Ternary Operator` → Operator which requires 3 operands to perform an Operation
        - It is the short-hand for if-else statements
        - `variable = condition ? expression1 : expression2;`
            - If condition is `true` → expression1 is evaluates & the result stored in variable
            - if  condition is `false` → expression2 is evaluates & the result stored in variable
*/

public class Ternary {
    public static void main(String[] args) {
        // Q. Check whether a student will pass or fail
        int marks = 55;
        String result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(result); 
    }
}
