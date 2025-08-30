/*
 *                              Lecture - 3
*/

/*
 *  Insertion Sort
        - Inspiration
            - How we used to arrange cards in a 13 card game..!
            - We will pick any random card & place it in the correct position in the sorted cards
*/

/*
 * Steps:
    - we assume the 1st element to as sorted by default, remaining elements as unsorted
    - We selct the 1st element from unsorted array & place it in the correct position in the sorted array
    - How we do that..?
        - we take the 1st element from unsorted array arr[i] & store it in temporary variable curr
        - Now, we travers in the backward direction in the sorted array & find whether the curr element arr[i] is smaller than the sorted element arr[j]
        - If arr[i] < arr[j] → we push the element arr[j] to one position right & so on..
        - Finally place the curr element in it’s correct position → all elements in correct position
            - Since, we are always comparing the current element with previous element, correct position will be one position right
    - repeat the same steps
*/

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 }; 
        insertionSort(arr);
        printArray(arr);
    }

    /*
     *          5       4       1       3       2
     *  - Assume the sorted array as [5] && unsorted array as [4, 1, 3, 2]
     *  - Now we will select 1st element from unsorted & try to place it in correct positio inside sorted array
     *          5       4       1       3       2
     *  - Compare 4 with 5, As 5 > 4 store/push 5 to it's next index & ind--
     *          5       5       1       3       2
     *  - Now, we have reached either end of start (or) ele from sorted is less than curr, hence replace start with curr
     *          4       5       1       3       2
     *  - Reapeat the same steps
     *          4       5       ||      1       3       2
     *                                  ^
     *          4       5       ||      5       3       2
     *          4       4       ||      5       3       2
     *          1       4       5       ||      3       2   reached end of start (or) ele from sorted is less than curr
     *                                          ^
     *          1       4       5       ||      5       2
     *          1       4       4       ||      5       2
     *          1       3       4       5       ||      2   reached end of start (or) ele from sorted is less than curr
     *                                                  ^
     *          1       3       4       5       ||      5
     *          1       3       4       4       ||      5
     *          1       3       3       4       ||      5
     *          1       2       3       4       5           reached  end of start (or) ele from sorted is less than curr
     */

    public static void insertionSort (int[] arr) {
        // outer loop -> select each 1st element from unsorted array
        for (int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prevInd = i-1;   

            // Inner loop -> to find the correct position
            while (prevInd>=0 && (arr[prevInd] > curr)) {
                // If not the correct position, then pushes/stores the ele from prevInd into next ind
                arr[prevInd + 1] = arr[prevInd];
                prevInd--;
            }

            // Inserting the curr element at correct position
            arr[prevInd + 1] = curr;
        }
    }

    public static void printArray (int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
