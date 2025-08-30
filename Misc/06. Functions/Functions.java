/*
 *                              Lecture - 1
*/


/*
 *  Functions in Java
        - `Functions` → A reusable block of code used to perform a specific task
            - Functions are executed only when they are called
            - Functions returns value [ & flow ] to the caller.
            - Functions allows us to **reuse** the code without retyping the code
                - i.e.,  defined only once but can be reused any number of times

        A caller is a function that calls another function; 
        A callee is a function that was being called.
*/


/*
 *  Function parameters (vs) Arguments
        - The **`parameter`**  → Variables that are defined during a function declaration/definition.
        - An `argument`  **→ Variable** values that are passed (and received by) during a function call
*/


/*
 *  ## Difference between a function & a Method
        - `Function` → A reusable block of code used to perform a specific task
            - Functions can be called independently using function names
        - `Method` → A function associated with an Object
            - Methods can only be called using Objects
*/

public class Functions {

    // Funcxtion Syntax
    public static void Test (int param1, int param2) {
        // Block of code
        return;
    }

    public static void main(String[] args) {
        
        // Function call
        Test(2, 3);
    }
}
