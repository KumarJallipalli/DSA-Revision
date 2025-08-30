/*
 *                              Lecture - 2
*/

/*
 *  Arrays are passed/called by "reference"
            → Address of the array is passed
            → changes made will be made to original array
*/
public class ArrayReference {
    public static void main(String[] args) {

        int a = 10;     // to demo pass by value
        int marks[] = {50, 60, 70};     // to demo pass by reference

        // Before passing the array as an argument
        System.out.println(a);                  // 10
        for (int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");   // 50 60 70
        }
        System.out.println();

        // Passing the elements as Arguments & updating the array elements
        updateElements(marks, a);

        // After passing the array as an argument
        System.out.println(a);                  // 10
        for (int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");   // 70 80 90
        }

        /*
         *  We can see that array elements have been updated when passed as an argument
         *  Hence, the original copy of the elements are being passed when passsed as fn arguments
         *  This is called pass by reference 
         *      - here, address of 1st element of array is passed
        */
    }

    // function to update the array elements
    public static void updateElements (int[] arr, int a) {
        a = 20;
        for (int i=0; i<arr.length; i++) {
            arr[i] += 20;
        }
    }

}
