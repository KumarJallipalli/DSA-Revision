/**
 *                          Lecture - 4
*/


/**
 *  Variables:
 *      - variables → Containers for storing data values.
 *      - Since Java is Strongly Typed language, Each variable must be predefined with datatype
 *      - All variables must be declared beforehand inorder to use it in java
*/


/**
 *  Datatypes:
 *      - Datatype defines the type of data that the variable can hold
 *      - Datatype also defines how much of memory to be allocated to the variable in RAM
 *      - There are 2 types of datatypes
 *          1. Primitive Datatypes → pre-defined & built-in types used to store basic data
 *          2. Non-Primitive Datatypes → Not-Predefined types which based on primitive types & used to store complex data
 *      - But the Real difference in both of these is, how they access the data
 *          - primitive datatrypes uses "pass by value" → they access the data directly & passes a copy of the actual data
 *          - Non-Primitive datatypes uses "pass by reference" → They access the data via reference i.e., memory address & they passes the copy of address
*/


/**
 *  Primitive Datatypes
        - There are 8 primitive datatypes in java
            1. boolean  → stores either true or false [default] && takes only 1 byte of memory
            2. char     → stores a single character && takes 2 bytes of memory
            3. int      → [ default ] stores only Integers && takes 4 bytes of memory
            4. byte     → stores integers ranging from -128 to 127. Since it takes only 1 byte of memory
            5. short    → stores integers only but takes only 2 bytes of memory
            6. long     → stores integers only but takes 8 bytes of memory
            7. float    → stores decimal values && takes 4 bytes of memory
            8. double   → [ default ] stores decimal values but takes 8 bytes of memory
*/

public class Variables {
    public static void main(String[] args) {
        /**
         *  How to declare a varibale..?
        */
        int num;    // varibale declaration/definition
        num = 10;   // variable initialization -> giving variable an initial value

        int rum = 20;   // Both variable declaration & initialization in 1 single step

        // We can declare multiple variables in a single statement 
        int num1, num2, num3;

        // But we can’t assign multiple varaibles in a single statement 
        // num1 = 30, num2 = 40, num3 = 50;     -> This throws ERROR

        // we can declare & initialize multiple variablkes in a single statement
        int rum1=30, rum2=40, rum3=50;
    }
}

/**
 *  What happens when we define a variable..?
 *      1. So If we define a variable, Java will allocate some memory in RAM to the defined variable
 *      2. Java will name that memory location with variable name & It will have some address to for future reference
 *      3. Finally, java stores the value of variable in that memory
*/