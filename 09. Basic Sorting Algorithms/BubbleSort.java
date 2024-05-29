/*
 *                                  Lecture - 1
*/

/*
 *  Bubble Sort

    - In a Soda Water (or) Boiling Water, gas bubbles can be seen
    - Those bubbles starts smaller in size at the bottom & goes on increasing as it reaches the surface surface
    - This Bubble Sort is based on the same principle
        - In every iteration, the Largest Element will be moved [ from start ] to the end of array by swapping with the adjacent elements
*/

/*
 * It is a comparison-based sorting algorithm in which each element is compared with the next element, and is swapped if those elements are not in the correct order.

    Steps:
        - First, we will take starting two elements from the list.
        - Then we will compare those elements. & if 1st elemenet is gretaer than 2nd element, we will swap
        - Else we will compare next to elements.
        - We will repeat the previous steps until we get our sorted array.
*/

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };

        bubbleSort(arr);
        printArray(arr);
    }

    // Bubble Sort COde
    public static void bubbleSort (int[] arr) {
        // This is for optimised version of Bubble Sort
        boolean swapped = false;

        /*
         *  Outer loop -> how many times we need to run the loop to sort the array
         *      - Every array requires (n-1) turns to sort all the elements
         *              - Not n times -> Since we are comparing 2 elements at one time
         *              - Hence, last turn/loop sorts 2 elements in a single go
        */
        for (int i=0; i<arr.length-1; i++) {
            // Inner loop moves the largest element to end
            for (int j=0; j<arr.length-1-i; j++) {
                if ( arr[j] > arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            // swapped === false -> return [ Since array is already sorted ]
            if (!swapped)
                return;
        }
    }

    public static void printArray (int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
