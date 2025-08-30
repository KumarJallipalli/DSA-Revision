/*
 *                                      Lecture - 2
*/

import java.util.Scanner;

public class SpiralMatrix {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        // Outer Spiral elements
        // outerSpiralElements1(arr);
        outerSpiralElements2(arr);

        scan.close();
    }

    /*
     *  Print the outer elements of a 2D matrix
     *  ex:         1   2   3   4
     *              5   6   7   8
     *              9   10  11  12  
     *              13  14  15  16
     * 
     *  o/p:        1   2   3   4               (0,0)   (0,1)   (0,2)   (0,3)
     *              5           8       ->      (1,0)                   (1,3)
     *              9           12              (2,0)                   (2,3)
     *              13  14  15  16              (3,0)   (3,1)   (3,2)   (3,3)
     * 
     *          ->  1   2   3   4   8   12  16  15  14  13  9   5
     * 
     *  Case-I
     *  - We can divide this further to 4 sets -> 
     *              1   2   3   ||  4   8   12  ||  16  15  14  ||  13  9   5
     *              0,0 0,1 0,2     0,3 1,3 2,3     3,3 3,2 3,1     3,0 2,0 1,0
     *  - The pattern here is : In any set only 1 variable/pointer is inc/dec
     *          top set     -> (0,0) (0,1) (0,2) -> j inc & i=0         -> i=0 && j=0 ; j<n-1; j++
     *          right set   -> (0,3) (1,3) (2,3) -> i inc & j=prevj+1   -> i=0; i<n-1; i++ && j=(n-1)
     *          bottom set  -> (3,3) (3,2) (3,1) -> j dec & i=previ+1   -> i=n-1 && j=n-1; j>0; j--
     *          left set    -> (3,0) (2,0) (1,0) -> i dec & j=prevJ-1   -> i=n-1; i>0; i-- && j=0
     *  - In alll the 4 sets, Starting & ending indices are always (0 & n-1)
     *          - Hence we define 4 variables to store these start & end of row & col
     *          - And then loop for each set/section
     *                  - top set          -> i=0 && j=0 ; j<n-1; j++
     *                  - right set        -> i=0; i<n-1; i++ && j=(n-1)
     *                  - bottom set       -> i=n-1 && j=n-1; j>0; j--
     *                  - left set         -> i=n-1; i>0; i-- && j=0
     * 
     *  NOTE:
     *      - This won't work in edge cases & need to wrku up a little
     *      - Hence we use different sets as explained in the class
     * 
     *  Case-II:
     *      - We can divide this alos to 4 sets, but this time
     *          1   2   3   4   ||  8   12  16  ||  15  14  13  ||  9   5
     * 
     *      top set     -> (0,0) (0,1) (0,2) (0,3)      -> i=0                  && j=0; j<=n-1; j++
     *      right set   -> (1,3) (2,3) (3,3)            -> i=0+1; i<=n-1; i++    && j=n-1
     *      bottom set  -> (3,2) (3,1) (3,0)            -> i=n-1                && j=n-2; j>=0; j--
     *      left set    -> (2,0) (1,0)                  -> i=n-2; i>0; i--      && j=0
    */
    public static void outerSpiralElements1 (int[][] arr) {
        // int rowStart = 0;
        // int colStart = 0;
        // // Since 0-based index
        // int rowEnd = arr.length-1;
        // int colEnd = arr[0].length-1;

        // // top set          -> i=0 && j=0 ; j<n-1; j++
        // for (int j=colStart; j<colEnd; j++) {
        //     System.out.print(arr[rowStart][j] + " ");
        // }

        // // right set        -> i=0; i<n-1; i++ && j=(n-1)
        // for (int i=rowStart; i<rowEnd; i++) {
        //     System.out.print(arr[i][colEnd] + " ");
        // }

        // // bottom set       -> i=n-1 && j=n-1; j>0; j--
        // for (int j=colEnd; j>0; j--) {
        //     if (rowStart == rowEnd) return;
        //     System.out.print(arr[rowEnd][j] + " ");
        // }

        // // left set         -> i=n-1; i>0; i-- && j=0
        // for (int i=rowEnd; i>0; i--) {
        //     if (colStart == colEnd) return;
        //     System.out.print(arr[i][colStart] + " ");
        // }
    }

    public static void outerSpiralElements2 (int[][] arr) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = arr.length-1;
        int colEnd = arr[0].length-1;

        // top row      -> i=0  && j=0; j<=n-1; j++
        for (int j=colStart; j<=colEnd; j++) {
            System.out.print(arr[rowStart][j] + " ");
        }

        // right column  -> i=0+1; i<=n-1; i++    && j=n-1
        for (int i=rowStart+1; i<=rowEnd; i++) {
            System.out.print(arr[i][colEnd] + " ");
        }

        // bottom row  -> i=n-1 && j=n-2; j>=0; j--
        for (int j=colEnd-1; j>=colEnd; j--) {
            // for single row array case
            if (rowStart == rowEnd) break;
            System.out.print(arr[rowEnd][j] + " ");
        }

        // left column  -> i=n-2; i>0; i--      && j=0
        for (int i=rowEnd-1; i>=rowStart+1; i--) {
            // for single column array cases 
            if (colStart == colEnd) break;
            System.out.print(arr[i][colStart] + " ");
        }
    }


    /*
     *  Print All Spiral Elements
     * 
     *  ex:     1   2   3   4
     *          5   6   7   8       
     *          9   10  11  12
     *          13  14  15  16
     * 
     *  o/p     1   2   3   4           
     *          5           8       +   6   7
     *          9           12          10  11
     *          13  14  15  16
     * 
     *      =>  1   2   3   4   8   12  16  15  14  13  9   5   6   7   11  10
     *  - First we will print the outer spiral elements as in above problem
     *  - Then we will print the inner spiral elements & son on..
    */
    public static void spiralMatrix (int[][] arr) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = arr.length-1;
        int colEnd = arr[0].length-1;

        // condition for spiral looping
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // top row
            for (int j=colStart; j<=colEnd; j++) {
                System.out.print(arr[rowStart][j] + " ");
            }

            // right column
            for (int i=rowStart+1; i<=rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
            }

            // bottom row
            for (int j=colEnd-1; j>=colStart; j--) {
                // for single row array case in inner loops
                if (rowStart == rowEnd) break;
                System.out.print(arr[rowEnd][j] + " ");
            }

            // left column
            for (int i=rowEnd-1; i>=rowStart+1; i--) {
                // for single column array cases 
                if (colStart == colEnd) break;
                System.out.print(arr[i][colStart] + " ");
            }

            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
    }


    // print 2D array
    public static void priint2DArray (int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}