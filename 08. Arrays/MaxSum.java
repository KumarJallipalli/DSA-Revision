/*
 *                                  Lecture - 8
*/

public class MaxSum {

    public static void main(String[] args) {
        int[] arr = { -4, -1, 2, -7, 3, 4 };

        minMaxSubArrays(arr);
        prefixArrayMethod(arr);
        bruteForce(arr);
        kadanesAlgo(arr);
    }

    // Find the sum of each sub-array & find the max & min of those sum
    public static void minMaxSubArrays(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // Reseting the sum variable after each calculation of the subarray sum
                sum = 0;

                // Sum of each sub array
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                // System.out.println(sum);

                // updating the max & min varibales
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
        }

        System.out.println("Min of the sum of each subarray: " + min);
        System.out.println("Max of the sum of each subarray: " + max);
    }


    // 2.1 MaxSubarraySum --> Prefix Array Method
    public static void prefixArrayMethod (int[] arr) {
        int n = arr.length;
        int prefix[] = new int[n];

        // Initiating 1st ind manually, since formula throws out of bound error
        prefix[0] = arr[0];
        for (int i=1; i<n; i++) {
            prefix[i] = arr[i] + prefix[i-1];
        }

        /*
         *        arr = {1, -2, 6, -1, 3};
         *        prefixArray = {1, -1, 5, 4, 7};
         *  Now, calculating the sum of each subarray using prefix array
         *      - Subarray between ind 2 & 4 --> {6, -1, 3} == 8
         *      - using prefix Array
         *              1       -1      5       4       7
         *                              2               4
         *          sum of subarray = prefix[4] - prefix[1] = 7 - -1 == 8
         * 
         *  HOW..?
         *      - Cuzz, If we require sum[2, 4] we do prefix[4] - prefic[1], but not prefix[4] - prefix[2]
         *      - Since, prefix[2] contains the element we need to add in the sum
         *      - Ex:
         *      - prefix[4] = sum of all elements until & including ind 4 => 1 + -2 + 6 + -1 + 3 
         *      - But we only need sum of  "6 + -1 + 3" => remove "1 & -2" from predix[4]
         *                  => WKT, sum of 1 & -2 == prefix[1] 
         *                  => sum == prefix[4] - prefix[1]
         *      - when we connvert into indices => sum [1, 4] == prefix[4] - prefix[2-1]
         *  
         *  In Genraly, Sum of any subarray between indices i & j = prefic[j] - prefix[i-1]
         * 
         *  What happens when i = 0
         *      - Then, we don't need to subtract the previous elements, As there are NO previous elements
         *      - Hecne sum[i, j] = prefix[j]    
        */

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                
                // Actual sum of each subarray using prefix arrays
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i-1];
                }

                // updation of maxSum variable
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Max Sum of all the subarrays using PrefixArray : " + maxSum );
    }


    // 2.2 MaxSubarraySum --> Brute force O(n^2)
    public static void bruteForce (int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i=0; i<n; i++) {
            sum = 0;
            for (int j=i; j<n; j++) {
                sum = sum + arr[j];

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Max sum of all sub arrays using Brute Force : " + maxSum);

    }


    // 3 MaxSum -> Kadane's Algorithm
    public static void kadanesAlgo (int[] arr) {
        /*
        *  Kadane's Algo
        *      - If we add any -ve number to an existing number [ either +ve (or) -ve ], It will definitely Decrease the total sum
                - f we add any +ve number to an existing number [ either +ve (or) -ve ], It will definitely Increasethe the total sum
                - Based on this only, Kadane’s Algorithm is developed
                    - If previous sum < 0, make it 0 & add to current element to get the max sum
        */

        /*
         *      int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
         * 
         *  - Start from 1st element
         *  - Make 2 variables, currSum -> to cal the Max sum until current index && MaxSum -> To cal maxSum
         *  - Use a pointer i, to iterate over each element to fing out the max sum until that element
         *  - At any point, if currSum < 0 -> make currSum = 0
         * 
         *          -2      -3      4       -1      -2      1       5       -3      currSum     MaxSum    
         *      0    i                                                              -2 -> 0        0 
         *      1            i                                                      -3 -> 0        0
         *      2                   i                                               0+4 = 4        4
         *      3                            i                                      4-1 = 3        4
         *      4                                    i                              3-2 = 1        4
         *      5                                           i                       1+1 = 2        4
         *      6                                                   i               2+5 = 7        7
         *      7                                                            i      7-3 = 4        7
         * 
         *  - MaxSum of the subarray until ind 2 -> [-2, -3, 4] == 4 [by only 1 element -> 4]
         *  - MaxSum of the subarray until ind 6 -> [-2, -3, 4, -1, -2, 1, 5] == 7 [ by adding "4, -1, -2, 1, 5" ]
         *  - Overall MaxSum = 7
        */

        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<n; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
            }

            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }

        System.out.println("Max sum of all sub arrays Kadane's Algo : " + maxSum);        
    }
    /*
     *  NOTE:
     *          1. Kadane's Algo doesn't works if all the elemenst are -ve
     *          2. Try to find out the 
     *                  a. indices  of MaxSum subarray &
     *                  b. print the Max subarray elements
    */

}
