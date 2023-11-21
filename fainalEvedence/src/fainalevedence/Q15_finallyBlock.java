
package fainalevedence;

import java.util.Scanner;


public class Q15_finallyBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        try{
        int x,y,result;
        
         x =sc.nextInt();
         y =sc.nextInt();
         result =x/y;
         
            System.out.println(" Random of the result"+ result);
        }catch(ArithmeticException e){
            System.out.println("Exception "+e.getMessage());
        
        }finally{
            System.out.println("Continue Execution");
        }
        
        
    }

    
    
}
