/**
 *                          Lecture - 7
*/

/**
 *  Type Casting in java is 2 types:
 *      1. Implicit casting -> Automatic Conversion of data from one type to another type when required
 *      2. Explicit Conversion -> Explicit Conversion of data from one type to another type when required
                
                *   - `byte → short → int → long -> float → double`
                        - Type conversion from Left to Right is automatic
                        - But from Right to Left, we need explicit casting
*/

public class Casting {
    public static void main(String[] args) {
        // Implicit casting
        char ch = 'a';
        int charToNum = ch;
        System.out.println(charToNum);

        int num = 15;
        float numToFloat = num;
        System.out.println(numToFloat);

        // Explicit Casting
        float fl = 45.2f;
        int floatToNum = (int) fl;
        System.out.println(floatToNum);


        // Type Promotion in Expressions
        char ch1 = 'a';
        char ch2 = 'b';

        System.out.println(ch1);            // this will print char as it is NOT an Expression
        System.out.println(ch1 - ch2);      // This will print int as it is an expression


        byte b = 10;
        short s = 20;
        char c = 'c';

        System.out.println(b+s+c);

        byte total = (byte) (b+s+c);
        System.out.println(total);


        int n = 10;
        float f = 20.25f;
        long l = 100;

        // What will be the type here..?
        System.out.println("Type is: " + ((Object)(n+f+l)).getClass().getSimpleName());

        double db = n + f + l;
        System.out.println(db);

        long ln = 1000L;
        float f1 = ln;
        System.out.println(f1);

        int $ = 10;
        System.out.println($);
    }
}
