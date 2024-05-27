/*
 *                                  Lecture - 3
*/


/*
 *  Call By Value:
 *      - Java always calls by value
 *      - i.e., whenever a fn call is made, it passes the variable’s value NOT the varibale reference/adddress
 *      - i.e., a copy of the variable’s value is sent instead of the address of the variable
*/

public class CallByValue {
    public static void main(String[] args) {
        int a = 5;
        ChangeA(a);
        /*
         *  - In the above statement, a copy of 'a's value is passed to ChangeA fn
         *  - Hence value of 'a' is NOT changed.
         *  - But, if we pass the a's refrence, then value of 'a' would be changed
         *  - Since, Java alaways uses call by value, It won't happen
        */
        System.out.println(a);
    }

    public static void ChangeA (int a) {
        a = 10;
    }
}
