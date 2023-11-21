
package fainalevedence;

import java.util.HashSet;
import java.util.Set;



public class Q12_RandomNumber {
    public static void main(String[] args) {
        Set<Integer>arr=new HashSet<>();
        for(;;){
        int ran=(int)(Math.random()*100);
        arr.add(ran);
        if(arr.size()==10){
        break;
        }
        }
    }
    
}
