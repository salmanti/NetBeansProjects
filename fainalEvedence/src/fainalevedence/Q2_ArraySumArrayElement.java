
package fainalevedence;

import java.util.Arrays;


public class Q2_ArraySumArrayElement {
    public static void main(String[] args) {
        int[]array={2,4,6,8,10};
        int sum=0;
        System.out.println("the array :"+Arrays.toString(array));
        
        for (int n:array) {
            sum+=n;
        }
        System.out.println("\nsum: "+sum);
        prinArr(array);
    }

    public static void prinArr(int[] array) {
        System.out.println(" ");
        for (int i : array) {
            System.out.print( i +" ");
            
        }
    }
    
}
