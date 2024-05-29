/*
 *                                  Lecture -2
*/

/*
 *  Selection sort
 *      - It repeatedly selects the smallest (or largest) element from the unsorted portion of the array and moves it to the sorted portion of the array.
        - Pick the smallest element from unsorted array & swap it with the 1st element of the unsorted array
        - In this way, a new sorted array will be created at the beginning of the array, while the unsorted will be at the end of the array
*/

/*
 *  Steps:
        1. Outer loop → to point the 1st element in the unsorted array
        2. inner loop → to traverse the unsorted array & find the min element
        3. swap the min element with the 1st element in unsorted array
        4. repeat above steps until array is sorted
*/

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };

        System.out.println("Array Before Sorting:");
        printArray(arr);

        // System.out.println("Array after sorting with defected Algo:");
        // selectionSort(arr);
        // printArray(arr);

        System.out.println("Array After Sorting with Actual 'Selection Sort' Algo:");
        actualSelectionSort(arr);
        printArray(arr);
    }

    // This isn't the actual algorithm
    public static void selectionSort (int[] arr) {
        // Outer loop -> tracks the 1st position of unsorted array
        for ( int i=0; i<arr.length; i++) {
            int min = arr[i];
            // Iner loop -> finds the min element from unsorted array
            for (int j=i; j<arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                }
            }

            // Swapping the min element with 1st element from unsorted array
            int temp = arr[i];
            arr[i] = min;;
            min = temp;
        }
    }
    /*
     *      arr = {5, 4, 1, 3, 2}
     * 
     *              5       4       1       3       2       
     *              i              min                      Result ->  1   4   1   3   2
     *          
     *              1       4       1       3       2       
     *                      i      min                      Result ->  1   1   1   3   2
     *          
     *              1       1       1       3       2       
     *                            i, min                    Result ->  1   1   1   3   2
     *          
     *              1       1       1       3       2       
     *                                      i      min      Result ->  1   1   1   2   2
     *          
     *              1       1       1       3       2       
     *                                             i,min    Result ->  1   1   1   2   2  
     * 
     *  Solution:
     *      - Here, we are swapping a min variable with 1st element from unsorted
     *      - But we need to actually swap the min element with 1st element from unsorted
     *      - Hence, instead of going for min element -> we need index of min element
     *      - With index, we can actually swap the elements from the unsorted array           
    */

    // This is the actual algorithm
    public static void actualSelectionSort (int[] arr) {
        // Outer loop -> tracks the 1st position of unsorted array
        for ( int i=0; i<arr.length-1; i++) {
            int minIndex = i;
            // Iner loop -> finds the Index of min Element from unsorted array
            for (int j=i+1; j<arr.length; j++) {        // if j=i, we will be comparing minInd with minInd
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swapping the minIndex element with 1st element from unsorted array
            int temp = arr[i];
            arr[i] = arr[minIndex];;
            arr[minIndex] = temp;
        }
    }

    public static void printArray (int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
