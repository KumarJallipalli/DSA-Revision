/*
 *                                  Lecture - 9 
*/


/*
 *  - Rain water trapped is decided by only 3 variables
            1. Water Level → Only unknown variable [ Hence, to be formulated ] 
            2. Height → Given in the array
            3. width → Always 1 

    - Array elements represent height of bars
        - No. of elements == No. of bars
    1. If there is only 1 bar (or) 2 bars → No water can be trapped [ As water will spilled outwards ]
        - Size of array must be > 2 ⇒ `arr.length > 2`
    2. Similarly, if height of all the bars is either in ascending or descending order, Then also, rain water will be spilled
        - Asc/Desc heights of bars → No water tapping ⇒ Sorted Arrays → No water
    3. Water will only get trapped, if there are bars on both the sides of the current bar whoose heights is greater than the height of current bar
        - Then the Trapped water height will be min of the both the bars → WL [ water level ] = min ( Left, Right )
        - But if either sides of the bar has greater height bars which might NOT be an immediate neighbour of the current bar, Then WL depends on those as well as shown in the above pic
        - Finally, Unknown varibale  `WL = min ( max Left, max Right )`

    To calculate the max Left & max Right, we will use helper/Auxillary Arrays as shown below
        - For Max Left, We iterate from left AND compare the previous element’s Max height with current height & update
        - For Max Right, We iterate from Right AND compare the previous element’s Max height with current height & update
*/

public class RainWaterTrapped {
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        trappedRainWater(height);
    }

    public static void trappedRainWater (int[] arr) {
        int n = arr.length;
        // WL = min (Max Left Boundary, Max Right Boundary)
        int[] MLB = new int[n];
        int[] MRB = new int[n];

        // Max Left Boundary code
        MLB[0] = arr[0];
        for (int i=1; i<n; i++) {
            if (arr[i] > MLB[i-1]) {
                MLB[i] = arr[i];
            }
            else {
                MLB[i] = MLB[i-1];
            }
        }

        // Max Right Boundary code
        MRB[n-1] = arr[n-1];
        for (int i=n-2; i>=0; i--) {
            if (arr[i] > MRB[i+1]) {
                MRB[i] = arr[i];
            }
            else {
                MRB[i] = MRB[i+1];
            }
        }

        // Actual Code to calculate Trapped Water
        int trappedWater = 0;
        for (int i=0; i<n; i++) {
            int WL = Math.min(MLB[i], MRB[i]);
            trappedWater += WL - arr[i];
        }

        System.out.println("Trapped Rain Water is: " + trappedWater);
    }
}
