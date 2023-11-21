
package fainal_evidence;

import java.util.Arrays;

public class arraySum {
    public static void main(String[] args) {
        int[]arr={2,5,6,3,4};
        int sum=0;
        System.out.println("The array  :"+Arrays.toString(arr));
        
        for (int n:arr) {
            sum+=n;
            
        }
        System.out.println(" sum :"+sum);
    }
    
}
