/*
 *                                  Lecture - 2
*/


/*
 *  What happends in Memory when a Function is called..?
        - Java uses `Run-time stack` (or) `call Stack` mechanism for function calls
        - For every thread, JVM creates a run-time stack (or) call stack [ For now assume thread as a java program ]
            - JVM uses `stack` data structure to store each & every function call performed in the thread/program
            - Each entry in the call stack is known as an activation record or stack frame.
            - After completing every method call by it will be removed from the corresponding entry of the stack.
            - After completing all the methods, the stack will be empty → Then, call stack will be destroyed by the JVM
        - What is a Stack Frame..?
            - `stack frame` → Each entry in the call stack during a function call is called stack frame (or) activation record
            - Each stack frame will store
                - Local variables
                - Arguments passed into the function
                - Information about the caller's stack frame [ function which called this function ]
                - The *return address →* After the completion of function execution,  It should return to the caller right!
*/

public class CallStack {
    public static void main(String[] args) {
        int a = 10, b =20;
        Sum(a, b);
    }

    public static void Sum (int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    /*
     *  - In Java, Always the main() fn will be called first → creates a `stack frame` corresponding to main() function
     *  - Now, main() calls another fn named sum() → A new stack frame will be created correspoding to sum() fn & control will be immediately handed over to sum() fn
     *  - Now sum() fn will execute it’s own block of code & once it completes it’s fn execution → stack frame is removed from stack & control is handed over to caller fn [ which is main() fn ]
     *  - Now main() fn will executes it’s rest of the code after sum() → Once finally it is completed, it’s stack frame will also be removed from stack
     *  - After removing the main() from call stack → program will be terminated
    */
}