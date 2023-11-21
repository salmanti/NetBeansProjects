
package fainalevedence;

import java.util.Scanner;


public class Q1_conditionalSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    
        int sum=0;
        System.out.println("Enter any conditional sum :");
        
        while(true){
        int input=sc.nextInt();
            if (input==-1) {
                break;
                
            }
            sum+=input;
        }
        System.out.println("conditional sum :"+sum);
        
    }
    
}
