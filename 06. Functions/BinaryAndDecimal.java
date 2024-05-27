/*
 *                              Lecture - 7
*/

/**
    - Binary Number System → Only 2 unique numbers → 0 & 1
        - Any number are formed using only 0’s & 1’s
    - Decimal Number System → 10 unique numbers → [ 0 → 9 ]
        - Any number are formed using these 10 numbers
*/

public class BinaryAndDecimal {
    public static void main(String[] args) {
        binaryToDecimal(10101);
        decimalToBinary(11);
    }

    /*
     *  Program to convert any Binary number to it's Decimal Number
     *  n = 10101
     *          1   0   1   0   1       -> each Binary digits
     *          2^4 2^3 2^2 2^1 2^0     -> Corresponding powers of 2
     *          16  0   4   0   1       -> Multiply each digit with corresponding powers of 2
     *          = 16 + 0 + 4 + 0 + 1
     *          = 21 
    */
    public static void binaryToDecimal (int n) {
        int decimal = 0;
        int power = 1;

        while (n > 0) {
            int lastDigit = n % 10;
            decimal = decimal + power*lastDigit;
            power *= 2;
            n /= 10;
        }

        System.out.println(decimal);
    }


    /*
     *  Program to convert any Decimal number to it's Binary Number
     *  n = 11
     *          2   |   11
     *               -------
     *          2   |   5   ->  1   => 10^0 place
     *               -------    
     *          2   |   2   ->  1   => 10^1 place
     *               -------
     *          2   |   1   ->  0   => 10^2 palce
     *               -------
     *          2   |   0   ->  1   => 10^3 place
     * 
     *      => multiply each remainder with it's corresponding power
     *      => Add all the products
    */
    public static void decimalToBinary (int n) {
        int binary = 0;
        int power = 1;
        while (n > 0) {
            int rem = n % 2;
            binary = binary + rem*power;
            power = power * 10;
            n = n/2;
        }

        System.out.println(binary);
    }
}
