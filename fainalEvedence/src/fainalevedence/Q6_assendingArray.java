
package fainalevedence;

import java.util.Arrays;
import java.util.Collections;


public class Q6_assendingArray {
    //assending order
//    public static void main(String[] args) {
//        int []arr={5,2,8,1,9};
//        
//        Arrays.sort(arr);
//        System.out.println("Asscending order :"+Arrays.toString(arr));
//    }
//    
    
//    or disendeing order
    
    public static void main(String[] args) {
        Integer[]arr={5,2,8,1,9};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Desending order :"+Arrays.toString(arr));
    }
}
