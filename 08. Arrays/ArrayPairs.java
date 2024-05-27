/*
 *                          Lecture - 6
*/

public class ArrayPairs {
    public static void main(String[] args) {
        /*
         *  Print all the pairs that can be formed with the elements of an array
         *      arr = {2, 4, 6, 8 ,10}
         *      ans = (2, 4) (2, 6) (2, 8) (2, 10)
         *            (4, 6) (4, 8) (4, 10)
         *            (6, 8) (6, 10)
         *            (8, 10)
        */
        int[] arr = {2, 4, 6, 8, 10};
        printPairs(arr);
    }

    public static void printPairs (int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    /*
     *  Total No. of pairs = sum of (n-1) terms == n*(n-1)/2
    */
}
