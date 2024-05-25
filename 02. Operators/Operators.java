/**
 *  - Operators → Symbols that tell Compiler to perform an Operation
 *  - Operands are the variables/literals upon which the operation is performed
 *  - literals are the constant values in a program
 *  
 *  - Binary Operators → Operator which requires 2 operands to perform an operation
 *  - Unary Operators → Operators which require only 1 operand to perform an operation
 * 
 *  - pre-Increment → [ ++a ] → first increases the value of a by 1 AND then evaluates the expression/equation with the latest value of a
 *  - post-Increment → [ a++ ] → first evaluates the expression/equation with the current value of a AND then increases the value of a by 1
*/


/**
    `+` → Performs Addition Operation
    `-` → Performs SubtractionOperation
    `*`  → Performs MultiplicationOperation
    `/` → Division Operator → used to give the Quotient
    `%` → Modulo Operator → used to give the reminder

    `++` → Increment Operator → Increases the value by 1
    `--` → Decrement Operator → decrrease the value by 1  

    `==` → checks whether 2 values/operands are Equal or not
    `!=` → checks whether 2 values/operands are NOT Equal or not
    `>` → checks whether LHS is Greater than RHS
    `<` → checks whether LHS is Less than RHS
    `>=`  → checks whether LHS is greater than or equals to RHS
    `<=`  → checks whether LHS is Less than or equals to RHS

    `&` → Logical AND → Returns true only if both the statements are true
    `||` → Logical OR→ Returns true if anyone of the statements is true
    `!` → Logical NOT→ Reverse the result [ i.e, returns false if the result is true  & viceversa ]

    `=` → Assigns RHS value to LHS
    `+=` → Addition Assignment Operator → Adds & then assigns the value to LHS [ `a += 10` same as `a = a + 10` ]
    `-=` → Subtraction Assignment Operator → Subtracts & then assigns the value to LHS [ `a -= 10` same as `a = a - 10` ]
    `*=` → Multiplication Assignment Operator → Multiplies & then assigns the value to LHS [ `a *= 10` same as `a = a * 10` ]
    `/=` → Division Assignment Operator → Divides & then assigns the value to LHS [ `a /= 10` same as `a = a / 10` ]
    `%=` → Modulo Assignment Operator → finds remainder & then assigns the value to LHS [ `a %= 10` same as `a = a % 10` ]
*/

/**
 *  - Operator precedence → determines the order in which the operators in an expression are executed/evaluated.
 *  - postfix  >>  [ prefix, unary ]  >>  [ *, /, % ]  >>  [ +, - ]  >>  Relational  >>  [ ==, != ]  >> Logical
 *  - If an expression has two operators with similar precedence, Then they are evaluated → Left to Right
 *          - Except prefix & Unary operators, They are evaluated → Right to Left
*/


public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = --a;

        System.out.println(a);
        System.out.println(b--);
    }
}
