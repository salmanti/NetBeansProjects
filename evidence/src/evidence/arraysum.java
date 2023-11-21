
package evidence;

import java.util.Arrays;


public class arraysum {
    public static void main(String[] args) {
        int[] array={2,4,6,8,10};
        int sum=0;
        System.out.println("The array : "+Arrays.toString(array));
        
        for (int n : array) {
            sum+=n;
            
        }
        System.out.println("\nSum: "+sum );
    }
    
}
