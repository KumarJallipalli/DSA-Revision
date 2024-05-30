/*
 *                                  Lecture - 3
*/

/*
 *  Diagonal Sum of a Matrix:
 *      - Sum of both diagonal elements
 * 
 *  ex: n= 5        1   2   3   4   5           n=4     1   2   3   4
 *                  5   6   7   8   9                   5   6   7   8
 *                  10  11  12  13  14                  9   10  11  12
 *                  15  16  17  18  19                  13  14  15  16
 *                  20  21  22  23  24  
 *     sum = (1+6+12+18+24) + (5+8+12+16+20) - 12       Sum = (1+6+11+16) + (4+7+10+13)
 *              = 61 + 61 -12                               = 34 + 34
 *              = 110                                       = 68
*/          

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        diagonalSum(arr);

        scan.close();
    }

    public static int bruteForce (int[][] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                if (i==j) {
                    sum += arr[i][j];
                }
                else if (i+j == arr.length-1) {
                    sum += arr[i][j];
                }
                // in the baove code, we donlt have to add a special cond due to else if cond
            }
        }
        return sum;
    }

    public static int diagonalSum (int[][] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i=0; i<n; i++) {
            // when i == j
            sum += arr[i][i];
            // when i != j [we haven't declared j, hence used formula]
            if (i != n-1-i) {
                sum += arr[i][n-1-i];
            }
        }

        return sum;
    }

}