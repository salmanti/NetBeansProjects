
package fainal_evidence;

import java.util.Arrays;


public class TwoDayArray {

    private static Iterable<Integer[]> arrays;
    public static void main(String[] args) {
        int[][]array2D={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        
        };
            System.out.println("Assending arrays: ");
        for (Integer[] val : arrays) {
            Arrays.sort(val);
            System.out.println(Arrays.toString(val));
        }
        
    }
    
}
