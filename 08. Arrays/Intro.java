/*
 *                                  Lecture - 1
*/


/*
 *  ARRAYS:
 *      - Arrays → Collection/Group of simillar type of elements, stored in contiguous memory location
 *      - Arrays are used to store multiple values in a single variable
 *      - Size of the array is static & must be pr-defined
*/

public class Intro {
    public static void main(String[] args) {
        // Syntax of an Array
        int arr[] = new int[5];
        int numbers[] = {1, 21, 3, 4};
        /*
        *  new → Allocates memory for the array
        *  Size of the array must be predefined inside the []
        *  By defaut, Each & Every element of the array will be initialized by default value of it’s type
        */

        // insertion -> We can insert an element into an array using it’s index
        arr[0] = 1;
        arr[1] = 2;

        // accessing the array elemets -> We can access any array elements using the same index
        System.out.println(arr[1]);
        System.out.println(arr[0]);

        // Updation -> We can Updateany any Array element using it’s index
        arr[0] = 10;
        arr[1] = 11;

        // length -> we can find the size of an array using "length"
        System.out.println(arr.length);
        System.out.println(numbers.length);
    }
}
