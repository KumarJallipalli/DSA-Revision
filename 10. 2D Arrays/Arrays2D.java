/*
 *                                  Lecture - 1
*/

/*
 *  2D Array -> An Array within another array
 *      ex: int[][] arr = { {1, 2, 3}, {3, 4, 5}};      --> 2D array
 *      ex: int[][][] arr = { {1, {2, -2}, 3}, {3, {4, -4}, 5}};    -> 3D array
*/

/*
 * 2D Arrays in Memory

    - WKT, in a 1D array → elements are stored contiguously → `[ 1004, 1008, 1012, 1016, 1020 ]` where each element represents address
    - So, if we have 2D arrays, we will have rows & columns.
    - Then how are these 2D arrays is stored in memory..?
        - There are two main techniques of storing 2D array elements into memory
        - Row major
            - All the rows of the 2D array are stored into the memory contiguously
            - 1st row is stored in a contiguous memory simillar to 1D array, Now immediately 2nd row will be stored in a contiguous memory & so on..
        - Column major
            - All the columns of the 2D array are stored into the memory contiguously
            - 1st column is stored in a contiguous memory simillar to 1D array, Now immediately 2nd column will be stored in a contiguous memory & so on..

    But, 2D Arrays in java doesn’t use neither of the above 2 techniques
        - In Java, A 2D array is actually an array of object references, each of which points to a 1D array
        - Hence, 2D Arrays in Java are called as arrays of arrays.
        - Each element of the outer array has a reference to each inner array.
*/

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();

        // 2D array definition
        int[][] arr = new int[rows][cols];

        // 2D array initialization
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        // printing 2D array
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        // Printing max & min elements from the 2D Array
        maxMin(arr);

        scan.close();
    }

    public static void maxMin (int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int min = arr[0][0], max = arr[0][0];
        int[] minInd = {0, 0}, maxInd = {0, 0};

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxInd[0] = i;
                    maxInd[1] = j;
                }

                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minInd[0] = i;
                    minInd[1] = j;
                }
            }
        }

        System.out.println(" Max Element is: " + max + " at [" + maxInd[0] + ", " + maxInd[1] + "]");
        System.out.println(" Max Element is: " + min + " at [" + minInd[0] + ", " + minInd[1] + "]");
    }
}
