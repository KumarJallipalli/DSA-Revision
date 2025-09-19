# 01. INTRO [ 15/09/2025 ]

---

## Course Overview

This Course is a 3-Step Process

1. Programming Language [ C++ ]
2. Data Structures & Algorithms [ with Q’s ]
3. Practice [ And Misc. → Projects, Theory Subjects, Resume, Interview Prep ]

<aside>
💡

The HARDER you work, 
The LUCKIER you get.

Consistency + Hard Work → Success

`Problems` → Opportunities to Learn

</aside>

## Software's Required

1. C++ Compiler → Install MinGW
2. VS Code
    - Extensions for VS Code
        - C/C++
        - Code Runner

---

## File Extension

- File Extension describes 2 things about the file
    1. Which Applications can run/execute/read this file
    2. Which Icon to display as the File Icon
- Java files uses `.java` as File Extension
- C++ files uses `.cpp` as File Extension

## Boilerplate Code

- `boilerplate code` → sections of code that are repeated in multiple places with little to no variation
    - This is the standard format/template of writing the code

```cpp
#include <iostream>
using namespace std;

int main () {
    // Code
    return 0;
}
```

- `#include <iostream>` → **preprocessor directive**.
    - This line is executed by Preprocessor before compilation
    - It tells the compiler to include the **Input/Output Stream** library before actual compilation begins.
    - This library is necessary for input and output functions like `cout` (for printing) and `cin` (for reading input).
- `using namespace std;`
    - In C++, everything in the standard library (like `cout`, `cin`, `string`, etc.) is inside a **namespace** called `std`.
    - This line tells the compiler to use the **`std` namespace** so that you don’t have to write `std::cout`, `std::cin`, etc.
    - Without this line, you’d have to write: `std::cout << "Hello";`
- `int main () { ... }`
    - This is the **main function** — the **entry point** of any C++ program.
    - When your program runs, it starts execution from the `main` function.
    - `int` means this function returns an integer value to the operating system.
- `return 0;`
    - This tells the operating system that the program **finished successfully**.
    - Returning 0 is a standard way to indicate success.
- `;` → Statement Terminator
    - It describes the End of the Statement

## How Does Code Run ?

- Our Code file [ `.cpp` file → Human Readable Code ] will be converted to Executable [`.exe` file → Machine Code ]
- This Involves following steps:
    1. Compilation
        - C++ Compiler will execute/run the Human Readable Code
        - It does following things
            1. It Checks for Syntax Errors
            2. It Converts **your human-readable C++ code** into Low Level C**ode** 
            3. This Low Level Code File is called Object File (`.o` or `.obj`) which is NOT Executable
    2. Linking
        - The linker takes your object files and links them with **standard libraries** (like `iostream` for `cout`) and **other dependencies**.
        - It Generates a single **executable file** [ Which the Machine understands ]
    3. Execution
        - The operating system loads `.exe` file into memory.
        - The CPU starts executing it step-by-step from the `main()` function.

## Preprocessor Directive

- Directive → Statements/Instructions given to Compiler
- Preprocessor → Before Processing/Compilation
- `Preprocessor Directive` → Statements/Instructions to be processed by Preprocessor before Compilation
- All Preprocessor directives starts with `#`
- All Preprocessor directives are One Liners
- Ex:
    - `#include <iostream>`
    - `#`  → Preprocessor directive symbol
        - Tells the compiler that the following line should be handled by the **preprocessor** before actual compilation starts.
        - i.e., It Tells Compiler to process this line by Preprocessor before Compilation itself
    - `include` → Preprocessor directive Keyword
        - It tells the preprocessor to **include** the contents of another file in this file.
        - Similar to "Copy and paste the contents of the specified file here".
    - `<iostream>` → Header File
        - Header Files → Contains Pre-written code required to execute the program [ kind of Library ]
            - `<iostream>` → This file contains **declarations** for input and output stream objects like `std::cin`, `std::cout`, and `std::cerr`.
            - **Used for:** Handling input/output in C++
- Preprocessor Directives are used to Create Macros in C++
    - Macros → Symbolic Constants
    - Ex: `#define PI 3.14`

<aside>
💡

NOTE:

---

**Why the angle brackets `< >`?**

- It tells the compiler to look for the file in the **standard system directories** (NOT in the local project directory).
- Use `"` (double quotes) instead for custom or local header files (like `#include "myfile.h"`).
</aside>

## Why preprocessor directives don't have Statement terminator `;` ?

- WKT,
    - Preprocessor directives are **instructions to the preprocessor**
        - Hence**,** These are **NOT actual C++ code**.
        - So, The **C++ compiler** never sees them [ As it was executed before Compilation ]
    - Preprocessor directives follow different Syntax Rules

## Main Function

- It is the Starting point of Execution
    - `main()` is the **user-defined entry point [** but **not the real beginning** of the program's execution. Startup routine is real entry point ]
    - i.e., When your program runs, it starts execution from the `main` function.
- Any Program contains only ONE main function
- And it must be of `int` return type [ else compilation error ]

## Who calls `main()` function ?

- OS calls the main function [ indirectly ]
- OS loads the compiled program into memory
- OS then calls a **special function** (often called a **startup routine )**
    - This Startup routine is a function [ This is the Actual Entry point of C++ program ]
    - This startup routine is defined by C++ Runtime Environment
    - This startup routine does some setup tasks like:
        - Initializing global variables
        - Calling constructors for global/static objects
        - Setting up the runtime environment
        - Then it calls your `main()` function.

## Namespace

- `Namespace` → used to address Naming conflicts in C++
- 
- Ex:
    - If we include 3 libraries [ Header files ]
    - each of the library has a function called `calculate()`
        - A’s library `calculate()` function calculates addition
        - B’s library `calculate()` function calculates subtraction
        - C’s library `calculate()` function calculates Multiplication
    - Now if we use `calculate()` in main function, Compiler will be confused
    - Hence we use namespace like
        - A::calculate() [ Something like this ]
        - B::calculate()
        - C:calculate()
    - Now naming conflict is resolved & compiler will be able to execute code
    - And if we use A::calculate thousands of times in the code,
        - Then we have a better way to write using namespace [ to reduce redundancy ]
        - `using namespace A;`
- C++ standard library’s namespace is `std`
    - This line tells the compiler to use the **`std` namespace**
        - so that Every time you don’t have to write `std::cout`, `std::cin`, etc.
        - And you can only write `cout`, `cin` etc..

Program to print pattern

```cpp
#include <iostream>
using namespace std;

int main() {
    cout<< "****\n";
    cout<< "***\n";
    cout<< "**\n";
    cout<< "*";
    return 0;
}
```