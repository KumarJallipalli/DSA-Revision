/*
 *                                      Lecture - 7
*/


/*
 *  Subarray:
 *      - A subarray is a "contiguos part of an array"
 *      - i.e., a subarray is an array which is inside another array
 *      - Even a single element is considered to be a sub-array
*/

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {2, -4, 6, -8, 10};
        subArrays(arr);
    }

    /*
     *  Subarray -> brute-force
     *      arr = {2, 4, 6, 8, 10}
     *      1. place the start & end pointer & print all the elements in between
     *              2       4       6       8       10
     *             s,e
     *          Subarray --> [2]
     *      2. Now move the end pointer by 1 place & print all the elements in between s & e
     *              2       4       6       8       10
     *              s       e
     *          subarray --> [2, 4]
     *      3. Move the pointer again by 1 place & print all the elements in between s & e
     *              2       4       6       8       10
     *              s               e
     *          subarray --> [2, 4, 6]
     *      4. Repeat the same until end point is at the last index
     *              2       4       6       8       10
     *              s                               e
     *          subarray --> [2, 4, 6, 8, 10]
     *      5. Now move the start point by 1 palce & repeat the whole process again
     *          i.e., print all the elements in between s & e by moving only end point by 1 place
     *              2       4       6       8       10
     *                     s,e
     *          Subarray --> [4]
    */
    public static void subArrays (int[] arr) {
        // This outer loop is to point out the Start points of each subarray
        for (int i=0; i<arr.length; i++) {
            // This middle loop is to point out the End points of each subarray
            for (int j=i; j<arr.length; j++) {
                // This inner loop is to actually print the SubArray between start & end points
                for (int k=i; k<=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
