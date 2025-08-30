/*
 *                          Lecture - 4
*/

/*
 *  Counting Sort

        - Counting Sort is a non-comparison-based sorting algorithm*
        - Counting Sort → Sorts the aary based on the frequency of each distinct element*
        - Counting Sort is said to work only for a limited range of non-negative integer values
            - i.e., elements must be Integers, non -ve & limited range
*/

/*
 *  Steps:
        - Original array → [ 2, 3, 0, 2, 3, 2]
        - find the max element from the array → 3
        - create count array with size = max+1 → count array = new int[4];
        - count the frequency of each distnct element & update in the count array with it’s corresponding indices → there are three 2’s ⇒ put 3 in index 2
        - count array = [ 1, 0, 3, 2 ]
        - Now based on the count array & it’s values, create the sort array → sort array = [0, 2, 2, 2, 3, 3]
*/

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 12, 1, 5, 5, 3, 9};
        countSort(arr);
        printArray(arr);
    }

    // Count sort Algo
    public static void countSort (int[] arr) {
        // Step-1: find the max element in the array
        int maxElement = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        // Step-2: create a new freq array & add frequencies
        int[] freq = new int[maxElement + 1];
        for (int i=0; i<arr.length; i++) {
            freq[arr[i]]++;
        }

        // Step-3: using freq array fill & sort the original array
        // i -> to keep track of indices of original array
        int i = 0;

        // to iterate over each element of freq array
        for (int j=0; j<freq.length; j++) {
            // to iterate over frequencies
            while (freq[j] > 0) {
                arr[i] = j;
                i++;
                freq[j]--;
            }
        }
    }
    /*
     *  Why we take size of freq array as max+1..?
            → WKT, count sort only works on non -ve integers
            → If we fount the max element, then range would be 0 to max
            → hence size would be max + 1 → where +1 is for “0”
    */

    public static void printArray (int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
