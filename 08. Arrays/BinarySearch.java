/*
 *                                      Lecture - 4
*/

/*
 *  Binary Search
    -------------
        - "Binary search" is a divide and conquer algorithm that searches for a specific element in a sorted array.
        - To use this algorithem, An Array must be Sorted [else use `Arrays.sort(arr)` ]
        - It uses the information that the array is sorted & reduces the TC to O(logn)
        - It works by repeatedly dividing the search interval in half until the target value is found or the interval is empty.
*/

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 8, 9, 12, 45, 52, 73 ,77, 89};
        int key = 75;

        System.out.println(binarySearchAlgo(arr, key));
    }

    /*
     *  Key Points:
     *      1. e must be (n-1) -> last element, but NOT n [ind out of bound]
     *      2. while (s <= e)
     *      3. careful with the if-else conditions
    */
    public static int binarySearchAlgo (int[] arr, int key) {
        Arrays.sort(arr);

        // strat & end indices
        int s = 0;
        int e = arr.length-1;

        while (s <= e) {
            // calculating mid ind for each iteration
            int mid = (s+e)/2;

            if(arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] > key) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }

        // If NO element is found
        return -1;
    }
}
