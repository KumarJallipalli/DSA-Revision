/*
 *                              Lecture - 4
*/

/*
 *  Search in a Sorted Matrix:
 *      Sorted Matrix -> Sorted in both row wise & column wise
 * 
 *  ex:     10  20  30  40
 *          15  25  35  45
 *          27  29  39  48
 *          32  33  39  50
 * 
 *  Sol - 1: Brute Force
 *      - We can search using 2 for loops -> O(n^2)
 * 
 *  Sol - 2: Binary search in each row 
 *      - Since n rows -> O(nlogn)
 * 
 *  Sol - 3: StairCase O(n+m)
 *      - We will be having 2 unique elements in the whole matrix -> [0, m-1] && [n-1, 0]
 *      - Let's take [0, m-1] -> we cannot go "up or right" as there are No elements 
 *      - So, we can go only in 2 directions -> left (or) down
 *      - Since it is sorted, if (key > curr) -> go down, 
 *              - since right & down elemnts are always greater, but earlier we came from right only
 *      - else -> go left, 
 *              - since left & up elements are always smaller, but earlier we came from up only
 * 
 * ex: key = 32 And arr is above mentioned array
 *      1st iteration   ->  32 < 40 -> go left  => [0, m-1-1] => 30
 *      2nd iteration   ->  32 > 30 -> go down  => [1, m-2] => 35
 *      3rd iteration   ->  32 < 35 -> go left  => [1, m-2-1] => 25
 *      4th iteration   ->  32 > 25 -> go down  => [2, m-2-1] => 29
 *      5th iteration   ->  32 > 29 -> go down  => [3, m-2-1] => 33 => (Found)
 *          -> exit the loop
 *      
 *  - These iterations forms a StairCase, hence staircase problem
*/

import java.util.Scanner;

public class MatrixSearch {
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

        scan.close();
    }


    public static boolean stairCase (int[][] arr, int key) {
        // Index of special; element
        int i = 0;
        int j = arr[0].length-1;

        while (i < arr.length && j >= 0) {
            if (arr[i][j] == key) {
                return true;
            }
            else if (key > arr[i][j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }
}
