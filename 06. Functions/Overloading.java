/*
 *                                      Lecture - 5
*/


/*
 *  Function Overloading:
 *      - Multiple Functions with same Function Names but different Function Signatures
 *      - Function Signatures --> Parenthesis part of the Function
 *      - To overlaod any function, their signatures must be different by
                1. Changing the Data types of the parameters
                2. Changing the No. of parameters
                3. Changing the order of the parameters
        - If the exact prototype is NOT matched → Then, Compiler uses type conversion
*/

public class Overloading {
    public static void main(String[] args) {
        // 1. Method Overloading with Changing the DataTypes of parameters
        Sum (3, 5);
        Sum (4.2f, 3.8f);

        // 1. Method Overloading with Changing the No. of parameters
        Sum (5, 10);
        Sum (5, 10, 20);

        // 3. Method Overloading with Changing the Order of parameters
        Sum (5.2f, 5);
        Sum (5, 5.2f);
    }

    // 1. Method Overloading with Changing the DataTypes of parameters
    public static int Sum (int a, int b) {
        return a + b;
    }

    public static int Sum (int a, int b, int c) {
        return a + b + c;
    }

    // 1. Method Overloading with Changing the No. of parameters
    public static float Sum (float a, float b) {
        return a + b;
    }

    // 3. Method Overloading with Changing the Order of parameters
    public static float Sum (float a, int b) {
        return a + b;
    }

    public static float Sum (int a, float b) {
        return a + b;
    }
}

