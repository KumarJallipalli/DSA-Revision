/*
 *                              Lecture - 3
*/


/*
 *  Linear Search
 *  -------------
        - **Linear Search** is defined as a **sequential search algorithm**
        - **Linear Search** is a method for searching an element in a collection of elements.
            - It starts at one end and goes through each element of a list/array until the desired element is found,
            - If desired element is NOT found, then the search continues till the other end of the list/array.
        - TC = O(n)
        - It is a well-suited algorithm for small datasets stored in contiguous memory.
*/

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {51, 8, 9, 12, 35, 46, 2, 75, 66};
        int key = 52;

        // Linear Search Algo
        int index = lineaSearchAlgo(arr, key);
        if(index == -1) {
            System.out.println("Key was NOT found in the array");
        } else {
            System.out.println("Key was Found at Index: " + index);
        }

        // Max Element
        largestElement(arr);
    }

    // Leaner Seacrh Algorithm
    public static int lineaSearchAlgo (int[] arr, int key) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Q. LargestNumber in the array
    public static void largestElement (int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
