/*
 *                                  Lecture - 5
*/

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 6, 1, -4, 58, 42, -06, 88, 10};

        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }   

    /*
     *  Reverse an Array:
     *      arr = {4, 8, 2, 6, 1}
     *      - We will use 2 pointer namely s & e being start & end
     *              4       8       2       6       1
     *              s                               e
     *      - Now, we swap these 2 elements with indices s & e. 
     *      - then increase s by 1 && decrease e by 1 -> So that they will move to new elements
     *              1       8       1       6       4
     *                      s               e       
     *      - swap && move s, e positions
     *              1       6       1       8       4
     *                             s,e
     *      - No need to swap -> exit
    */
    public static void reverseArray (int[] arr) {
        int s = 0;
        int e = arr.length-1;

        // When s==e, we don't have to swap
        while (s < e) {
            // Swapping
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }

    // Print Array
    public static void printArray (int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        } 
        System.out.println();
    }
}
